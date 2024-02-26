package com.example.Employee.service;

import com.example.Employee.model.Employee;

import java.util.List;

public interface Service {
    int add(Employee emp);
    Employee get(String empid);
    int delete(String empid);
    List<Employee> getAll();
     int deleteByName(String name);
     Employee upd(Employee e);
}
