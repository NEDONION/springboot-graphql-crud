package pers.jiacheng.graphql.graphqlapp.service;

import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jiacheng.graphql.graphqlapp.model.Address;
import pers.jiacheng.graphql.graphqlapp.model.Person;
import pers.jiacheng.graphql.graphqlapp.repository.AddressRepository;
import pers.jiacheng.graphql.graphqlapp.repository.PersonRepository;

@Service
public class DataLoaderService {

	@Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;
    
    @PostConstruct
    public void loadData(){
    	Stream.of(
				  new Address("1", "New York City", "10001"),
				  new Address("2", "Pune", "410081"),
				  new Address("3","Banglore","560031")
	        ).forEach(address -> {
	        	addressRepository.save(address);
	        });

    	Stream.of(
				  new Person("Alok", "alok.ranjan@accionlabs.com",1,"Sepetember 2017"),
				  new Person("Ranjan", "ranjan@accionlabs.com",2, "June 2019"),
				  new Person("Alok Ranjan", "ar_alok@accionlabs.com",3, "Jan 2012")
	        ).forEach(person -> {
	        	personRepository.save(person);
	        });
    }
}
