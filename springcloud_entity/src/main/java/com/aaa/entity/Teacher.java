package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Teacher {
    @Id
    @Column
    private Integer tid;
    @Column
    private String tname;
    @Column
    private String tzt;

    public Teacher(Integer tid, String tname, String tzt) {
        this.tid = tid;
        this.tname = tname;
        this.tzt = tzt;
    }

    public Teacher() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTzt() {
        return tzt;
    }

    public void setTzt(String tzt) {
        this.tzt = tzt;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tzt='" + tzt + '\'' +
                '}';
    }
}
