package org.example.model;


public class MaxProjectClient {
    private String name;
    private int projectCount;

    public MaxProjectClient() {
    }
    public void setName(String name){
        this.name = name;
    }
    public void setProjectCount(int projectCount){
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public int getProjectCount() {
        return projectCount;
    }
}