package com.arsenal.creational.singleton;

import java.io.Serializable;

public class SingletonSelfIMplementation implements Serializable {
	int count = 0;// some resouce only to be accessed using single instance
	private static volatile SingletonSelfIMplementation instanceOfClass; // =new SingletonSelfIMplementation();;

	// 1.Private the constructir
	private SingletonSelfIMplementation() {
	}

	// 2.Expose the object using static factory
	public static SingletonSelfIMplementation getInstance() {
//
		// Double lock check
		if (instanceOfClass == null) {// firsdt check
			synchronized (SingletonSelfIMplementation.class) {
				if (instanceOfClass == null)
					instanceOfClass = new SingletonSelfIMplementation();
			}
		}
		return instanceOfClass;
	}

	protected SingletonSelfIMplementation readResolve() {
		return getInstance();
	}

}
