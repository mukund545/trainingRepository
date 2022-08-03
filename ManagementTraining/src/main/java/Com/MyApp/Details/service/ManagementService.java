package Com.MyApp.Details.service;

import Com.MyApp.Details.entity.Management;
import Com.MyApp.Details.exception.ManagementNotFoundException;

public interface ManagementService {

	Management saveManagement(Management management);

	Object fetchManagement(int pageNumber, int pageSize, String sortBy);

	Management editManagement(int managementId, Management management) throws ManagementNotFoundException;

}
