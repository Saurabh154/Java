package ExceptionHandling;

import java.io.*;
import java.sql.*;

public class MultipleThrowsExample {
    static void readData() throws IOException, SQLException {
        // may throw IOException
        FileReader file = new FileReader("data.txt");

        // may throw SQLException
        throw new SQLException("Database connection failed!");
    }

    public static void main(String[] args) {
        try {
            readData();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        }
    }
}

/*
🧠 Explanation:

# readData() declares two exceptions (IOException, SQLException)

# The caller (main) must handle both exceptions using separate catch blocks.


 */