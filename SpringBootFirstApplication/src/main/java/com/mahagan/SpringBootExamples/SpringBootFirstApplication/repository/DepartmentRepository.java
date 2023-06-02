package com.mahagan.SpringBootExamples.SpringBootFirstApplication.repository;

import com.mahagan.SpringBootExamples.SpringBootFirstApplication.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


}
