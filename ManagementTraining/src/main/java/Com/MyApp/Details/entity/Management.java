package Com.MyApp.Details.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Management {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managementId;
	
	private String managementName;
	
	private String managementStatus;
	

}
