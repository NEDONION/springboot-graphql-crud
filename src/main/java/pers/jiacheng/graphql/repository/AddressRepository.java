package pers.jiacheng.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.jiacheng.graphql.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
