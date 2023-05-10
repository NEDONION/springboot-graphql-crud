package pers.jiacheng.graphql.graphqlapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.jiacheng.graphql.graphqlapp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	
}
	