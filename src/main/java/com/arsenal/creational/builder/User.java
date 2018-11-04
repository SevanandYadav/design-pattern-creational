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

public static class UserBuilder{
	String FirstName;
	String LastName;
	int age;
	String Address;
	public UserBuilder(String FirstName,String LastName)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
	}
	public UserBuilder age(int age){
		this.age=age;
		return this;
	}
	public UserBuilder Address(String Address){
		this.Address=Address;
		return this;
	}
	public User build(){
		User user=new User(this);
		//validate oblject
		validatUserObject();
		return user;
	}
	//UserBuilder(int); 
	public void  validatUserObject(){
	//	if()
	}
}	
}
