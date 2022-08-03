package Com.MyApp.Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.Entity.Employee;
import Com.MyApp.Details.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getEmployee()
	{
		return employeeService.findEmployees();
	}
	
	@GetMapping("/{employeeName}")
	public Employee getEmployeeByName(@PathVariable String employeeName )
	{
		return employeeService.fetchEmployeeByName(employeeName);
	}
	
	

}
