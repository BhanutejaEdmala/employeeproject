package com.example.Employee.controller;
import com.example.Employee.model.Employee;
import com.example.Employee.service.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ServiceImp service;
    @GetMapping("/")
    public String rec(){
        return "input";
    }
    @GetMapping("/g")
    public String find(){
        return "get";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute Employee emp, ModelMap m){
        int a = service.add(emp);
        if(a==0)
            return "fail";
        else if(a==2)
            return "valid";
        else
            return "suc";
    }
    @GetMapping("/get")
    public String get(@RequestParam String empid,ModelMap m){
        if (!(empid.matches("[0-9]+")))
            return "valid";
     Employee e = service.get(empid);
      if(e==null)
       return "gfail";
  else{
      m.put("eid",e.getEmpid());
      m.put("ename",e.getEname());
      m.put("dept",e.getDept());
      m.put("branch",e.getBranch());
      return "found";
        }
    }
    @GetMapping("/dform")
    public String dform(){
        return "del";
    }
    @PostMapping("/del")
    public String delete(@RequestParam String ename){
        int i = service.deleteByName(ename);
        if(i==1)
            return "sdel";
        else
            return "gfail";
    }
    @GetMapping("/view")
    public String view(ModelMap m){
        List<Employee> list = service.getAll();
        m.put("l",list);
        return "viewall";
    }
    @GetMapping("/update")
    public String update(){
        return "upd";
    }
    @PostMapping("/upd")
    public String upd(@ModelAttribute Employee e , ModelMap m){
        Employee f= service.upd(e);
        if (!(e.getEmpid().matches("[0-9]+")))
            return "valid";
        if(f==null)
            return "gfail";
        else{
            m.put("eid",f.getEmpid());
            m.put("ename",f.getEname());
            m.put("dept",f.getDept());
            m.put("branch",f.getBranch());
            return "found";
        }
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/lupd/{empid}")
    public String lUpdate(@PathVariable String empid,ModelMap m){
        m.put("empid",empid);
        return "luform";
    }
    @GetMapping("/ldel/{empid}")
    public String lDelete(@PathVariable String empid,ModelMap m){
       service.delete(empid);
        return "redirect:/view";
    }
    @GetMapping("/log")
    public String login(){
        return "input";
    }
    @GetMapping("/logcheck")
    public String login(@ModelAttribute Employee e){
        int r = service.add(e);
        if(r==0)
            return "slog";
        else
            return "flog";

    }
}
