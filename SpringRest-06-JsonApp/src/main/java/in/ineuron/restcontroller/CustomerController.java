package in.ineuron.restcontroller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Address;
import in.ineuron.model.Customer;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	
	@GetMapping("/getCust/{id}")
	public Customer getData( @PathVariable Integer id){
		Customer customer = new Customer();
		customer.setId(id);
		customer.setActive(true);
		customer.setFirstName("MS");
		customer.setLastName("Dhoni");
		Address address = new Address("Wadala RD","Mumbai","Maharashtra", "400037","IND");
		customer.setAddress(address);
		 Set<String> lang = new HashSet<String>();
		 lang.add("Python");
		 lang.add("Ruby");
		 lang.add("Java");
		 lang.add("C++");
		customer.setLanguages(lang);
		customer.setCompany("Infosys");
		Map<String, Object> idDetails = new HashMap<String, Object>();
		idDetails.put("addhar", 85656);
		idDetails.put("PAN", "DOKPA03");
		idDetails.put("License", "SKIJ234");
		customer.setIdDetails(idDetails);

		return customer;
	}
	@PostMapping("/save")
	public void save(@RequestBody Customer customer) {
		System.out.println(customer);
	}
}
