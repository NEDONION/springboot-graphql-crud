package pers.jiacheng.graphql.service;

import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jiacheng.graphql.model.Address;
import pers.jiacheng.graphql.model.Person;
import pers.jiacheng.graphql.repository.AddressRepository;
import pers.jiacheng.graphql.repository.PersonRepository;

@Service
public class DataLoaderService {

	@Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;
    
    @PostConstruct
    public void loadData(){
    	Stream.of(
				  new Address(1, "New York City", "10001"),
				  new Address(2, "Dallas", "20002"),
				  new Address(3, "LA","30003")
	        ).forEach(address -> {
	        	addressRepository.save(address);
	        });

    	Stream.of(
				  new Person(1, "Richard", "Richard@test.com",1),
				  new Person(2, "Nate", "Nate@test.com", 2),
				  new Person(3, "Lucy", "Lucy@test.com",3)
	        ).forEach(person -> {
	        	personRepository.save(person);
	        });
    }
}
