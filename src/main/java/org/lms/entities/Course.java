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

}
