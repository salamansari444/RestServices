package in.ineuron.request;

import lombok.Data;

@Data
public class PassengerInfo {
	private String firstName;
	private String lastName;
	private String journeyDate;
	private String from;
	private String to;
	private String trainNo;
}
