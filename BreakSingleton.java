package com.dp.singleton;

public class BreakSingleton implements Cloneable {

	private static volatile BreakSingleton instance;

	private BreakSingleton() {
	}

	public static BreakSingleton getInstance() {

		if (instance == null) {
			instance = new BreakSingleton();

		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		BreakSingleton s1 = BreakSingleton.getInstance();
		BreakSingleton s2 = (BreakSingleton) s1.clone();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
