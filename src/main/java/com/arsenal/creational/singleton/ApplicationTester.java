package com.arsenal.creational.singleton;

public class ApplicationTester {

	public static void main(String[] args) {
		SingletonSelfIMplementation instance1,instance2;
		//instance=new SingletonSelfIMplementation();
		instance1=SingletonSelfIMplementation.getInstance();
		instance2=SingletonSelfIMplementation.getInstance();
		System.out.println(instance1.count);
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance2==null);
		System.out.println(instance1==null);
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance2.equals(instance1));
		//will not a object gets the lock of thread? even if one thread is workeing for that u need to mention th esyncronized
		//Q-how to verify if there are more than 1 instances 
	}

}
