package com.demo.neha.model;

/**
 * Created by govind on 01-08-2018.
 */
public class Employee {
    private int eid;
    private String ename;
    private  String city;
    private long salary;


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int eid, String city, String ename, long salary) {
        this.eid = eid;
        this.city = city;
        this.ename = ename;
        this.salary = salary;
    }
}
