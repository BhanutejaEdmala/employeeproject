package com.example.Employee.repository;

import com.example.Employee.model.Employee;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public interface Repo extends JpaRepository<Employee,String> {

}
