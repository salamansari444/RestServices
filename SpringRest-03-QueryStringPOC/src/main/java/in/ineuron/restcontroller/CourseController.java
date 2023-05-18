package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@GetMapping("/info/{id}")
	public ResponseEntity<String> getEmployee(@PathVariable Integer id){
		System.out.println("employee found with id :"+id );
		
		String body=null;
		if(id==5) {
				body="Nitin from iNeuron Taking lecture on SpringBoot";
		}
		else if(id==6) {
			body="Hyder from iNeuron Taking lecture on Java";
		}
		else {
			body="contact ineuron for information";
		}
		return new ResponseEntity<>(body ,  HttpStatus.OK);
	}

	
}