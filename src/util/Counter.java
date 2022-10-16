package util;

public class Counter {
	

	private static Integer count = 0;
	
	public static Integer nextId() {
		count++;
		return count;
	}
	
}
