package service;

import java.util.Scanner;

import model.Student;
import repository.Repository;
import repository.StudentRepository;

/*aula 31/08
 * 
 * Camada respons�vel pela l�gica de neg�cio
 * 
 * Service � o que conversa com os Repository*/

public class StudentService {

	/*Inje��o de depend�ncias*/
	Scanner sc;
	StudentRepository studentRepository = new StudentRepository();
	Repository<Student> repository = new Repository<>();
	
	public StudentService(Scanner sc) {
		this.sc = sc;
		this.studentRepository.save(new Student ("Daniel", 10, "13/12/1988", "8878", "13246579890")); 
	}
	
	
}
