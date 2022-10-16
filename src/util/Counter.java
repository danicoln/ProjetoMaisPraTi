package util;

public class Counter {
	

	private static Integer cont = 0;
	
	public static Integer nextId() {
		return cont++;
	}
	
}
