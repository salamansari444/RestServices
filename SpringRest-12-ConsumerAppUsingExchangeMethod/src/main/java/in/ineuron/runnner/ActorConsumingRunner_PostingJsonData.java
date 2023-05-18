package in.ineuron.runnner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ActorConsumingRunner_PostingJsonData implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ActorConsumingRunner_PathVariable.run()");

		RestTemplate template = new RestTemplate();
		String serviceUrl = "http://localhost:9999/SpringRest-10-providerApp/api/actor/register";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String json_body = "{\r\n" + "        \"aid\": 12,\r\n" + "        \"name\": \"Balam\",\r\n"
				+ "        \"age\": \"22\",\r\n" + "        \"type\": \"Gay\"\r\n" + "    }";

		HttpEntity<String> entity = new HttpEntity<String>(json_body, headers);

		ResponseEntity<String> responseEntity = template.exchange(serviceUrl, 
															HttpMethod.GET, 
															entity, 
															String.class);

		System.out.println("Response Body : " + responseEntity.getBody());
		System.out.println("Response Status : " + responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code : " + responseEntity.getStatusCode().name());
		System.out.println("--------------------------------------------------------------------");
	}

}
