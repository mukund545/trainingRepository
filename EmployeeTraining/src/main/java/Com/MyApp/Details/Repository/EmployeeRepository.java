package Com.MyApp.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.MyApp.Details.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Employee findByEmployeeName(String employeeName);

}
