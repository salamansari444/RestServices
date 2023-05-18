package in.ineuron.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
	private boolean active;
	private Address address;
	private Set<String> languages;
	private String company;
	private Map<String,Object> idDetails;
	
	 
	 
}
