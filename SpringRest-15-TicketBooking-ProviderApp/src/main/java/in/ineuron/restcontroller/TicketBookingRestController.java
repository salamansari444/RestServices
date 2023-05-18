package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.request.PassengerInfo;
import in.ineuron.response.Ticket;

@RestController
@RequestMapping("/api/ticket")
public class TicketBookingRestController {
	
	@PostMapping("/register")
	public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerInfo passenger){
		Ticket ticket = new Ticket();
		ticket.setTicketId("MU1278PUN");
		ticket.setFirstName(passenger.getFirstName());
		ticket.setLastName(passenger.getLastName());
		ticket.setJourneyDate(passenger.getJourneyDate());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setTrainNo(passenger.getTrainNo());
		ticket.setTicketPrice(500.0);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
}
