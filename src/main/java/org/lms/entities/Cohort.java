package org.lms.entities;

import java.util.Date;
import java.util.List;

public class Cohort {
    private int cohortId;
    private String cohortName;
    private String cohortDescription;
    private Date startDate;
    private Date endDate;

    private List<Learner> learners;

    private List<Instructor> instructors;

}
