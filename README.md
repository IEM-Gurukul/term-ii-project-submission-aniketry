# Password Authentication System Using Core Java (Revised)

## 1. Project Title
Password Authentication System Using Core Java

---

## 2. Problem Statement
User authentication is an essential part of modern software systems to ensure that only authorized users can access resources. Many basic authentication systems suffer from serious issues such as weak password validation, storing passwords in plain text, and poor error handling. These problems can lead to vulnerabilities, data breaches, and system misuse.

This project aims to design a simple yet secure password authentication system using Core Java. It focuses on implementing proper password validation rules, ensuring secure storage of user credentials, and handling user inputs effectively. The system also emphasizes modular design using Object-Oriented Programming concepts and handles possible runtime and file-related errors efficiently.

---

## 3. Target User
- Students learning authentication concepts  
- Beginners practicing Java implementation  
- Small applications needing authentication systems  

---

## 4. Core Features
1. User registration with unique username  
2. Secure login using stored credentials  
3. Password validation (uppercase, lowercase, digit, special character)  
4. File-based storage for saving user data  
5. Password management (change/update basic details)  
6. Exception handling for invalid input and file errors  
7. User verification during login  

---

## 5. OOP Concepts to be Used
- **Abstraction** – using interface for authentication methods  
- **Encapsulation** – storing user data in private variables  
- **Inheritance** – creating User class  
- **Polymorphism** – overriding methods like login or validation  
- **Exception Handling** – handling runtime and file errors  
- **Collections** – using ArrayList/HashMap to manage users  

---

## 6. Proposed Architectural Design
The system follows a modular design consisting of main components:

- **User Interface Module**:  
  Responsible for taking user inputs such as username and password and displaying messages to the user.

- **Authentication Module**:  
  Handles all core logic including checking for unique usernames during registration, validating password rules, converting passwords into hashed form (basic level), and verifying login credentials.

- **Data Storage Module**:  
  Uses file handling to store and retrieve user data. The module reads stored usernames and passwords during system execution.

- **Data Management Module**:  
  Uses Java collections such as ArrayList or HashMap to temporarily store user data during execution.

- **Error Handling Module**:  
  Applies exception handling mechanisms to manage invalid inputs and file-related errors, ensuring smooth and reliable system operation.

---

## Conclusion
This project presents a structured implementation of a password authentication system using Core Java. It demonstrates key Object-Oriented Programming concepts along with file handling and exception management. The system is simple, modular, and easy to understand, making it suitable for beginners. It can be further enhanced by adding features such as password encryption, database integration, and graphical user interfaces to improve security and usability.
