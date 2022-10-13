package model;

import util.Contador;

public class Person extends User {

	private Integer id;

	public Person(String name, String birthDate, String phone, String cpf) {
		super(name, birthDate, phone, cpf);
		this.id = Contador.nextId();
	}

	@Override
	public void printData() {
		System.out.println("====================================================================================================");
		System.out.println("ID: "+ getId());
		System.out.println("Nome: "+ getName());
		System.out.println("Data de Nascimento: "+ getBirthDate());
		System.out.println("Telefone: " + getPhone());
		System.out.println("CPF: " +getCpf());
		System.out.println("Data do cadastro: " + getDateCreate());
		System.out.println("Data da alteração: " + getDateUpdate());
		System.out.println("====================================================================================================\n");
		super.printData();
	}

}
