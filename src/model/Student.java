package model;

import java.time.LocalDateTime;
import java.util.Objects;

import util.Contador;

public class Student extends Person {

	private Integer id;

	private Integer registration;

	public Student(String name, String phone, String birthDate, LocalDateTime dataCadastroPessoa) {
		super(name, phone, birthDate, dataCadastroPessoa);
	}

	public Student(String name, String phone, String birthDate, LocalDateTime dataCadastroPessoa,
			Integer registration) {
		super(name, phone, birthDate, dataCadastroPessoa);
		this.id = Contador.nextId();

		this.setDataCadastroPessoa(LocalDateTime.now());
		this.registration = registration;
	}

	/* Getters and Setters */

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, registration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && registration == other.registration;
	}

}
