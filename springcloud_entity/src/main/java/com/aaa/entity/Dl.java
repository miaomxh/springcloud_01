package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Dl {
    @Id
    @Column
    private Integer did;
    @Column
    private String dname;
    @Column
    private String dpwd;

    /*public Dl(Integer did, String dname, String dpwd) {
        this.did = did;
        this.dname = dname;
        this.dpwd = dpwd;
    }

    public Dl() {
    }*/

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDpwd() {
        return dpwd;
    }

    public void setDpwd(String dpwd) {
        this.dpwd = dpwd;
    }

    @Override
    public String toString() {
        return "Dl{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dpwd='" + dpwd + '\'' +
                '}';
    }
}
