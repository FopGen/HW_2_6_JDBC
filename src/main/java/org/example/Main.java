package org.example;

import org.example.model.LongestCountProject;
import org.example.model.MaxProjectCountClient;
import org.example.model.MaxSalaryCountWorker;
import org.example.model.YoungestEldestCountWorkers;
import org.example.util.DatabaseQueryService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        List<LongestCountProject> longestCountProjects =  DatabaseQueryService.findLongestProject();
        for (LongestCountProject value:longestCountProjects){
            System.out.println(value.getId() +" - "+value.getMonth_count());
        }

        List<MaxProjectCountClient> maxProjectCountClients =  DatabaseQueryService.findMaxProjectClient();
        for (MaxProjectCountClient value:maxProjectCountClients){
            System.out.println(value.getName() +" - "+value.getProjectCount());
        }

        List<MaxSalaryCountWorker> maxSalaryCountWorker =  DatabaseQueryService.findMaxSalaryWorker();
        for (MaxSalaryCountWorker value:maxSalaryCountWorker){
            System.out.println(value.getName() +" - "+value.getSalary());
        }

        List<YoungestEldestCountWorkers> youngestEldestCountWorkers =  DatabaseQueryService.findYoungestEldestCountWorkers();
        for (YoungestEldestCountWorkers value:youngestEldestCountWorkers){
            System.out.println(value.getType() +" - "+value.getName()+ " - " +value.getBirthday());
        }


    }
}
