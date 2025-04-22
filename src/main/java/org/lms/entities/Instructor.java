package org.lms.entities;

public class Instructor {
    public int id;
    public String name;
    public int noOfYearsOfExperience;

    public Instructor(int id, String name, int noOfYearsOfExperience) {
        this.id = id;
        this.name = name;
        this.noOfYearsOfExperience = noOfYearsOfExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfYearsOfExperience() {
        return noOfYearsOfExperience;
    }

    public void setNoOfYearsOfExperience(int noOfYearsOfExperience) {
        this.noOfYearsOfExperience = noOfYearsOfExperience;
    }
}
