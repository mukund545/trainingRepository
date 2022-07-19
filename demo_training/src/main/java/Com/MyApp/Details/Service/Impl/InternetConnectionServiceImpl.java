package Com.MyApp.Details.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.MyApp.Details.Entity.InternetConnection;
import Com.MyApp.Details.Repository.InternetConnectionRepository;
import Com.MyApp.Details.Service.InternetConnectionService;
import Com.MyApp.Details.Service.Exception.ConnectionNotFoundException;

@Service
public class InternetConnectionServiceImpl implements InternetConnectionService{
	
	@Autowired
	InternetConnectionRepository internetConnectionRepository;

	@Override
	public InternetConnection postConnection(InternetConnection internetConnection) {
		
		return this.internetConnectionRepository.save(internetConnection);
	}

	@Override
	public List<InternetConnection> fetchConnections() {

		return this.internetConnectionRepository.findAll();
	}

	@Override
	public InternetConnection putConnections(int id, InternetConnection internetConnection) throws ConnectionNotFoundException {
                 
		InternetConnection internetCon;
		
	              Optional<InternetConnection> optional = this.internetConnectionRepository.findById(id);
	              if(optional.isPresent()) {
	            	  internetCon = optional.get();
	            	  internetCon.setName(internetConnection.getName());
	            	  internetCon.setProvider(internetConnection.getProvider());
	              return   this.internetConnectionRepository.save(internetCon);
	              }
	              else 
	            	  throw new ConnectionNotFoundException(); 
	}

	@Override
	public void removeConnections(int id) {
		
		this.internetConnectionRepository.deleteById(id);
	}

}
