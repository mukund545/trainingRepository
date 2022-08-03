package Com.MyApp.Details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.entity.Mobile;
import Com.MyApp.Details.service.MobileService;

@RestController
@RequestMapping("/mobiles")
public class MobileController {
	
	@Autowired
	MobileService mobileService;
	
	@PostMapping
	public 	Mobile addMobile(@RequestBody Mobile mobile)
	{
		return mobileService.saveMobile(mobile);
	}
	
	@GetMapping("/fetch")
	public 	Object getDetails(@RequestParam(value = "pageNumber",defaultValue = "0",required = false)int pageNumber,
            @RequestParam(value = "pageSize",defaultValue ="2",required = false)int pageSize,
            @RequestParam(value = "sortBy",defaultValue ="mobileId",required = false)String sortBy)
	{
		return mobileService.fetchMobile(pageNumber,pageSize,sortBy);
	}
	
	@GetMapping
	public 	List<Mobile> getAllMobile()
	{
		return mobileService.fetchAllMobile();
	}
	

}
