package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {
	
	@GetMapping("/report")
	public ResponseEntity<String> showCustomer(){
		return new ResponseEntity<>("From GET-showCustomerMethod" ,  HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(){
		return new ResponseEntity<>("From POST-registerCustomerMethod" ,  HttpStatus.OK);
	}

	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer(){
		return new ResponseEntity<>("From PUT-updateCustomerMethod" ,  HttpStatus.OK);
	}

	@PatchMapping("/pmodify")
	public ResponseEntity<String> updateCustomerByID(){
		return new ResponseEntity<>("From PATCH-updateCustomerByIDMethod" ,  HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(){
		return new ResponseEntity<>("From DELETE-deleteCustomerMethod" ,  HttpStatus.OK);
	}
	
}