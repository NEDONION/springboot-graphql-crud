package pers.jiacheng.graphql.service;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.jiacheng.graphql.model.Address;
import pers.jiacheng.graphql.model.Person;
import pers.jiacheng.graphql.repository.AddressRepository;
import pers.jiacheng.graphql.repository.PersonRepository;


@Component
public class PersonService implements GraphQLQueryResolver {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Person getPersonById(Integer person_id){
        return personRepository.findById(person_id).get();
    }

    public List<Person> getAllPersons(){
       return personRepository.findAll();
    }

    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

}
