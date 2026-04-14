package chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 5000;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter your username to join the chat: ");
            String username = scanner.nextLine();
            writer.println(username);

            Thread receiveThread = new Thread(() -> {
                try {
                    String messageFromServer;
                    while ((messageFromServer = reader.readLine()) != null) {
                        System.out.println(messageFromServer);
                    }
                } catch (IOException e) {
                    System.out.println("Connection to the server was lost.");
                }
            });
            receiveThread.start();

            while (true) {
                String messageToSend = scanner.nextLine();
                if (messageToSend.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.println(messageToSend);
            }

            socket.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("Unable to connect to the server: " + e.getMessage());
        }
    }
}
