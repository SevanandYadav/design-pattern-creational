package com.arsenalexceptionhandling;

public class EnvironmentSupply {

	public EnvironmentSupply() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example-1 cutom exception 
		String env="right env";
		if(!env.equals(env))
		{
			System.out.println("correct");
		}
		else
		{
			try {
				throw new IllegalEnvironmentNameException("Please supply CorrectEnvironment Name");
			} catch (IllegalEnvironmentNameException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		//Example-2 inuilt exception handled through cutom exception
		int num=6;
		try{
			System.out.println(num/0);
		}
		catch(ArithmeticException ex){
			
			try {
				throw new IllegalEnvironmentNameException("Own created Arithmeatic Excdeptionm", ex);
			} catch (IllegalEnvironmentNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
