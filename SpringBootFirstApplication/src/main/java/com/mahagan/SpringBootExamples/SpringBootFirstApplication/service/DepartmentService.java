package com.mahagan.SpringBootExamples.SpringBootFirstApplication.service;

import com.mahagan.SpringBootExamples.SpringBootFirstApplication.domain.Department;

import java.util.List;


public interface DepartmentService {


    // save the operation
    Department saveDepartment(Department department);

    //read the operation
    List<Department> fetchDepartmentList();

    //update the operation
    Department updateDepartment(Department department, int departmentID);

    //delete the operation
    void deleteDepartmentByID(int departmentId);


}
