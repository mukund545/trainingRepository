package Com.MyApp.Details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.entity.Management;
import Com.MyApp.Details.exception.ManagementNotFoundException;
import Com.MyApp.Details.service.ManagementService;


@RestController
@RequestMapping("/management")
public class ManagmentController {
	
	@Autowired
	ManagementService managementService;
	
	@PostMapping
	public 	Management addManagement(@RequestBody Management management)
	{
		return managementService.saveManagement(management);
	}
	
	@GetMapping
	public 	Object getDetails(@RequestParam(value = "pageNumber",defaultValue = "0",required = false)int pageNumber,
            @RequestParam(value = "pageSize",defaultValue ="2",required = false)int pageSize,
            @RequestParam(value = "sortBy",defaultValue ="managementId",required = false)String sortBy)
	{
		return managementService.fetchManagement(pageNumber,pageSize,sortBy);
	}
	
	@PutMapping("/{managementId}")
	public 	Management updateManagement(@PathVariable int managementId,@RequestBody Management management) throws ManagementNotFoundException
	{
		return managementService.editManagement(managementId,management);
	}
	
	


}
