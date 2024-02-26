package com.example.Employee.service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{
@Autowired
    Repo repo;
    @Override
    public int add(Employee emp) {
        if (!(emp.getEmpid().matches("[0-9]+"))||(emp.getEname().isEmpty()||emp.getEname().isBlank())||(emp.getBranch().isEmpty()||emp.getBranch().isBlank())||(emp.getDept().isEmpty()||emp.getDept().isBlank())) {
            return 2;
        }
        if(repo.existsById(emp.getEmpid()))
            return 0;
        else{
            repo.save(emp);
            return 1;
        }
    }

    @Override
    public Employee get(String empid) {
        Employee e = new Employee();
      if(repo.existsById(empid)){
          e = repo.findById(empid).get();
      return e;}
      else{
          e=null;
          return e;}
    }

    @Override
    public int delete(String empid) {
        if(repo.existsById(empid)){
            Employee e = repo.findById(empid).get();
            repo.delete(e);
            return 1;}
        else{
            return 0;
        }
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list = repo.findAll();
        return list;
    }
    public int deleteByName(String name) {
        List<Employee> list = repo.findAll();
        int a=0;
      for(Employee e:list){
          if(e.getEname().equals(name)){
              a++;
              repo.delete(e);

          break;}
      }
      return a;
    }

    @Override
    public Employee upd(Employee emp) {
        Employee f = new Employee() ;
        if (!(emp.getEmpid().matches("[0-9]+")) ||(emp.getEname().isEmpty()||emp.getEname().isBlank())||(emp.getBranch().isEmpty()||emp.getBranch().isBlank())||(emp.getDept().isEmpty()||emp.getDept().isBlank()) ) {
           f.setEmpid("0");
            return f;}
        if(repo.existsById(emp.getEmpid())){
          f  = repo.findById(emp.getEmpid()).get();
            f.setBranch(emp.getBranch());
            f.setEname(emp.getEname());
            f.setDept(emp.getDept());
            repo.save(f);
            return f;
        }
        else
            return null;

    }
}
