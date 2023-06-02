package com.mahagan.SpringBootExamples.SpringBootFirstApplication.service;

import com.mahagan.SpringBootExamples.SpringBootFirstApplication.domain.Department;
import com.mahagan.SpringBootExamples.SpringBootFirstApplication.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, int departmentID) {
        Department dept = departmentRepository.findById(departmentID).get();

        if (Objects.nonNull(department.getDepartment_Id()) &&!
                "".equalsIgnoreCase(department.getDepartment_Name())){
            dept.setDepartment_Name(department.getDepartment_Name());
        }

        if (Objects.nonNull(department.getDepartment_Id()) &&!
                "".equalsIgnoreCase(department.getDepartment_Address())){
            dept.setDepartment_Address(department.getDepartment_Address());
        }

        if (Objects.nonNull(department.getDepartment_Id()) &&!
                "".equalsIgnoreCase(department.getDepartment_Code())){
            dept.setDepartment_Code(department.getDepartment_Code());
        }
        return departmentRepository.save(dept);
    }

    @Override
    public void deleteDepartmentByID(int departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
