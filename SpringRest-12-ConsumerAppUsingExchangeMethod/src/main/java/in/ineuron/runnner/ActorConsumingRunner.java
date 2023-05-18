package in.ineuron.runnner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ActorConsumingRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ActorConsumingRunner.run()");
		
		RestTemplate template = new RestTemplate();
		String serviceUrl="http://localhost:9999/SpringRest-10-providerApp/api/actor/wish";
		ResponseEntity<String> responseEntity = template.exchange(serviceUrl, 
																HttpMethod.GET, 
																null, 
																String.class);
		
		System.out.println("Response Body : "+responseEntity.getBody());
		System.out.println("Response Status : "+responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code : "+responseEntity.getStatusCode().name());
		System.out.println("--------------------------------------------------------------------");
	}

}
