package com.auth.util;

import java.io.*;
import java.util.HashMap;

public class FileUtil {

    private static final String FILE_NAME = "users.txt";

    public static void saveUsers(HashMap<String, String> users) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

        for (String username : users.keySet()) {
            writer.write(username + "," + users.get(username));
            writer.newLine();
        }

        writer.close();
        System.out.println("User data saved successfully");
    }

    public static HashMap<String, String> loadUsers() {
        HashMap<String, String> users = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                users.put(parts[0], parts[1]);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return users;
    }
}