package com.bloodbank.model;



public class Donor {

	private Integer d_id;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String gender;
	private String age;
	private String state;
	private String blood_group;
	private String dob;
	private String city;

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Donor [d_id=" + d_id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", email="
		+ email + ", gender=" + gender + ", age=" + age + ", city=" + city + ", blood_group="
		+ blood_group + ", state=" + state + ",city=" + city + "]";
}
	
	public Integer getd_id() {
		return d_id;
	}
	public void setd_id(Integer d_id) {
		this.d_id = d_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
	
	
}
