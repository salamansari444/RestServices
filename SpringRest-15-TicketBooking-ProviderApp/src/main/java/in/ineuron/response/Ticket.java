package in.ineuron.response;

import lombok.Data;

@Data
public class Ticket {
	private String ticketId;
	private Double ticketPrice;
	private String firstName;
	private String lastName;
	private String journeyDate;
	private String from;
	private String to;
	private String trainNo;
}
