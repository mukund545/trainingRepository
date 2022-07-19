package Com.MyApp.Details.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Com.MyApp.Details.Entity.InternetConnection;
import Com.MyApp.Details.Service.Exception.ConnectionNotFoundException;

@Service
public interface InternetConnectionService {

	InternetConnection postConnection(InternetConnection internetConnection);

	List<InternetConnection> fetchConnections();

	InternetConnection putConnections(int id, InternetConnection internetConnection) throws ConnectionNotFoundException;

	void removeConnections(int id);
	
	

}
