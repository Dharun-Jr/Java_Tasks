package chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private String username;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            System.out.println("Error while setting up client handler: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            username = reader.readLine();
            System.out.println(username + " has joined the server.");
            Server.broadcastMessage(username + " joined the chat!", this);

            String incomingMessage;
            while ((incomingMessage = reader.readLine()) != null) {
                Server.broadcastMessage("[" + username + "]: " + incomingMessage, this);
            }
        } catch (IOException e) {
            System.out.println(username + " lost connection.");
        } finally {
            closeEverything();
        }
    }

    public void sendMessage(String message) {
        if (writer != null) {
            writer.println(message);
        }
    }

    private void closeEverything() {
        Server.removeClient(this);
        if (username != null) {
            Server.broadcastMessage(username + " left the chat.", this);
            System.out.println(username + " disconnected.");
        }
        try {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            System.out.println("Could not close connections properly: " + e.getMessage());
        }
    }
}
