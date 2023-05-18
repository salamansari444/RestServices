package in.ineuron.response;

import lombok.Data;

@Data
public class CurrencyResponse {
	private Integer currencyID;
	private String currencyFrom;
	private String currencyTo;
	private Integer currencyValue;
}
