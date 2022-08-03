package Com.MyApp.Details.Service;

import java.util.List;

import Com.MyApp.Details.Entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> findEmployees();

	Employee fetchEmployeeByName(String employeeName);

}
