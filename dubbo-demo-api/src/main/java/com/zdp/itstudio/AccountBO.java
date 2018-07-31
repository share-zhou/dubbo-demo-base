package com.zdp.itstudio;

import java.io.Serializable;

public class AccountBO implements Serializable {

    private static final long serialVersionUID = -8731467516064624852L;

    private Integer Id;

    private String login;

    private String pwd;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
