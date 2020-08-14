package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "clas")
public class Cls {
    @Id
    @Column
    private Integer clid;
    @Column
    private String clname;

    public Cls(Integer clid, String clname) {
        this.clid = clid;
        this.clname = clname;
    }

    public Cls() {
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname;
    }

    @Override
    public String toString() {
        return "Cls{" +
                "clid=" + clid +
                ", clname='" + clname + '\'' +
                '}';
    }
}
