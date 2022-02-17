package departmentmicroservice.repository;

import departmentmicroservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentName(String departmentName);
    Department findByDepartmenId(Long id);
}
