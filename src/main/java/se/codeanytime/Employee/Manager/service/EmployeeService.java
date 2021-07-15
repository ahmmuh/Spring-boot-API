package se.codeanytime.Employee.Manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.codeanytime.Employee.Manager.model.Employee;
import se.codeanytime.Employee.Manager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

   public List<Employee> getAllEmployees(){
        return this.employeeRepo.findAll();
   }

   public Employee getEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id);
   }


   public Employee uppdateEmployee(Employee employee){
        return this.employeeRepo.save(employee);
   }

   public void deleteEmployee(Long id) {
      this.employeeRepo.deleteEmployeeById(id);
   }
}
