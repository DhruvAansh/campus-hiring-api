package org.credex.hiring.portal.model;

public class LoggedInUser {
    private String useName;
    private String role;

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
