package com.thinking.in.java.garbage.collection;

public class GarbageCollectionFinalizeExercise10_11 {
	boolean check = false;

	public GarbageCollectionFinalizeExercise10_11(boolean checked) {
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
		GarbageCollectionFinalizeExercise10_11 obj = new GarbageCollectionFinalizeExercise10_11(true);
		obj.checkIn();
		GarbageCollectionFinalizeExercise10_11 obj2 = new GarbageCollectionFinalizeExercise10_11(true);
		obj2.checkIn();
		new GarbageCollectionFinalizeExercise10_11(true);
		System.gc();
	}
}
