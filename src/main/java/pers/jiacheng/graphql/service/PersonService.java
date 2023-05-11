package pers.jiacheng.graphql.service;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.jiacheng.graphql.model.Person;
import pers.jiacheng.graphql.repository.PersonRepository;


@Component
public class PersonService implements GraphQLQueryResolver {

    @Autowired
    private PersonRepository personRepository;

    public Person getPersonById(Integer person_id){
        return personRepository.findById(person_id).get();
    }

    public List<Person> getAllPersons(){
       return personRepository.findAll();
    }
}
