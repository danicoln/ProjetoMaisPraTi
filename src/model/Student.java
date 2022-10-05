package model;

import java.util.Date;
import java.util.Objects;

import util.Contador;

public class Student extends Person {

	private Integer id;

	private String phone;
	private Date dataCadastroPessoa;
	private Date dateChange;
	private int registration;

	public Student(String name, String birthDate) {
		super(name, birthDate);
	}

	public Student(String name, String birthDate, String phone, Date dataCadastroPessoa, Date dateChange,
			int registration) {
		super(name, birthDate);
		this.id = Contador.nextId();

		this.phone = phone;
		this.dataCadastroPessoa = dataCadastroPessoa;
		this.dateChange = dateChange;
		this.registration = registration;
	}

	/* Getters and Setters */

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDataCadastroPessoa() {
		return dataCadastroPessoa;
	}

	public void setDataCadastroPessoa(Date dataCadastroPessoa) {
		this.dataCadastroPessoa = dataCadastroPessoa;
	}

	public Date getDateChange() {
		return dateChange;
	}

	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

}
