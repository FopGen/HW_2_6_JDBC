package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataSource {

    public static HashMap<Integer, String> getListOfClient(){
        HashMap<Integer, String> listOfClient = new HashMap<>();
            listOfClient.put(1, "Mr.Max");
            listOfClient.put(2,"Mr.Ted");
            listOfClient.put(3,"Mrs. Maria");
            listOfClient.put(4,"Mr.Ben");
            listOfClient.put(5,"Mrs.Linda");
        return listOfClient;
    }

    public static List <String> getlistOfWorker(){
        List <String> listOfWorker = new ArrayList<>();
        listOfWorker.add("1,First,1991.01.01,Trainee,300");
        listOfWorker.add("2,Second,1992.02.02,Junior,1000");
        listOfWorker.add("3,Third,1993.03.03,Junior,1500");
        listOfWorker.add("4,Four,1994.04.04,Junior,1800");
        listOfWorker.add("5,Five,1995.05.05,Middle,2000");
        listOfWorker.add("6,Six,1996.06.06,Middle,2500");
        listOfWorker.add("7,Seven,1997.07.07,Senior,4000");
        listOfWorker.add("8,Eight,1998.08.08,Senior,4500");
        listOfWorker.add("9,Nine,1999.09.09,Senior,5000");
        listOfWorker.add("10,Ten,2000.10.10,Senior,5500");
        return listOfWorker;
    }

    public static List<String> getListOfProjects(){
        List <String> listOfProjects = new ArrayList<>();
        listOfProjects.add("101, 1, 2000.01.01,2005.12.01");
        listOfProjects.add("102, 2, 2001.01.01,2001.02.01");
        listOfProjects.add("103, 3, 2002.01.01,2002.03.01");
        listOfProjects.add("104, 4, 2004.01.01,2005.12.01");
        listOfProjects.add("105, 5, 2005.01.01,2005.03.01");
        listOfProjects.add("106, 1, 2002.04.01,2005.06.01");
        listOfProjects.add("107, 2, 2006.08.01,2006.12.01");
        listOfProjects.add("108, 3, 2008.10.01,2009.10.01");
        listOfProjects.add("109, 4, 2005.01.01,2005.10.01");
        listOfProjects.add("110, 5, 2000.01.01,2006.03.01");
        return listOfProjects;
    }

    public static List <String> getListOfProjectsWorker(){
        List <String> listOfProjectsWorker = new ArrayList<>();
        listOfProjectsWorker.add("101, 1");
        listOfProjectsWorker.add("101, 2");
        listOfProjectsWorker.add("101, 3");
        listOfProjectsWorker.add("101, 4");
        listOfProjectsWorker.add("101, 5");
        listOfProjectsWorker.add("102, 6");
        listOfProjectsWorker.add("102, 7");
        listOfProjectsWorker.add("102, 8");
        listOfProjectsWorker.add("103, 9");
        listOfProjectsWorker.add("104, 10");
        listOfProjectsWorker.add("105, 10");
        listOfProjectsWorker.add("106, 9");
        listOfProjectsWorker.add("107, 8");
        listOfProjectsWorker.add("108, 7");
        listOfProjectsWorker.add("109, 6");
        listOfProjectsWorker.add("110, 5");
        return listOfProjectsWorker;
    }

}
