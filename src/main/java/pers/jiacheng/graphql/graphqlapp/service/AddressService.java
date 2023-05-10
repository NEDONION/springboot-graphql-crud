package pers.jiacheng.graphql.graphqlapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jiacheng.graphql.graphqlapp.model.Address;
import pers.jiacheng.graphql.graphqlapp.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;

	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
}
