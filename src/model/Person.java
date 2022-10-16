package model;

import util.Counter;

public class Person extends User {

	private Integer id;

	public Person(String name, String birthDate, String phone, String cpf) {
		super(name, birthDate, phone, cpf);
		this.id = Counter.nextId();
	}
}
