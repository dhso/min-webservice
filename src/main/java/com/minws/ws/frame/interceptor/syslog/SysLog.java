package com.minws.ws.frame.interceptor.syslog;

import java.sql.Timestamp;

public class SysLog {
    String user;
    Timestamp createTime = new Timestamp(System.currentTimeMillis());
    String ip;
    String message;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SysLog [user=" + user + ", createTime=" + createTime + ", ip=" + ip + ", message=" + message + "]";
    }

    
}
