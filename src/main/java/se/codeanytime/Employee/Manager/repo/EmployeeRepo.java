package se.codeanytime.Employee.Manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.codeanytime.Employee.Manager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);

     Employee findEmployeeById(Long id);
}
