package pers.jiacheng.graphql.graphqlapp.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.jiacheng.graphql.graphqlapp.model.Address;
import pers.jiacheng.graphql.graphqlapp.model.Person;
import pers.jiacheng.graphql.graphqlapp.repository.AddressRepository;

@Component
public class AddressResolver implements GraphQLResolver<Person> {

    @Autowired
    private AddressRepository repository;


    public Address getAddress(Person person){
        return repository.findById(person.getAddressId()).get();
    }
}
