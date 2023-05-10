package pers.jiacheng.graphql.graphqlapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private Integer addres_id;

	@Column(name = "CITY")
	private	String city;

	@Column(name = "ZIPCODE")
	private	String zipcode;
}
