package org.example;

import org.example.util.ProcessindData;

import java.sql.*;
import java.util.*;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException{

 //       Connection connection = Database.getConnection();

        HashMap<Integer, String> listOfClient = DataSource.getListOfClient();
        String queryForClient = "INSERT INTO client (id, name) VALUES (?,?)";

        ProcessindData.processingListOfClient(listOfClient, queryForClient);


        List <String> listOfWorker = DataSource.getlistOfWorker();
        String queryForWorker = "INSERT INTO worker (id, name, birthday, level, salary) VALUES (?,?, ?, ?::competence,?)";

        ProcessindData.processingListOfWorker(listOfWorker, queryForWorker);


        List <String> listOfProjects = DataSource.getListOfProjects();
        String queryForProject = "INSERT INTO project (id, client_id, start_date, finish_date) VALUES (?, ?, ?, ?)";

        ProcessindData.processingListOfProject(listOfProjects, queryForProject);


        List <String> listOfProjectsWorker = DataSource.getListOfProjectsWorker();
        String queryForProjectWorker = "INSERT INTO project_worker (project_id, worker_id) VALUES (?, ?)";

        ProcessindData.processingListOfProjectWorker(listOfProjectsWorker, queryForProjectWorker);
    }
}

