package com.mahagan.SpringBootExamples.SpringBootFirstApplication.controller;

import com.mahagan.SpringBootExamples.SpringBootFirstApplication.domain.Department;
import com.mahagan.SpringBootExamples.SpringBootFirstApplication.service.DepartmentService;
import com.mahagan.SpringBootExamples.SpringBootFirstApplication.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping("/department")
    //save the operation
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }


    //read the operation

    @GetMapping("/department")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    //update the operation
    @PutMapping("/department/{id}")

    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") int departmentID) {
        return departmentService.updateDepartment(department, departmentID);
    }

    //delete the operation
    @DeleteMapping("/department/{id}")

    public String deleteDepartmentById(@PathVariable("id") int departmentID) {

        departmentService.deleteDepartmentByID(departmentID);
        return "Resource has been deleted successfully";

    }


}
