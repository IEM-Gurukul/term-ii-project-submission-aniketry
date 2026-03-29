package com.auth.main;

import com.auth.model.User;
import com.auth.service.AuthService;
import com.auth.service.AuthServiceImpl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        AuthService service = new AuthServiceImpl();

        while (true) {

            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    service.register(new User(username, password));
                    System.out.println("Registered successfully!");
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    username = sc.nextLine();

                    System.out.print("Enter password: ");
                    password = sc.nextLine();

                    if (service.login(username, password)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid credentials!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}