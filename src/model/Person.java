package model;

import java.time.LocalDateTime;

public abstract class Person {

	private String name;
	private String phone;
	private String birthDate;
	private LocalDateTime dataCadastroPessoa = LocalDateTime.now();
//	private LocalDateTime dataUltimaAlteracao; /*?? Ver como implementar */

	/* Constructor with parameters */

	public Person(String name, String phone, String birthDate, LocalDateTime dataCadastroPessoa) {
		this.name = name;
		this.setPhone(phone);
		this.birthDate = birthDate;
		this.dataCadastroPessoa = dataCadastroPessoa;
	}

	/* Getters and Setters */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDateTime getDataCadastroPessoa() {
		return dataCadastroPessoa;
	}

	public void setDataCadastroPessoa(LocalDateTime dataCadastroPessoa) {
		this.dataCadastroPessoa = dataCadastroPessoa;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
