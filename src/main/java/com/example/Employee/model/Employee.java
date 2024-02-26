package com.example.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private String empid;
    private String ename;
    private String dept;
    private String branch;

    public Employee(String empid, String ename, String dept, String branch) {
        this.empid = empid;
        this.ename = ename;
        this.dept = dept;
        this.branch = branch;
    }
    public Employee() {
    }
    public String getEmpid() {
        return empid;
    }
    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", dept='" + dept + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
