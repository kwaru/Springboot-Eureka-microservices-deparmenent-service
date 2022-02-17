package departmentmicroservice.service;

import departmentmicroservice.entity.Department;
import departmentmicroservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements  DepartmentInterface{
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImp(DepartmentRepository departmentRepository){
        this.departmentRepository= departmentRepository;

    }

    @Override
    public Department getDepartment(Long id) {
        return departmentRepository.findByDepartmenId(id);
    }

    @Override
    public List<Department> getallDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
