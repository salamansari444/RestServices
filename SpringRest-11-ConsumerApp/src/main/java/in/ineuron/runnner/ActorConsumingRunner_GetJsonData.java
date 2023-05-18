package in.ineuron.runnner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ActorConsumingRunner_GetJsonData implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ActorConsumingRunner_PathVariable.run()");
		
		RestTemplate template = new RestTemplate();
		String serviceUrl="http://localhost:9999/SpringRest-10-providerApp/api/actor/find/{id}";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 12);
		
		ResponseEntity<String> responseEntity = template.getForEntity(serviceUrl, String.class,map);
		
		
		System.out.println("Response Body : "+responseEntity.getBody());
		System.out.println("Response Status : "+responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code : "+responseEntity.getStatusCode().name());
		System.out.println("--------------------------------------------------------------------");
	}

}
