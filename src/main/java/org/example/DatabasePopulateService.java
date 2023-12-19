package org.example;

import org.example.util.ParsingQuery;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException {

        ArrayList<String> arrayList = new ParsingQuery().getListQuery("populate_db.sql");

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();

        for (String str:arrayList){
            statement.execute(str);
        }
    }
}
