package com.auth.main;

import com.auth.model.User;
import com.auth.service.AuthService;
import com.auth.service.AuthServiceImp1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        AuthService service = new AuthServiceImp1();
        System.out.println(" Welcome to my Password Authentication System!! ");

        while (true) 
        {

            System.out.println("\n~~~~~~~~~ PASSWORD AUTHENTICATION SYSTEM~~~~~~~~~~~");
            System.out.println("1) Register New User");
            System.out.println("2) Login Existing User");
            System.out.println("3) Exit");
            System.out.println("~~~~~~~~~~~~~END~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice: ");

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
                    System.out.println("Thank you for using the system. || Goodbye ||");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}