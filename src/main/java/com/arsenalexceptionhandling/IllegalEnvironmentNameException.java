package com.arsenalexceptionhandling;

public class IllegalEnvironmentNameException extends Exception {

	/**
	 * Custom exception for illegal env
	 * @input mesg
	 * @throws custom exceptin
	 */
	public IllegalEnvironmentNameException(String mesg) {
		// TODO Auto-generated constructor stub
		super(mesg);
	}
	
	/**
	 * Custom exception for illegal env
	 * hadling inbuild-exception throught ours for adding abstration Layer and more readibility
	 * @input mesg
	 * @throws custom exceptin
	 */
	public IllegalEnvironmentNameException(String mesg,Throwable cause) {
		// TODO Auto-generated constructor stub 
		super(mesg,cause);
	}

}
