package org.example;

import org.example.model.LongestProject;
import org.example.model.MaxProjectClient;
import org.example.model.MaxSalaryWorker;
import org.example.model.YoungestEldestWorkers;
import org.example.util.DatabaseQueryService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        List<LongestProject> longestCountProjects =  DatabaseQueryService.findLongestProject();
        for (LongestProject value:longestCountProjects){
            System.out.println(value.getId() +" - "+value.getMonth_count());
        }

        List<MaxProjectClient> maxProjectCountClients =  DatabaseQueryService.findMaxProjectClient();
        for (MaxProjectClient value:maxProjectCountClients){
            System.out.println(value.getName() +" - "+value.getProjectCount());
        }

        List<MaxSalaryWorker> maxSalaryCountWorker =  DatabaseQueryService.findMaxSalaryWorker();
        for (MaxSalaryWorker value:maxSalaryCountWorker){
            System.out.println(value.getName() +" - "+value.getSalary());
        }

        List<YoungestEldestWorkers> youngestEldestCountWorkers =  DatabaseQueryService.findYoungestEldestCountWorkers();
        for (YoungestEldestWorkers value:youngestEldestCountWorkers){
            System.out.println(value.getType() +" - "+value.getName()+ " - " +value.getBirthday());
        }


    }
}
