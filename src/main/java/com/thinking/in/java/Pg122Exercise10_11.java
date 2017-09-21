package com.thinking.in.java;

public class Pg122Exercise10_11 {
	boolean check = false;

	public Pg122Exercise10_11(boolean checked) {
		check = checked;
	}

	void checkIn() {
		check = false;
	}

	protected void finalize() throws Throwable {
		if (!check) {
			System.out.println("Error detected : ");
			super.finalize();
		}
	}


	public static void main(String[] args) {
		Pg122Exercise10_11 obj = new Pg122Exercise10_11(true);
		obj.checkIn();
		Pg122Exercise10_11 obj2 = new Pg122Exercise10_11(true);
		obj2.checkIn();
		new Pg122Exercise10_11(true); 
		System.gc();
	}
}
