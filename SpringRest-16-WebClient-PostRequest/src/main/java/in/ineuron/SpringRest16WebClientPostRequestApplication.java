package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ERailClientApp;

@SpringBootApplication
public class SpringRest16WebClientPostRequestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRest16WebClientPostRequestApplication.class, args);
		ERailClientApp bean = context.getBean(ERailClientApp.class);
		bean.invokeRestApi();
	
	}

}
