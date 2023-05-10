package org.credex.hiring.portal.model;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Table(name = "user")
public class Users {
    public Users() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "sel_status")
    private boolean status;
    @Column(name = "email",unique = true)
    private String emailId;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role_id")
    private String  roleId;
    @Column(name = "exp")
    private String experience;

    @Column(name = "lang_pref")
    private String language;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "resume_link")
    private String resumeLink;
    @Column(name = "contact",columnDefinition = "BIGINT")
    private long contact;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }



    public Users(int userid, boolean status, String emailId, String password, int contact, String firstName, String lastName, String roleId, String experience, String language, String skills, String resumeLink) {
        this.userId = userid;
        this.status = status;
        this.emailId = emailId;
        this.password = password;
        this.contact = contact;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
        this.experience = experience;
        this.language = language;
        this.skills = skills;
        this.resumeLink = resumeLink;
    }
    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }


    }

