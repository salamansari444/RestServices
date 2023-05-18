package in.ineuron.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Person;
import in.ineuron.model.PhoneNumber;
import in.ineuron.repo.IPersonRepository;
import in.ineuron.repo.IPhoneNumberRepository;

@Service
public class PersonPhoneMngmtServiceImpl implements IPersonPhoneMngmtService {
	
	@Autowired
	private IPersonRepository personRepo;
	
	@Autowired
	private IPhoneNumberRepository phoneRepo;
	

	@Override
	public String savePerson(Person person) {
		Integer pid = personRepo.save(person).getPid();
		return "Person and his No Details is  save with the id :: "+pid;
	}


	@Override
	public String savePhoneNumber(Iterable<PhoneNumber> numbers) {
		for (PhoneNumber phoneNumber : numbers) {
			phoneRepo.save(phoneNumber);
		}
		return ((Set<PhoneNumber>) numbers).size()+" no of PhoneNumber are saved";
	}


	@Override
	public Iterable<Person> fetchByPerson() {
		return personRepo.findAll();
	}


	@Override
	public Iterable<PhoneNumber> fetchByPhoneNumber() {
		return phoneRepo.findAll();
	}


	@Override
	public String deleteByPerson(Integer personId) {
		Optional<Person> optional = personRepo.findById(personId);
		if(optional.isPresent()) {
			personRepo.delete(optional.get());
			return "person got deleted with phone number whose id is : "+optional.get().getPid();
		}
		return "Record not available";
	}


	@Override
	public String deleteAllPhoneNo(Integer personId) {
		Optional<Person> optional = personRepo.findById(personId);
		if (optional.isPresent()) {
			Set<PhoneNumber> child = optional.get().getContactDetails();	
			child.forEach(phone->{
				phone.setPerson(null);
			});
			phoneRepo.deleteAll(child);
			return child.size()+" Phone no of "+personId+" person are deleted..";
		}
		return "Person not Found";
	}


}
