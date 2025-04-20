package org.lms.entities;

import org.lms.enums.CourseLanguage;

public class OfflineCourse extends Course {

    private String location;

    public OfflineCourse(int courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, String location) {
        super(courseId, courseName, courseDescription, courseLanguage);
        this.location = location;
    }
}
