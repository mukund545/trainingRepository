package Com.MyApp.Details.service;

import java.util.List;

import Com.MyApp.Details.entity.Mobile;

public interface MobileService {

	Mobile saveMobile(Mobile mobile);

	Object fetchMobile(int pageNumber, int pageSize, String sortBy);

	List<Mobile> fetchAllMobile();
	
	

}
