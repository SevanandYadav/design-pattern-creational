package com.arsenal.creational.builder;



public class UserBuilder
{
	private final static String FirstName;
	private final static String LastName;
	private  static int age;
	private  static String Address;
	public UserBuilder(String FirstName,String LastName)
	{
	this.FirstName=FirstName;
	this.LastName=LastName;
	}
	public UserBuilder age(int age){
		this.age=age;
		return this;
	}
	public UserBuilder Address(String address)
	{
		this.Address=address;
		return this;
	}
	public User build(){
		User user=new User(this);
		return user;
	}
}

