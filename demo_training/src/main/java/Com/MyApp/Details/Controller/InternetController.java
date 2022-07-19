package Com.MyApp.Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.Entity.InternetConnection;
import Com.MyApp.Details.Service.InternetConnectionService;
import Com.MyApp.Details.Service.Exception.ConnectionNotFoundException;

@RestController
@RequestMapping("/internet")
public class InternetController {
	
	@Autowired
	InternetConnectionService internetConnectionService; 
	
	@PostMapping
	public InternetConnection addConnection(@RequestBody InternetConnection internetConnection ) {

	return this.internetConnectionService.postConnection(internetConnection);
	}
	
	@GetMapping
	public List<InternetConnection> getConnections() {

	return this.internetConnectionService.fetchConnections();
	}
	@PutMapping("/{id}")
	public InternetConnection updateConnection(@PathVariable int id,@RequestBody InternetConnection internetConnection) throws ConnectionNotFoundException {

	return this.internetConnectionService.putConnections(id,internetConnection);
	}
	@DeleteMapping("/{id}")
	public void deleteConnections(@PathVariable int id) {

     this.internetConnectionService.removeConnections(id);
	}
	
}
