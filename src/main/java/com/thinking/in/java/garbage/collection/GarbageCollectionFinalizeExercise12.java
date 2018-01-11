package com.thinking.in.java.garbage.collection;

public class GarbageCollectionFinalizeExercise12 {
	public static void main(String[] args) {
		Tank tank = new Tank();

	}
}

class Tank {

	boolean isEmpty = false;

	Tank(){
		
	}
	void checkTankEmpty() {
		isEmpty = true;
	}

	@Override
	protected void finalize() throws Throwable {
		if (isEmpty) {
			System.out.println("Error detected : tank is empty : " +isEmpty);
			super.finalize();
		}
	}
}