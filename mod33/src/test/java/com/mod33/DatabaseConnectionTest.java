package com.mod33;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class DatabaseConnectionTest implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/mydb", "admin", "admin")) {
            System.out.println("Connected to PostgreSQL successfully!");
        } catch (Exception e) {
            System.out.println("Failed to connect to PostgreSQL: " + e.getMessage());
        }
    }
}
