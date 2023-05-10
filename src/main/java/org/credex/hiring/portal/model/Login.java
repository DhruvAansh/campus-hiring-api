package org.credex.hiring.portal.model;

public  class Login {
    public Login(){
        super();
    }
    public String token;
    public String roleId;
    public String emailId;
    public int userId;

    public String password;

    public String getPass() {
        return password;
    }

    public void setPass(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Login (String token, String roleId, String emailId, int userId) {
        this.token = token;
        this.roleId = roleId;
        this.userId = userId;
        this.emailId = emailId;
    }
}
