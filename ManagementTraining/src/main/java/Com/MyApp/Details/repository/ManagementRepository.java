package Com.MyApp.Details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.MyApp.Details.entity.Management;


public interface ManagementRepository extends JpaRepository<Management,Integer> {

}
