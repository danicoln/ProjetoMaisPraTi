package Main;

import java.util.Scanner;

import menu.Menu;
import model.Student;
import service.StudentService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentService service = new StudentService(sc);
		
		boolean continues = true;
		do {

			Menu.menu1();
			int opt = sc.nextInt();
			sc.nextLine();

			switch (opt) {
			case 1:
				Menu.inserirAluno();
					int opt2 = sc.nextInt(); // codigo inserido para nao voltar ao menu
				break;

			case 2:

				Menu.listarAlunos();
				opt2 = sc.nextInt(); // verificar
				break;

			case 3:
				
				Menu.atualizarAluno();
				opt2 = sc.nextInt(); // verificar
				break;

			case 4:
				Menu.deletarAluno();
				opt2 = sc.nextInt(); // verificar
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
