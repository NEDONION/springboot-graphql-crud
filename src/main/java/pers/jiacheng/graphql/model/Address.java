package pers.jiacheng.graphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Integer address_id;

	@Column(name = "CITY")
	private	String city;

	@Column(name = "ZIPCODE")
	private	String zipcode;

	public Address(String city, String zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}
}
