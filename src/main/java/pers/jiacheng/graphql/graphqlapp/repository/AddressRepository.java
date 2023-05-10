package pers.jiacheng.graphql.graphqlapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.jiacheng.graphql.graphqlapp.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
