package departmentmicroservice.service;

import departmentmicroservice.entity.Department;

import java.util.List;

public interface DepartmentInterface {

    Department getDepartment(Long id);
    List<Department> getallDepartments();
    Department createDepartment(Department department);
}
