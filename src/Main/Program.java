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
			sc.nextLine();

			switch (opt) {
			case 1:
				Menu.inserirAluno();
				Integer matricula = sc.nextInt();
				Student student = studentService.confereMatricula(matricula);
					
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
