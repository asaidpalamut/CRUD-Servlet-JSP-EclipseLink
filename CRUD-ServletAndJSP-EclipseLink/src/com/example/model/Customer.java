package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends BaseModel {

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@Column(name = "email")
	private String email;

	@ElementCollection
	@CollectionTable(name = "customer_phones")
	private List<String> phones = new ArrayList<>();

	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(name = "street", column = @Column(name = "street")),
			@AttributeOverride(name = "road", column = @Column(name = "road")),
			@AttributeOverride(name = "no", column = @Column(name = "no")),
			@AttributeOverride(name = "city", column = @Column(name = "city")),
			@AttributeOverride(name = "zip", column = @Column(name = "zip")) })
	private Address address;

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", email=" + email + ", phones=" + phones
				+ ", address=" + address + "]";
	}

}
