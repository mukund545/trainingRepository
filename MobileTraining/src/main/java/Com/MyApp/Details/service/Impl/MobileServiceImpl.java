package Com.MyApp.Details.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import Com.MyApp.Details.entity.Mobile;
import Com.MyApp.Details.repository.MobileRepository;
import Com.MyApp.Details.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	MobileRepository mobileRepository;

	@Override
	public Mobile saveMobile(Mobile mobile) {
		
		return mobileRepository.save(mobile);
	}

	@Override
	public Object fetchMobile(int pageNumber, int pageSize, String sortBy) {
		
		Pageable p = PageRequest.of(pageNumber, pageSize,Sort.by(Direction.DESC,sortBy));
		Page<Mobile> pages = mobileRepository.findAll(p);
		
		return pages;
	}

	@Override
	public List<Mobile> fetchAllMobile() {
		
		return mobileRepository.findAll();
	}

}
