package in.ineuron.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.request.PassengerInfo;
import in.ineuron.response.Ticket;

@Service
public class ERailClientApp {
	private static final String REST_END_POINT="http://localhost:9999/SpringRest-15-TicketBooking-ProviderApp/api/ticket/register";
	public void invokeRestApi() {
		WebClient webClient = WebClient.create();
		PassengerInfo body = new PassengerInfo();
		body.setFirstName("Salam A");
		body.setLastName(" Ansari");
		body.setJourneyDate("22/05/2023");
		body.setFrom("Mumbai");
		body.setTo("Pune");
		body.setTrainNo("12322");
		Ticket response = webClient.
							post().
							uri(REST_END_POINT).
							accept(MediaType.APPLICATION_JSON).
							body(BodyInserters.fromValue(body)).
							retrieve().
							bodyToMono(Ticket.class).
							block();
		
		System.out.println(response);
	}

}
