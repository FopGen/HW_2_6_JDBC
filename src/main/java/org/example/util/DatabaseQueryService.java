package org.example.util;


import org.example.Database;
import org.example.model.LongestCountProject;
import org.example.model.MaxProjectCountClient;
import org.example.model.MaxSalaryCountWorker;
import org.example.model.YoungestEldestCountWorkers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class DatabaseQueryService {
    private DatabaseQueryService(){
    }

    public static List<LongestCountProject> findLongestProject() throws SQLException {

        String queryString = new ParsingQueryString().getListQuery("find_longest_project.sql");
        List<LongestCountProject> listLongestCountProject = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            LongestCountProject longestCountProject = new LongestCountProject();
            longestCountProject.setId(result.getInt(1));
            longestCountProject.setMonth_count(result.getInt(2));
            listLongestCountProject.add(longestCountProject);
        }

        return listLongestCountProject;

    }

    public static List<MaxProjectCountClient> findMaxProjectClient() throws SQLException {

        String queryString = new ParsingQueryString().getListQuery("find_max_projects_client.sql");
        List<MaxProjectCountClient> listMaxProjectCountClient = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            MaxProjectCountClient maxProjectCountClient = new MaxProjectCountClient();
            maxProjectCountClient.setName(result.getString(1));
            maxProjectCountClient.setProjectCount(result.getInt(2));
            listMaxProjectCountClient.add(maxProjectCountClient);
        }

        return listMaxProjectCountClient;

    }

    public static List<MaxSalaryCountWorker> findMaxSalaryWorker() throws SQLException {

        String queryString = new ParsingQueryString().getListQuery("find_max_salary_worker.sql");
        List<MaxSalaryCountWorker> listMaxSalaryCountWorker = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            MaxSalaryCountWorker maxSalaryCountWorker = new MaxSalaryCountWorker();
            maxSalaryCountWorker.setName(result.getString(1));
            maxSalaryCountWorker.setSalary(result.getInt(2));
            listMaxSalaryCountWorker.add(maxSalaryCountWorker);
        }

        return listMaxSalaryCountWorker;

    }
    public static List<YoungestEldestCountWorkers> findYoungestEldestCountWorkers() throws SQLException {

        String queryString = new ParsingQueryString().getListQuery("find_youngest_eldest_workers.sql");
        List<YoungestEldestCountWorkers> listYoungestEldestCountWorkers = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(queryString);

        while(result.next()){
            YoungestEldestCountWorkers youngestEldestCountWorkers = new YoungestEldestCountWorkers();
            youngestEldestCountWorkers.setType(result.getString(1));
            youngestEldestCountWorkers.setName(result.getString(2));
            youngestEldestCountWorkers.setBirthday(result.getDate(3));
            listYoungestEldestCountWorkers.add(youngestEldestCountWorkers);
        }

        return listYoungestEldestCountWorkers;

    }
}
