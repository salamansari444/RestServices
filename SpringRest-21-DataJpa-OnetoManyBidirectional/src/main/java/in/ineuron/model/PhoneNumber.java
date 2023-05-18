package in.ineuron.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "OTM_PhoneNumber")
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regNo;
	@NonNull
	private Long phoneNo;
	@NonNull
	private String provider;
	@NonNull
	private String type;
	
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="PERSON_ID" ,referencedColumnName = "pid")
	private Person person;


	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNo=" + phoneNo + ", provider=" + provider + ", type=" + type
				+ "]";
	}




}
