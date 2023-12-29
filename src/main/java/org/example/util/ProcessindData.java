package org.example.util;

import org.example.DataSource;
import org.example.Database;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessindData {

    static Connection connection;

    public static void processingListOfClient(HashMap<Integer, String> listOfClient,  String queryForClient) throws SQLException {

        connection = Database.getConnection();

        PreparedStatement queryStatementForClient = connection.prepareStatement(queryForClient);
        for (Map.Entry<Integer, String> value: listOfClient.entrySet()){
            queryStatementForClient.setInt(1, value.getKey());
            queryStatementForClient.setString(2, value.getValue());

            queryStatementForClient.addBatch();
        }
        queryStatementForClient.executeBatch();
    }

    public static void processingListOfWorker(List<String> listOfWorker, String queryForWorker) throws SQLException {
        connection = Database.getConnection();

        PreparedStatement queryStatementForWorker = connection.prepareStatement(queryForWorker);
        for (String value:listOfWorker){
            String [] separetedValue = value.split(",");
            queryStatementForWorker.setInt(1, Integer.parseInt(separetedValue[0]));
            queryStatementForWorker.setString(2, separetedValue[1]);

            String str = separetedValue[2].replace(".", "-");
            queryStatementForWorker.setDate(3,java.sql.Date.valueOf(str));
            queryStatementForWorker.setString(4, separetedValue[3]);
            queryStatementForWorker.setInt(5, Integer.parseInt(separetedValue[4]));

            queryStatementForWorker.addBatch();
        }
        queryStatementForWorker.executeBatch();
    }

    public static void processingListOfProject(List <String> listOfProjects, String queryForProject) throws SQLException {
        connection = Database.getConnection();

        PreparedStatement queryStatementForProjects = connection.prepareStatement(queryForProject);
        for (String value:listOfProjects){
            String [] separetedValue = value.split(",");
            queryStatementForProjects.setInt(1, Integer.parseInt(separetedValue[0]));

            String str = separetedValue[1].trim();
            BigInteger bigInt = new BigInteger(str);
            queryStatementForProjects.setInt(2, Integer.parseInt(separetedValue[1].trim()));

            String modifierDateStartStr = separetedValue[2].replace(".", "-").trim();
            queryStatementForProjects.setDate(3,java.sql.Date.valueOf(modifierDateStartStr));

            String modifierDateFinishStr = separetedValue[3].replace(".", "-").trim();
            queryStatementForProjects.setDate(4,java.sql.Date.valueOf(modifierDateFinishStr));

            queryStatementForProjects.addBatch();
        }
        queryStatementForProjects.executeBatch();
    }

    public static void processingListOfProjectWorker(List <String> listOfProjectsWorker, String queryForProjectWorker) throws SQLException {
        connection = Database.getConnection();

        PreparedStatement queryStatementForProjectsWorker = connection.prepareStatement(queryForProjectWorker);
        for (String value:listOfProjectsWorker){
            String [] separetedValue = value.split(",");
            queryStatementForProjectsWorker.setInt(1, Integer.parseInt(separetedValue[0]));
            queryStatementForProjectsWorker.setInt(2, Integer.parseInt(separetedValue[1].trim()));

            queryStatementForProjectsWorker.addBatch();
        }

        queryStatementForProjectsWorker.executeBatch();
    }

}
