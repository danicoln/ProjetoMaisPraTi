package model;

import util.Contador;

public class Student extends User {

	private Integer id;
	private double gradeFinal;

	public Student(String name, double gradeFinal, String birthDate, String phone, String cpf) {
		super(name, birthDate, phone, cpf);
		this.gradeFinal = gradeFinal;
		this.id = Contador.nextId();
		
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
		super.printData();
	}

}
