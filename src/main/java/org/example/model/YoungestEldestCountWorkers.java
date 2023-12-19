package org.example.model;

import java.util.Date;

public class YoungestEldestCountWorkers {
    private String type;
    private String name;
    private Date birthday;

    public YoungestEldestCountWorkers() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
