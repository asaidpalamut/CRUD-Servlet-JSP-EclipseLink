package com.example.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	private String road;
	private String no;
	private String city;
	private String zip;

	public Address() {
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", road=" + road + ", no=" + no + ", city=" + city + ", zip=" + zip + "]";
	}

}
