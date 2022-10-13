package service;

import java.util.List;
import java.util.Scanner;

import model.Person;
import model.Student;
import model.User;
import repository.PersonRepository;
import repository.Repository;
import repository.StudentRepository;

public class UserService {

	/* Dependency Injections */
	Scanner sc;
	Repository<User> userRepository = new Repository<>();
//	Repository<Person> personRepository = new Repository<>();
//	Repository<Student> studentRepository = new Repository<>();
	PersonRepository personRepository = new PersonRepository();
	StudentRepository studentRepository = new StudentRepository();

	/* Constructor with parameters */

	public UserService(Scanner sc) {
		this.sc = sc;
	}

	public User checkCpf(String cpf) {
		List<Person> listPerson = this.personRepository.findAll();
		for (Person person : listPerson) {
			if (person.getCpf().equalsIgnoreCase(cpf)) {
				System.out.println("O CPF informado já existe para esta pessoa! Tente novamente!");
				return person;
			}
		}

		List<Student> listStudent = this.studentRepository.findAll();
		for (Student student : listStudent) {
			if (student.getCpf().equalsIgnoreCase(cpf)) {
				System.out.println("O CPF informado já existe para este estudante! Tente novamente!");
				return student;
			}
		}

		return this.saveUser(cpf);
	}

	private User saveUser(String user) {
		System.out.println("Informe seu nome: ");
		sc.next();
		String name = sc.nextLine();
		System.out.println("Digite a data de nascimento: ");
		String dateBirth = sc.nextLine();
		System.out.println("Digite seu telefone: ");
		String phone = sc.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = sc.nextLine();

		System.out.println("Deseja informar nota final do curso:");
		System.out.println("| 1. Informar");
		System.out.println("| 2. Não informar");
		int info = sc.nextInt();

		if (info == 2) {
			Person newPerson = new Person(name, dateBirth, phone, cpf);
			this.personRepository.save(newPerson);
			System.out.println("Pessoa cadastrada com sucesso!");
			return newPerson;
		} else if (info == 1) {
			System.out.println("Informe a nota final do curso: ");
			double gradeFinal = sc.nextDouble();
			Student student = new Student(name, gradeFinal, dateBirth, phone, cpf);
			this.studentRepository.save(student);
			return student;
		}
		return null; // verificar o retorno
	}

	public User findUser(String user) {
		int optionChoose = sc.nextInt();
		if (optionChoose == 1) {
			System.out.println("Informe o CPF da pessoa: ");
			String cpfPerson = sc.next();

			Person person = this.personRepository.findForCpf(cpfPerson);
			person.printData();
			return person;

		} else if (optionChoose == 2) {
			System.out.println("Informe o CPF do aluno: ");
			String cpfStudent = sc.next();

			Student student = this.studentRepository.findForCpf(cpfStudent);
			student.printData();
			return student;

		} else if (optionChoose == 3) {
			System.out.println("Operação encerrada!");
		}
		return null;
	}
}
