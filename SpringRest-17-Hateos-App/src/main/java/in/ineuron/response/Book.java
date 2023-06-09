package in.ineuron.response;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book extends RepresentationModel {
	private String isbn;
	private String name;
	private Double price;
	private String author;
	
}
