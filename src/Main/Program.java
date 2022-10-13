package Main;

import java.util.Scanner;

import menu.Menu;
import model.Person;
import service.PersonService;
import service.UserService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserService userService = new UserService(sc);
		PersonService personService = new PersonService(sc);
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

				Menu.findUser();
				int chooseOption = sc.nextInt();
				if(chooseOption == 1) {
					System.out.println("Informe o CPF da pessoa: ");
					String cpfDoc = sc.next();
					Person person = personService.findPerson(cpfDoc);
					
							
				}
//				String cpf2 = sc.nextLine();
//				userService.findUser(cpf2);
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
