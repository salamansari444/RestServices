package in.ineuron.service;

import in.ineuron.model.Person;
import in.ineuron.model.PhoneNumber;

public interface IPersonPhoneMngmtService {
	public String savePerson(Person person);
	public String savePhoneNumber(Iterable<PhoneNumber> numbers);
	
	public Iterable<Person> fetchByPerson();
	
	public Iterable<PhoneNumber> fetchByPhoneNumber();
	
	public String deleteByPerson(Integer personId);
	
	public String deleteAllPhoneNo(Integer personId);
}
