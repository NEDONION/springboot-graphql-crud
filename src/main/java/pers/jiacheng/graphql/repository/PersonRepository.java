package pers.jiacheng.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.jiacheng.graphql.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	
}
	