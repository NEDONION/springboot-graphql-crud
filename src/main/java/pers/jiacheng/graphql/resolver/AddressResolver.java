package pers.jiacheng.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.jiacheng.graphql.model.Address;
import pers.jiacheng.graphql.model.Person;
import pers.jiacheng.graphql.repository.AddressRepository;

@Component
public class AddressResolver implements GraphQLResolver<Person> {

    @Autowired
    private AddressRepository repository;

    public Address getAddress(Person person){
        return repository.findById(person.getAddressId()).get();
    }
}
