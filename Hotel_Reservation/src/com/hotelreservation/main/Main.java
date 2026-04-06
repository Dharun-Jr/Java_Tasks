package com.hotelreservation.main;

import com.hotelreservation.service.HotelService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("***********************************");
        System.out.println("* Welcome to Hotel Reservation System *");
        System.out.println("***********************************");

        while (choice != 6) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Create customer account");
            System.out.println("2. Add a new room");
            System.out.println("3. View all rooms");
            System.out.println("4. Book a room");
            System.out.println("5. View all reservations");
            System.out.println("6. Exit program");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input! Please type a number.");
                sc.nextLine();
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter Customer ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Full Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Email Address: ");
                String email = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();

                service.createAccount(id, name, email, phone);
            } 
            else if (choice == 2) {
                System.out.print("Enter Room Number: ");
                String roomNum = sc.nextLine();
                System.out.print("Enter Room Type (Single/Double/Suite): ");
                String type = sc.nextLine();
                System.out.print("Enter Price per night: ");
                
                double price = 0.0;
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                    sc.nextLine();
                    service.addRoom(roomNum, type, price);
                } else {
                    System.out.println("Invalid price! Room not added.");
                    sc.nextLine();
                }
            } 
            else if (choice == 3) {
                service.viewAllRooms();
            } 
            else if (choice == 4) {
                System.out.print("Enter Customer ID: ");
                String custId = sc.nextLine();
                System.out.print("Enter Room Number to book: ");
                String roomNum = sc.nextLine();
                System.out.print("Enter duration of stay (in nights): ");
                
                if (sc.hasNextInt()) {
                    int nights = sc.nextInt();
                    sc.nextLine();
                    service.bookRoom(custId, roomNum, nights);
                } else {
                    System.out.println("Invalid number of nights.");
                    sc.nextLine();
                }
            } 
            else if (choice == 5) {
                service.viewReservations();
            } 
            else if (choice == 6) {
                System.out.println("Exiting the system... Thank you!");
            } 
            else {
                System.out.println("Wrong choice! Please select between 1. and 6.");
            }
        }
        
        sc.close();
    }
}
