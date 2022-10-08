package util;

public class Contador {
	

	private static Integer cont = 0;
	private static Integer regist = 0;
	
	public static Integer nextId() {
		return cont++;
	}
	
	public static Integer nextReg() {
		return regist++;
	}
}
