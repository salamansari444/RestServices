package in.ineuron.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Actor;

@RestController
@RequestMapping("/api/actor")
public class ActorOperationController {

	@GetMapping("/wish")
	public ResponseEntity<String> displayMsg() {
		LocalDateTime ltd = LocalDateTime.now();
		int hour = ltd.getHour();
		String user = "Salam";
		String body = null;
		if (hour < 12) {
			body = "Good Morning " + user;
		} else if (hour < 16)
			body = "Good AfterNoon " + user;
		else if (hour < 20)
			body = "Good Evening:: " + user;
		else
			body = "Good Night:: " + user;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

	@GetMapping("/wish/{id}/{name}")
	public ResponseEntity<String> displayMsg(@PathVariable Integer id, @PathVariable String name) {
		LocalDateTime ltd = LocalDateTime.now();
		int hour = ltd.getHour();
		String user = "Salam";
		String body = null;
		if (hour < 12) {
			body = "Good Morning " + user + "  " + name + " Associated with id is : " + id;
		} else if (hour < 16)
			body = "Good AfterNoon " + user + "  " + name + " Associated with id is : " + id;
		else if (hour < 20)
			body = "Good Evening:: " + user + "  " + name + " Associated with id is : " + id;
		else
			body = "Good Night:: " + user + "  " + name + " Associated with id is : " + id;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerActor(@RequestBody Actor actor){
		return new ResponseEntity<String>("Actor Data is : "+actor.toString(), HttpStatus.OK);	
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity<Actor> searchActor(@PathVariable Integer id){
		return new ResponseEntity<Actor>(new Actor(id,"Balam",22.0f,"Gay"),HttpStatus.OK);
	}
	
	
}
