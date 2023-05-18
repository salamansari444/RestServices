package in.ineuron.handler;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.error.ErrorDetails;
import in.ineuron.exception.StudentNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorDetails> StudentNotFoundExceptionHandler(StudentNotFoundException se){
	
		return new ResponseEntity<ErrorDetails>
											(new ErrorDetails(LocalDateTime.now(), 
													se.getMessage(), 
													"Record Not Available"), 
													HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> ExceptionHandler(Exception e){
	
		return new ResponseEntity<ErrorDetails>
											(new ErrorDetails(LocalDateTime.now(), 
													e.getMessage(), 
													"Internal Server Error"), 
													HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
