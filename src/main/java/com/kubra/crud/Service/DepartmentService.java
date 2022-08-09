package com.kubra.crud.Service;
import com.kubra.crud.Entity.Department;

import java.util.List;

public interface DepartmentService {
    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department, Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
