package net.javaguides.springboot.springboot_thymeleaf_crud_web_app.service;

import net.javaguides.springboot.springboot_thymeleaf_crud_web_app.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    List<Employee>getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployee(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize);
}
