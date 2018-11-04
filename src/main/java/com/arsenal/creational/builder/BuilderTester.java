package com.arsenal.creational.builder;

public class BuilderTester {

	public BuilderTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		User user1=new User.UserBuilder("sevanand"," yadav").age(25).build();
		
		System.out.println(user1);
		
		User user2=new User.UserBuilder("sevanand"," yadav").build();
		System.out.println(user2);
		
		User user3=new User.UserBuilder("sevanand"," yadav").age(25).Address("Pune").build();
		System.out.println(user3);
	}

}
