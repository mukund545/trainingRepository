package Com.MyApp.Details.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.MyApp.Details.Entity.Employee;
import Com.MyApp.Details.Repository.EmployeeRepository;
import Com.MyApp.Details.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeByName(String employeeName) {
	
		return employeeRepository.findByEmployeeName(employeeName);
	}

}
