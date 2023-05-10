package pers.jiacheng.graphql.graphqlapp.service;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.jiacheng.graphql.graphqlapp.model.Address;
import pers.jiacheng.graphql.graphqlapp.model.Person;
import pers.jiacheng.graphql.graphqlapp.repository.AddressRepository;
import pers.jiacheng.graphql.graphqlapp.repository.PersonRepository;

@Component
public class MutationService implements GraphQLMutationResolver {

	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddress(final String city , final String house_no, final String zipcode ) {
		 Address address = new Address();
		 address.setCity(city);
		 address.setZipcode(zipcode);
		 addressRepository.save(address);
		 return address;
	 }
	
	 public Person createPerson(final String name, final String email, final String dob, final Integer addressId) {
		 Person person = new Person();
		 person.setName(name);
		 person.setEmail(email);
		 person.setAddressId(addressId);
		 personRepository.save(person);
		return person;
	 }
	 
	 public boolean deleteAddress(Integer id) {
		 addressRepository.deleteById(id);
		return true;
	 }
	 
	 public boolean deletePerson(Integer id) {
		 personRepository.deleteById(id);
		return true;
	 }

	 
}
