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
				 * case 1: confere se existe o cpf informado, caso não exista, o programa pede
				 * para cadastrar o usuário. Se inserir uma nota, é criado um aluno; Se não
				 * inserir uma nota, é criado uma pessoa.
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
						System.out.println("CPF inválido! Tente novamente!");

					}
					break;

				/*
				 * ==========================================================================
				 * case 2: busca o usuário na memória.
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
							System.out.println("Opção inválida! Tente novamente");
							break;
						}
					} catch (Exception e) {
						throw new ProgramException(
								"Não é possível insersão de String! Tente novamente! " + e.getMessage());
					}

					break;

				/*
				 * ==========================================================================
				 * case 4: Remove o usuário específico.
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
				 * case 5: Atualiza os dados do usuário.
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
					System.out.println("\nOpção inválida! Tente novamente!");
					break;
				}

			} catch (InputMismatchException e) {
				throw new ProgramException("Não é possível insersão de String! Tente novamente! " + e.getMessage());
			}

		} while (continues);

		sc.close();

	}
}
