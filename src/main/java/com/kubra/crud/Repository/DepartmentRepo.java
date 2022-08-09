package com.kubra.crud.Repository;

import com.kubra.crud.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo
        extends JpaRepository<Department,Long> {
}
