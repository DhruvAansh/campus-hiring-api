package org.credex.hiring.portal.model;

import javax.persistence.*;
@Entity
@Table(name = "college")
public class Colleges {
    public Colleges() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "college_id")
    private int collegeId;
    @Column(name = "college_name")
    private String collegeName;
    @Column(name = "location")
    private String location;
    @Column(name = "course_offered")
    private String courseOffered;
    @Column(name = "contact")
    private String contact ;
    @Column(name = "current_accrediation")
    private String currentAccrediation;

    public Colleges(int collegeId, String collegeName, String location,
                    String courseOffered, String contact, String currentAccrediation) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.location = location;
        this.courseOffered = courseOffered;
        this.contact = contact;
        this.currentAccrediation = currentAccrediation;

    }
    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getCourseOffered() {
        return courseOffered;
    }

    public void setCourseOffered(String courseOffered) {
        this.courseOffered = courseOffered;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getCurrentAccrediation() {
        return currentAccrediation;
    }
    public void setCurrentAccrediation(String currentAccrediation) {
        this.currentAccrediation = currentAccrediation;
    }

}
