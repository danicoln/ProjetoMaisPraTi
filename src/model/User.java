package model;

import java.time.LocalDateTime;
import java.util.Objects;

import util.Contador;

public class User implements Database {

	private Integer id;
	private String name;
	private String birthDate;
	private String phone;
	private String cpf;
	private LocalDateTime dateCreate = LocalDateTime.now();
	private LocalDateTime dateUpdate;

	/* Constructor with parameters */

	public User(String name, String birthDate, String phone, String cpf) {
		this.id = Contador.nextId();
		this.name = name;
		this.phone = phone;
		this.birthDate = birthDate;
		this.cpf = cpf;
		this.dateCreate = LocalDateTime.now();
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}

	public LocalDateTime getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(LocalDateTime dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	@Override
	public Integer getId() {
		return this.id;
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	public void printData() {
		System.out.println("====================================================================================================");
		System.out.println("ID: "+ getId());
		System.out.println("Nome: "+ getName());
		System.out.println("Data de Nascimento: "+ getBirthDate());
		System.out.println("Telefone: " + getPhone());
		System.out.println("CPF: " +getCpf());
		System.out.println("Data do cadastro: " + getDateCreate());
		System.out.println("Data da altera��o: " + getDateUpdate());
		System.out.println("====================================================================================================\n");
	}
}
