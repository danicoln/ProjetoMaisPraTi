package util;

public class Contador {
	

	private static Integer cont = 0;
	
	public static Integer nextId() {
		return cont++;
	}
}
