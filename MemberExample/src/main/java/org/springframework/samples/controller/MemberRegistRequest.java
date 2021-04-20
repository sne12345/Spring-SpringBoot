package org.springframework.samples.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.model.Address;

public class MemberRegistRequest {
	private String name;
	private Address address;
	private String email;
	private String password;
	private String confirmPassword;
	private boolean allowNoti;
	
	@DateTimeFormat(pattern="yyyyMMdd")
	private Date birthday;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public boolean isAllowNoti() {
		return allowNoti;
	}

	public void setAllowNoti(boolean allowNoti) {
		this.allowNoti = allowNoti;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isSamePasswordConfirmPassword() {
		if (password == null || confirmPassword == null)
			return false;
		return password.equals(confirmPassword);
	}

	public boolean hasPassword() {
		return password != null && password.trim().length() > 0;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "MemberRegistRequest [name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", allowNoti=" + allowNoti + ", birthday="
				+ birthday + "]";
	}
}
