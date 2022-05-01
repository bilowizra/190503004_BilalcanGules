package com.example.softwareprojektt;

import java.sql.Connection;

public class DatabaseConnection {

    public Connection databaselink;

    public Connection getConnection(){
        String databaseName = "";
        String databaseUser = "";
        String databasePassword = "";
        String url = "jdbc:sqlite://localhost/" + databaseName;

        return null;
    }
}
