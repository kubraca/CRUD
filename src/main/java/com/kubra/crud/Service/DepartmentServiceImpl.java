package com.kubra.crud.Service;

import com.kubra.crud.Entity.Department;
import com.kubra.crud.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service

public class DepartmentServiceImpl
        implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;


    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>)
                departmentRepo.findAll();
    }

    @Override
    public Department updateDepartment(Department department,
                                       Long departmentId) {
        Department depDB=departmentRepo.
                findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());

        }
        if(Objects.nonNull(department.getDepartmentAdress())){
            depDB.setDepartmentAdress(department.getDepartmentAdress());
        }
        if(Objects.nonNull(department.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepo.save(depDB);
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
    }




}
