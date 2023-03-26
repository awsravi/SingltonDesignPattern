package com.dp.singleton;

public class SingletonDoubleCheck {

	private static volatile SingletonDoubleCheck instance;

	private SingletonDoubleCheck() {
	}

	public static SingletonDoubleCheck getInstance() {

		if (instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {

					instance = new SingletonDoubleCheck();

				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonDoubleCheck s1 = SingletonDoubleCheck.getInstance();
		SingletonDoubleCheck s2 = SingletonDoubleCheck.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
