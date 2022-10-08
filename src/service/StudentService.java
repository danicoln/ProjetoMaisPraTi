package service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import model.Student;
import repository.StudentRepository;

/*aula 31/08
 * 
 * Camada responsável pela lógica de negócio
 * 
 * Service é o que conversa com os Repository*/

public class StudentService {

	/*dependências*/
	Scanner sc;
	StudentRepository repository = new StudentRepository();
	
	public StudentService(Scanner sc) {
		this.sc = sc;
	}
	
	public Student confereMatricula(Integer matricula) {
		List<Student> listaAlunos = repository.readAll();
		for (Student student : listaAlunos) {
			if(student.getRegistration().equals(matricula)) {
				return student;
			}

		}
		return this.saveStudent();
	}
	
	
	public Student saveStudent() {
		System.out.println("Digite o nome do aluno: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digite o telefone do aluno: ");
		String phone = sc.nextLine();
		System.out.println("Digite a data de aniversário: ");
		String birthDate = sc.nextLine();
		System.out.println("Digite a data de aniversário: ");
//		Integer registration = sc.nextInt();
		
		Student student = new Student(name, phone, birthDate, LocalDateTime.now());
		
		this.repository.create(student);
		
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return student;
	}
}
