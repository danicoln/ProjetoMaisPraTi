package Main;

import java.util.Scanner;

import exception.ProgramException;
import menu.Menu;
import model.ValidaCpf;
import service.UserService;

public class Program {

	public static void main(String[] args) throws ProgramException {

		Scanner sc = new Scanner(System.in);
		UserService userService = new UserService(sc);
		boolean continues = true;
		do {

			Menu.menu1();
			int opt = sc.nextInt();
			switch (opt) {

			/*
			 * ==========================================================================
			 * case 1: confere se existe o cpf informado, caso n�o exista, o programa pede
			 * para cadastrar o usu�rio. Se inserir uma nota, � criado um aluno; Se n�o
			 * inserir uma nota, � criado uma pessoa.
			 */

			case 1:
				Menu.infoCpf();
				String cpf = sc.next();
				ValidaCpf.isValidCPF(cpf);
				while (ValidaCpf.isValidCPF(cpf) == true) {
					userService.checkCpf(cpf);
					break;

				}
				if (ValidaCpf.isValidCPF(cpf) == false) {
					throw new ProgramException("CPF inv�lido!");
				}
				break;

			/*
			 * ==========================================================================
			 * case 2: busca o usu�rio na mem�ria
			 */

			case 2:

				Menu.findUser();
				String docCpf = sc.nextLine();
				userService.fetchUser(docCpf);

				break;

			/*
			 * ==========================================================================
			 * case 3: Devolve uma lista de pessoas ou alunos cadastrados
			 */

			case 3:

				Menu.userList();
				int opChoose = sc.nextInt();
				if (opChoose == 1) {
					Menu.studentsList();
					userService.studentList().forEach(s -> System.out.println(
							"| ID: " + s.getId() + "| Nome: " + s.getName() + "| Nota do curso: " + s.getGradeFinal()));
					break;

				} else if (opChoose == 2) {
					Menu.listPerson();
					userService.personList()
							.forEach(p -> System.out.println("| ID: " + p.getId() + "| Nome: " + p.getName()));
					break;

				} else if (opChoose == 3) {
					break;

				} else if (!(opChoose == 1)) {
					throw new ProgramException("Op��o inv�lida");
				}

				break;

			/*
			 * ==========================================================================
			 * case 4: Remove o usu�rio espec�fico
			 */

			case 4:
				Menu.removeUser();
				String chooseRemoval = sc.nextLine();
				userService.removeUser(chooseRemoval);
				break;

			/*
			 * ==========================================================================
			 * case 5: Atualiza os dados do usu�rio
			 */

			case 5:
				Menu.updateUser();
				userService.update();
				break;

			/*
			 * ==========================================================================
			 * case 0: Encerra o programa
			 */

			case 0:
				continues = false;
				System.out.println("\nSistema encerrado!");
				break;

			default:
				System.out.println("\nOp��o inv�lida! Tente novamente!");
				break;
			}

		} while (continues);

		sc.close();
	}
}
