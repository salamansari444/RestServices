package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.response.CurrencyResponse;

@RestController
@RequestMapping("/api/currency")
public class CurrencyConverterApp {
	
	@GetMapping(value = "/getCurrencyExchangeCost/from/{from}/to/{to}")
	public ResponseEntity<CurrencyResponse> getCurrencyvalue(@PathVariable String from,@PathVariable String to){
		CurrencyResponse response=new CurrencyResponse();
		response.setCurrencyID(1);
		response.setCurrencyFrom("USD");
		response.setCurrencyTo("INR");
		response.setCurrencyValue(80);
		
		return new ResponseEntity<CurrencyResponse>(response,HttpStatus.OK);
	}
}
