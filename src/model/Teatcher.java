package model;

import util.Contador;

public class Teatcher extends Person {

	private Integer id;
	
	public Teatcher(String name, String birthDate) {
		super(name, birthDate);
		this.id = Contador.nextId();
	}

	public Integer getId() {
		return id;
	}


}
