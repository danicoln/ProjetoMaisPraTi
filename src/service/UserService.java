package service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import exception.ProgramException;
import menu.Menu;
import model.Person;
import model.Student;
import model.User;
import model.ValidationCpf;
import repository.PersonRepository;
import repository.Repository;
import repository.StudentRepository;
import repository.UserRepository;

public class UserService {

	/* Dependency Injections */
	Scanner sc;
	Repository<User> repository = new Repository<>();
	UserRepository userRepository = new UserRepository();
	PersonRepository personRepository = new PersonRepository();
	StudentRepository studentRepository = new StudentRepository();

	/* Constructor with parameters */

	public UserService(Scanner sc) {
		this.sc = sc;
	}

	public User checkCpf(String cpf) throws ProgramException {
		List<User> listUser = this.userRepository.findAll();
		for (User user : listUser) {
			if (user.getCpf().equalsIgnoreCase(cpf)) {
				user.printData(); 
				System.out.println("O CPF informado já existe para esta pessoa! Tente novamente!");
				return user;
			}
		}

		return this.saveUser(cpf);

	}

	private User saveUser(String user) throws ProgramException {
		System.out.println("Informe seu nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digite a data de nascimento: ");
		String dateBirth = sc.nextLine();
		System.out.println("Digite seu telefone: ");
		String phone = sc.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = sc.nextLine();
		if (ValidationCpf.isValidCPF(cpf) == false) {
			try {
				System.out.println("CPF inválido!!! Tente novamente!");
			} catch (Exception e) {
				throw new ProgramException("CPF inválido!" + e.getMessage());
			}
			return null;
		}

		System.out.println("Deseja informar nota final do curso:\n" + "| 1. Informar\n" + "| 2. Não informar");
		int info = sc.nextInt();

		if (info == 2) {
			Person newPerson = new Person(name, dateBirth, phone, cpf);

			newPerson.printData();
			System.out.println("Pessoa cadastrada com sucesso!");
			return this.personRepository.save(newPerson);

		} else if (info == 1) {
			System.out.println("Informe a nota final do curso: ");

			double gradeFinal = sc.nextDouble();
			Student student = new Student(name, gradeFinal, dateBirth, phone, cpf);
			System.out.println("Aluno(a) cadastrado(a) com sucesso!");
			student.printData(); 
			return this.studentRepository.save(student);
		}
		return null; // verificar o retorno - add exception
	}

	public User fetchUser(String docCpf) {
		int opChoose = sc.nextInt();

		if (opChoose == 1) {
			System.out.println("Informe o CPF da pessoa: ");
			String cpfPerson = sc.next();

			Person person = this.personRepository.findForCpf(cpfPerson);
			person.printData(); 
			return person;

		} else if (opChoose == 2) {
			System.out.println("Informe o CPF do aluno: ");
			String cpfStudent = sc.next();

			Student student = this.studentRepository.findForCpf(cpfStudent);
			student.printData(); 
			return student;

		} else if (opChoose == 3) {
			System.out.println("Encerrando");
		}

		return null;

//		return usuario;

	}

	public User removeUser(String cpf) {
		int opChoose = sc.nextInt();

		if (opChoose == 2) {
			System.out.println("Informe o CPF da pessoa: ");
			String cpfPerson = sc.next();

			Person person = this.personRepository.findForCpf(cpfPerson);

			this.personRepository.removeForId(person.getId());

			// ver se precisar retornar algo
			System.out.println("Pessoa removida com sucesso!");

		} else if (opChoose == 1) {
			System.out.println("Informe o CPF do(a) aluno(a)");
			String cpfStudent = sc.next();

			Student student = this.studentRepository.findForCpf(cpfStudent);

			this.studentRepository.removeForId(student.getId());

			System.out.println("Pessoa removida com sucesso!");

		} else if (opChoose == 3) {
			System.out.println("Menu anterior");
		}
		return null;
	}

	public User update() {
		int op = sc.nextInt();
		if (op == 1) {
			this.updateStudent();
		} else if (op == 2) {
			this.updatePerson();
		}
		return null;
	}

	public User updateStudent() {
		System.out.println("Escolha as opções a serem atualizadas:\n" + "| 1. Atualizar nome\n"
				+ "| 2. Atualizar data de nascimento\n" + "| 3. Atualizar telefone\n"
				+ "| 4. Atualizar atualizar CPF\n");

		int opStudent = sc.nextInt();
		if (opStudent == 1) {
			Menu.infoCpf();
			String cpf = sc.next();
			User student = this.studentRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String name = sc.nextLine();
			student.setName(name);
			student.setDateUpdate(LocalDateTime.now());
			student.printData();
			System.out.println("| Nome atualizado com sucesso!");
			return student;

		} else if (opStudent == 2) {
			Menu.infoCpf();
			String cpf = sc.next();
			User student = this.studentRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String dtNasc = sc.nextLine();
			student.setBirthDate(dtNasc);
			student.setDateUpdate(LocalDateTime.now());
			student.printData();
			System.out.println("| Data de nascimento atualizada com sucesso!");
			return student;

		} else if (opStudent == 3) {
			Menu.infoCpf();
			String cpf = sc.next();
			User student = this.studentRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String phone = sc.nextLine();
			student.setPhone(phone);
			student.setDateUpdate(LocalDateTime.now());
			student.printData();
			System.out.println("| Telefone atualizado com sucesso!");
			return student;

		} else if (opStudent == 4) {
			Menu.infoCpf();
			String cpf = sc.next();
			User student = this.studentRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String cpfUpdate = sc.nextLine();
			student.setCpf(cpfUpdate);
			student.setDateUpdate(LocalDateTime.now());
			student.printData();
			System.out.println("| CPF atualizado com sucesso!");
			return student;
		}
		return null;
	}

	public User updatePerson() {
		System.out.println("Escolha as opções a serem atualizadas:\n" + "| 1. Atualizar nome\n"
				+ "| 2. Atualizar data de nascimento\n" + "| 3. Atualizar telefone\n"
				+ "| 4. Atualizar atualizar CPF\n");

		int opPerson = sc.nextInt();
		if (opPerson == 1) {
			Menu.infoCpf();
			String cpf = sc.next();
			User person = this.personRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String name = sc.nextLine();
			person.setName(name);
			person.setDateUpdate(LocalDateTime.now());
			person.printData();
			System.out.println("| Nome atualizado com sucesso!");
			return person;

		} else if (opPerson == 2) {
			Menu.infoCpf();
			String cpf = sc.next();
			User person = this.personRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String dtNasc = sc.nextLine();
			person.setBirthDate(dtNasc);
			person.setDateUpdate(LocalDateTime.now());
			person.printData();
			System.out.println("| Data de nascimento atualizada com sucesso!");
			return person;

		} else if (opPerson == 3) {
			Menu.infoCpf();
			String cpf = sc.next();
			User person = this.personRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String phone = sc.nextLine();
			person.setPhone(phone);
			person.setDateUpdate(LocalDateTime.now());
			person.printData();
			System.out.println("| Telefone atualizado com sucesso!");
			return person;

		} else if (opPerson == 4) {
			Menu.infoCpf();
			String cpf = sc.next();
			User person = this.personRepository.findForCpf(cpf);
			System.out.println("Informe o nome a ser atualizado: ");
			sc.nextLine();
			String cpfUpdate = sc.nextLine();
			person.setCpf(cpfUpdate);
			person.setDateUpdate(LocalDateTime.now());
			person.printData();
			System.out.println("| CPF atualizado com sucesso!");
			return person;
		}
		return null;
	}

	public List<Student> studentList() {
		return this.studentRepository.findAll();
	}

	public List<Person> personList() {
		return this.personRepository.findAll();

	}

}
