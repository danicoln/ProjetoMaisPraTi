package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.ProgramException;
import menu.Menu;
import model.ValidationCpf;
import service.UserService;

public class Program {

	public static void main(String[] args) throws ProgramException {

		Scanner sc = new Scanner(System.in);
		UserService userService = new UserService(sc);
		boolean continues = true;
		do {

			Menu.menu1();
			try {

				int opt = sc.nextInt();
				switch (opt) {

				/*
				 * ==========================================================================
				 * case 1: confere se existe o cpf informado, caso n�o exista, o programa pede
				 * para cadastrar o usu�rio. Se inserir uma nota, � criado um aluno; Se n�o
				 * inserir uma nota, � criado uma pessoa.
				 * 
				 * English: checks if the cpf informed exists, if it does not exist, the program
				 * asks to register the user. If you enter a grade, a student is created; If you
				 * do not enter a note, a person is created.
				 */

				case 1:
					Menu.infoCpf();
					String cpf = sc.next();

					ValidationCpf.isValidCPF(cpf);

					while (ValidationCpf.isValidCPF(cpf) == true) {

						userService.checkCpf(cpf);
						break;

					}
					if (ValidationCpf.isValidCPF(cpf) == false) {
						System.out.println("CPF inv�lido! Tente novamente!");

					}
					break;

				/*
				 * ==========================================================================
				 * case 2: busca o usu�rio na mem�ria.
				 * 
				 * English: Find the user in memory.
				 */

				case 2:

					Menu.findUser();

					String docCpf = sc.nextLine();
					userService.fetchUser(docCpf);

					break;

				/*
				 * ==========================================================================
				 * case 3: Devolve uma lista de pessoas ou alunos cadastrados.
				 * 
				 * English: Gives it back a list of saved person or students.
				 */

				case 3:

					Menu.userList();
					try {

						int opChoose = sc.nextInt();
						if (opChoose == 1) {
							Menu.studentsList();
							userService.studentList().forEach(s -> System.out.println("| ID: " + s.getId() + "| Nome: "
									+ s.getName() + "| Nota do curso: " + s.getGradeFinal()));
							break;

						} else if (opChoose == 2) {
							Menu.listPerson();
							userService.personList()
									.forEach(p -> System.out.println("| ID: " + p.getId() + "| Nome: " + p.getName()));
							break;

						} else if (opChoose == 3) {
							break;

						} else if (opChoose != 1) {
							System.out.println("Op��o inv�lida! Tente novamente");
							break;
						}
					} catch (Exception e) {
						throw new ProgramException(
								"N�o � poss�vel insers�o de String! Tente novamente! " + e.getMessage());
					}

					break;

				/*
				 * ==========================================================================
				 * case 4: Remove o usu�rio espec�fico.
				 * 
				 * English: Removal the specific user.
				 */

				case 4:
					Menu.removeUser();
					String chooseRemoval = sc.nextLine();
					userService.removeUser(chooseRemoval);
					break;

				/*
				 * ==========================================================================
				 * case 5: Atualiza os dados do usu�rio.
				 * 
				 * English: Update the user data.
				 */

				case 5:
					Menu.updateUser();
					userService.update();
					break;

				/*
				 * ==========================================================================
				 * case 0: Encerra o programa.
				 * 
				 * English: Close the program.
				 */

				case 0:
					continues = false;
					System.out.println("\nSistema encerrado!");
					break;

				default:
					System.out.println("\nOp��o inv�lida! Tente novamente!");
					break;
				}

			} catch (InputMismatchException e) {
				throw new ProgramException("N�o � poss�vel insers�o de String! Tente novamente! " + e.getMessage());
			}

		} while (continues);

		sc.close();

	}
}
