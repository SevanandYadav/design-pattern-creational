package com.arsenal.creational.builder;

//Using HowToJava-Practical scnario explained
public class User {
	private final String FirstName;
	private final String LastName;
	private final int age;
	private final String Address;


	private User(UserBuilder builder) {
		this.FirstName = builder.FirstName;
		this.LastName= builder.LastName;
		this.age=builder.age;
		this.Address=builder.Address;
	}
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return Address;
	}
@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + ", Address=" + Address
				+ "]";
	}

	


}
