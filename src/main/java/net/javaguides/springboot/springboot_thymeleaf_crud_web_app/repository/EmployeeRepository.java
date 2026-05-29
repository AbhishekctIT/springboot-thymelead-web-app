package net.javaguides.springboot.springboot_thymeleaf_crud_web_app.repository;

import net.javaguides.springboot.springboot_thymeleaf_crud_web_app.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    void deleteById(long id);

}
