package Main;

import java.util.Scanner;

import menu.Menu;
import model.Student;
import service.StudentService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentService studentService = new StudentService(sc);
		
		boolean continues = true;
		do {

			Menu.menu1();
			int opt = sc.nextInt();
			switch (opt) {
			
			case 1:
				Menu.infoCpf();
				String cpf = sc.next();
				studentService.saveStudent();
				
				break;

			case 2:

				Menu.listarAlunos();
				break;

			case 3:
				
				Menu.atualizarAluno();
				break;

			case 4:
				Menu.deletarAluno();
				break;	
				
			case 0:
				continues = false;
				System.out.println("\nSaindo do sistema");
				break;

			default:
				System.out.println("\nOpção inválida! Tente novamente!");
				break;
			}

		} while (continues);

		sc.close();
	}
}
