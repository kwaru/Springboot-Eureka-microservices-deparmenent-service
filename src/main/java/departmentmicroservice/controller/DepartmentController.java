package departmentmicroservice.controller;

import departmentmicroservice.entity.Department;
import departmentmicroservice.service.DepartmentServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    private final DepartmentServiceImp departmentServiceImp;

    @Autowired
    public DepartmentController(DepartmentServiceImp departmentServiceImp){
        this.departmentServiceImp = departmentServiceImp;
    }

    @GetMapping("/")
    public ResponseEntity<List<Department>> getallDepartments(){
        log.info(" inside get all departments");

        return ResponseEntity.ok().body(departmentServiceImp.getallDepartments());
    }


    @PostMapping("/")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        log.info(" inside save departments");
        return ResponseEntity.ok().body(departmentServiceImp.createDepartment(department));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getepartments(@PathVariable("id") Long id){
        log.info(" inside get department");
        return ResponseEntity.ok().body(departmentServiceImp.getDepartment(id));
    }
}
