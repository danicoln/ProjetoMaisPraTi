package model;

import util.Contador;

public class Student extends User {

	private Integer id;

	public Student(String name, String birthDate, String phone, String cpf) {
		super(name, birthDate, phone, cpf);
		this.id = Contador.nextId();
	}

	/* Getters and Setters */

	@Override
	public Integer getId() {
		return super.getId();
	}
}
