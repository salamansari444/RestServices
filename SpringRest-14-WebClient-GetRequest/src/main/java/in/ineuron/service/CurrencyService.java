package in.ineuron.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.response.CurrencyResponse;

@Service
public class CurrencyService {

	private static final String REST_END_POINT= "http://localhost:9999/SpringRest-13-CurrencyConverter-ProviderApp/api/currency/getCurrencyExchangeCost/from/USD/to/INR";
	
	public void invokeRestApiSync(String from, String to) {
		System.out.println("------------**------------Synchronous Rest Call Started----------------**---------");
		// Sending Synchronous request
		
		WebClient webClient = WebClient.create();
		CurrencyResponse response = webClient.
										get().
										uri(REST_END_POINT,from,to).
										accept(MediaType.APPLICATION_JSON).
										retrieve().
										bodyToMono(CurrencyResponse.class).
										block();
		System.out.println(response);
		System.out.println("------------**------------Synchronous Rest Call End----------------**---------");
	}
	
	
	public void invokeRestApiASync(String from, String to) {
		System.out.println("------------------------ASynchronous Rest Call started-------------------------");
		// Sending ASynchronous request
		WebClient webClient = WebClient.create();
		webClient.
			get().
			uri(REST_END_POINT,from,to).
			accept(MediaType.APPLICATION_JSON).
			retrieve().
			bodyToMono(CurrencyResponse.class).
			subscribe(CurrencyService::myResponse);
		
		System.out.println("------------------------ASynchronous Rest Call End-------------------------");
	}
	
	public static void myResponse(CurrencyResponse response) {
		System.out.println(response);
		//use repsonse object as per the needs[push to Apache-kafka]
	}
}
