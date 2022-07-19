package Com.MyApp.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.MyApp.Details.Entity.InternetConnection;

@Repository
public interface InternetConnectionRepository extends JpaRepository<InternetConnection, Integer>{
	

}
