package Main;

import java.util.Scanner;

import menu.Menu;
import model.Student;
import model.User;
import service.StudentService;
import service.UserService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserService userService = new UserService(sc);
		
		boolean continues = true;
		do {

			Menu.menu1();
			int opt = sc.nextInt();
			switch (opt) {
			
			case 1:
				Menu.infoCpf();
				String cpf = sc.next();
				userService.checkCpf(cpf);
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
				System.out.println("\nOp��o inv�lida! Tente novamente!");
				break;
			}

		} while (continues);

		sc.close();
	}
}
