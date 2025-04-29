package org.lms.entities;

import org.lms.enums.CourseLanguage;

public class OnlineCourse extends Course {

    private String zoomLink;

    public OnlineCourse(int courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, String zoomLink) {
        super(courseId, courseName, courseDescription, courseLanguage);
        this.zoomLink = zoomLink;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    public void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }
}
