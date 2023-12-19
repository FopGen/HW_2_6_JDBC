package org.example;

import org.example.util.ParsingQuery;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseInitService {

    public static void main(String[] args) throws SQLException, IOException {

        ArrayList <String> arrayList = new ParsingQuery().getListQuery("init_db.sql");

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();

        for (String str:arrayList){
            statement.execute(str);
        }

    }
}
