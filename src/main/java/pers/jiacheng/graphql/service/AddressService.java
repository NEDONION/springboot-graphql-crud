package pers.jiacheng.graphql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.jiacheng.graphql.model.Address;
import pers.jiacheng.graphql.repository.AddressRepository;

@Component
public class AddressService implements GraphQLQueryResolver {
	@Autowired
	private AddressRepository addressRepository;

	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
}
