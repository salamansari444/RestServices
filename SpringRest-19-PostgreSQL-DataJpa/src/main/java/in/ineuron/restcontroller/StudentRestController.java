package in.ineuron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Student;
import in.ineuron.service.IStudentService;


@RestController
@RequestMapping("/api/student")
public class StudentRestController {
	
	@Autowired
	private IStudentService service;
	
	@PostMapping("/register")
	/* @ApiOperation("for Tourist Registration") */
	public ResponseEntity<String> registerStudent(@RequestBody Student student){
		String body = service.saveStudent(student);
		return new ResponseEntity<String>(body,HttpStatus.OK);
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> displayStudentDetails(){
		List<Student> allStudent = service.getAllStudent();
		return new ResponseEntity<List<Student>>(allStudent,HttpStatus.OK); 
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayStudentById(@PathVariable Integer id){
		Student studentByID = service.getStudentByID(id);
		
		return new ResponseEntity<Student> (studentByID,HttpStatus.OK); 
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		String body = service.updateStudent(student);
		
		return new ResponseEntity<String>(body,HttpStatus.OK); 
	}
	
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> removeStudentById(@PathVariable("id") Integer id) {
		String body = service.deleteStudentById(id);
		return new ResponseEntity<String>(body,HttpStatus.OK); 
	}
}
