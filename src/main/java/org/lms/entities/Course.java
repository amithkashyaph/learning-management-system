package org.lms.entities;

import org.lms.enums.CourseLanguage;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private CourseLanguage courseLanguage;
    private List<Cohort> cohorts;

    public Course(int courseId, String courseName, String courseDescription, CourseLanguage courseLanguage) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseLanguage = courseLanguage;
        this.cohorts = new ArrayList<>();
    }

    public void displayCourseDetails() {
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Course Language: " + courseLanguage);
        for(Cohort cohort: cohorts) {
            System.out.println(cohort);
        }
    }

    public void addCohort(Cohort cohort) {
        this.cohorts.add(cohort);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public CourseLanguage getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(CourseLanguage courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public List<Cohort> getCohorts() {
        return cohorts;
    }

    public void setCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }
}
