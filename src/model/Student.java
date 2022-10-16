package model;

import util.Counter;

public class Student extends User {

	private Integer id;
	private double gradeFinal;

	public Student(String name, double gradeFinal, String birthDate, String phone, String cpf) {
		super(name, birthDate, phone, cpf);
		this.gradeFinal = gradeFinal;
		this.id = Counter.nextId();

	}

	/* Getters and Setters */

	@Override
	public Integer getId() {
		return super.getId();
	}

	public double getGradeFinal() {
		return gradeFinal;
	}

	public void setGradeFinal(double gradeFinal) {
		this.gradeFinal = gradeFinal;
	}

	@Override
	public void printData() {
		System.out.println(
				"====================================================================================================\n"
						+ "|ID: " + getId() + "\n" + "|Nome: " + getName() + "\n" + "|Data de nascimento: "
						+ getBirthDate() + "\n" + "|Telefone: " + getPhone() + "\n" + "|CPF: " + getCpf() + "\n"
						+ "|Nota final do curso: " + getGradeFinal() + "\n" + "| Data do cadastro: " + getDateCreate()
						+ "\n" + "|Atualizado em: " + getDateUpdate() + "\n"
						+ "====================================================================================================");
	}

}
