package com.dp.singleton;

public class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (instance == null) {
			
			instance = new Singleton();

		}

		return instance;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
