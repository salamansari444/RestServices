package in.ineuron;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.model.Address;
import in.ineuron.model.Customer;

/**
 * Hello world!
 *
 */
public class TestApp 
{
    public static void main( String[] args ) {
    	
    	try {
    		//Create Object Mapper
    		ObjectMapper mapper = new ObjectMapper();
    		
    	Customer customer = new Customer();
    		customer = getCustomerDetails(customer);
    		System.out.println("java data : "+customer);
//    		String jsonData = mapper.writeValueAsString(customer);
    		mapper.writeValue(new File("cust.json"), customer);
//    		System.out.println("json Data : "+jsonData);
    		
    	} catch (IOException e) {
			
			e.printStackTrace();
		}
}
    
    public static Customer getCustomerDetails(Customer customer) {

    	customer.setActive(false);
    	customer.setId(12);
    	customer.setFirstName("Salam");
    	customer.setLastName("Ansari");
    	Address addr=new Address();
    	addr.setCity("Mumbai");
    	addr.setStreet("Barkat Ali Road");
    	addr.setState("Maharashtra");
    	addr.setZip("400037");
    	addr.setCountry("India");
    	customer.setAddress(addr);
    	Set<String> languages=new HashSet<String>();
    	languages.add("Java");
    	languages.add("Servlet");
    	languages.add("C#");
    	languages.add(".Net");
    	customer.setLanguages(languages);
    	
    	return customer;
    }
}
