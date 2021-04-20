package org.springframework.samples.controller.member;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.samples.model.Address;

public class MemberRegistRequest {
	private String name;
	
	@NotEmpty 
	@Size(min=6)
	private String password;
	
	@NotEmpty
	private String confirmPassword;
	
	//@AssertTrue
	//private boolean samePasswordConfirmPassword;
	
	@NotEmpty 
	@Pattern(regexp = "01[01679]-\\d{3,4}-\\d{4}")
	private String phone;
	
	@Valid
	private Address address;
	
	private String type;
	
	@NotEmpty
	private String title;
	
	//@NotNull
	//@Max(30)
	@Range(min=1, max=30)	// hibernate API
	private int length;
	
	private boolean newPerformer;
	
	@NotEmpty	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@AssertTrue
	public boolean isSamePasswordConfirmPassword() {
		if (password == null || confirmPassword == null)
			return false;
		return password.equals(confirmPassword);
	}

	public boolean hasPassword() {
		return password != null && password.trim().length() > 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isNewPerformer() {
		return newPerformer;
	}

	public void setNewPerformer(boolean newPerformer) {
		this.newPerformer = newPerformer;
	}

	@Override
	public String toString() {
		return "MemberRegistRequest [name=" + name + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", phone=" + phone + ", address=" + address + ", type=" + type + ", title=" + title + ", length="
				+ length + ", newPerformer=" + newPerformer + "]";
	}

	
}
