package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/read")
	public ResponseEntity<String> getEmployee(@RequestParam Integer id,@RequestParam String name){
		System.out.println("employee found with id :"+id +" and name is : "+name);
		return new ResponseEntity<>("employee found with id :"+id +" and name is : "+name ,  HttpStatus.OK);
	}

	
}