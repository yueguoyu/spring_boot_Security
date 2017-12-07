package com.ygy.model;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import javax.persistence.Entity;
import java.io.Serializable;


public class Message implements Serializable {
    private String  UserMesg;
    private String  AdminMsg;

    public String getAdminMsg() {
        return AdminMsg;
    }

    public void setAdminMsg(String adminMsg) {
        AdminMsg = adminMsg;
    }

    public String getUserMesg() {
        return UserMesg;
    }

    public void setUserMesg(String userMesg) {
        UserMesg = userMesg;
    }
}
