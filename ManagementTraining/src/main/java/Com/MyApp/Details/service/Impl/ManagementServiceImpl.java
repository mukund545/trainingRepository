package Com.MyApp.Details.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import Com.MyApp.Details.entity.Management;
import Com.MyApp.Details.exception.ManagementNotFoundException;
import Com.MyApp.Details.repository.ManagementRepository;
import Com.MyApp.Details.service.ManagementService;

@Service
public class ManagementServiceImpl implements ManagementService {
	
	@Autowired
	ManagementRepository managementRepository;

	@Override
	public Management saveManagement(Management management) {
		
		return managementRepository.save(management);
	}

	@Override
	public Object fetchManagement(int pageNumber, int pageSize, String sortBy) {
		

		Pageable p = PageRequest.of(pageNumber, pageSize,Sort.by(sortBy));
		Page<Management> pages = managementRepository.findAll(p);
		
		
		return pages;
	}

	@Override
	public Management editManagement(int managementId, Management management) throws ManagementNotFoundException {
		
		Management managementService = null;
		Optional<Management> managementOptional = managementRepository.findById(managementId);
		if(managementOptional.isPresent()) {
			managementService = managementOptional.get();
		} else
			throw new ManagementNotFoundException();
		managementService.setManagementName(management.getManagementName());
		managementService.setManagementStatus(management.getManagementStatus());
		return managementRepository.save(managementService);
	}

}
