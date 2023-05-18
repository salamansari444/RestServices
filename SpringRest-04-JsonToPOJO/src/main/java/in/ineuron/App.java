package in.ineuron;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	try {
    		//Create Object Mapper
    		ObjectMapper mapper = new ObjectMapper();
    		
    		//ObjectmMppper (mapper) object read data from Json to Pojo
			
    		Customer customer = mapper.readValue(new File("data/sample-full.json"), Customer.class);
    		System.out.println(customer);
    	} catch (IOException e) {
			
			e.printStackTrace();
		}
}
}
