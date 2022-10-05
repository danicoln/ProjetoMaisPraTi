package service;

import java.util.Scanner;

import model.Student;
import repository.StudentRepository;

public class StudentService {

	Scanner sc;
	StudentRepository repository = new StudentRepository();
	
	public StudentService(Scanner sc) {
		this.sc = sc;
	}
	
	private Student saveStudent() {
		System.out.println("Digite seu nome: ");
		String name = sc.nextLine();
		System.out.println("Digite seu telefone: ");
		String phone = sc.nextLine();
		System.out.println("Digite sua data de aniversário: ");
		String birthDate = sc.nextLine();
		
		Student student = new Student(name, phone, birthDate);
		
		this.repository.create(student);
		
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return student;
	}
}
