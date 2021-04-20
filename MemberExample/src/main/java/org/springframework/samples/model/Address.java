package org.springframework.samples.model;

public class Address {

	private String zipcode;
	private String address1;
	private String address2;

	public Address() {
	}
	
	public Address(String zipcode, String address1, String address2) {
		super();
		this.zipcode = zipcode;
		this.address1 = address1;
		this.address2 = address2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2
				+ ", zipcode=" + zipcode + "]";
	}	
}
