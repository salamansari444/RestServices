package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.response.CurrencyResponse;
import in.ineuron.service.CurrencyService;

@SpringBootApplication
public class SpringRest14WebClientGetRequestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRest14WebClientGetRequestApplication.class, args);
		CurrencyService bean = context.getBean(CurrencyService.class);
		
		String from="USD";
		String to="INR";
		bean.invokeRestApiSync(from, to);
	
		System.out.println("----------------------------------------------");
		
		bean.invokeRestApiASync(from, to);
	}

}
