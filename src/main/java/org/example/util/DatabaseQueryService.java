package org.example.util;


import org.example.Database;
import org.example.model.LongestProject;
import org.example.model.MaxProjectClient;
import org.example.model.MaxSalaryWorker;
import org.example.model.YoungestEldestWorkers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class DatabaseQueryService {
    private DatabaseQueryService(){
    }

    public static List<LongestProject> findLongestProject() throws SQLException {

        String queryString = new ParsingQueryString().getStringQuery("find_longest_project.sql");
        List<LongestProject> listLongestCountProject = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            LongestProject longestCountProject = new LongestProject();
            longestCountProject.setId(result.getInt(1));
            longestCountProject.setMonth_count(result.getInt(2));
            listLongestCountProject.add(longestCountProject);
        }

        return listLongestCountProject;

    }

    public static List<MaxProjectClient> findMaxProjectClient() throws SQLException {

        String queryString = new ParsingQueryString().getStringQuery("find_max_projects_client.sql");
        List<MaxProjectClient> listMaxProjectCountClient = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            MaxProjectClient maxProjectCountClient = new MaxProjectClient();
            maxProjectCountClient.setName(result.getString(1));
            maxProjectCountClient.setProjectCount(result.getInt(2));
            listMaxProjectCountClient.add(maxProjectCountClient);
        }

        return listMaxProjectCountClient;

    }

    public static List<MaxSalaryWorker> findMaxSalaryWorker() throws SQLException {

        String queryString = new ParsingQueryString().getStringQuery("find_max_salary_worker.sql");
        List<MaxSalaryWorker> listMaxSalaryCountWorker = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            MaxSalaryWorker maxSalaryCountWorker = new MaxSalaryWorker();
            maxSalaryCountWorker.setName(result.getString(1));
            maxSalaryCountWorker.setSalary(result.getInt(2));
            listMaxSalaryCountWorker.add(maxSalaryCountWorker);
        }

        return listMaxSalaryCountWorker;

    }
    public static List<YoungestEldestWorkers> findYoungestEldestCountWorkers() throws SQLException {

        String queryString = new ParsingQueryString().getStringQuery("find_youngest_eldest_workers.sql");
        List<YoungestEldestWorkers> listYoungestEldestCountWorkers = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            YoungestEldestWorkers youngestEldestCountWorkers = new YoungestEldestWorkers();
            youngestEldestCountWorkers.setType(result.getString(1));
            youngestEldestCountWorkers.setName(result.getString(2));
            youngestEldestCountWorkers.setBirthday(result.getDate(3));
            listYoungestEldestCountWorkers.add(youngestEldestCountWorkers);
        }

        return listYoungestEldestCountWorkers;

    }
}
