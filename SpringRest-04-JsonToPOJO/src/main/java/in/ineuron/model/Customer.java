package in.ineuron.model;

import java.util.ArrayList;
import java.util.Set;

import lombok.Data;

@Data
public class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
	private boolean active;
	private Address address;
	private Set<String> languages;
	private String company;
	
	
	 
	 
}
