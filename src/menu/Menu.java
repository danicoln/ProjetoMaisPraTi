package menu;

public class Menu {

	public static void menu1() {
		System.out.println("========= Acesso ao Sistema =========\n\n"
				+ "| 1. Cadastrar usu�rio\n"
				+ "| 2. Buscar usu�rio\n"
				+ "| 3. Listar usu�rios\n"
				+ "| 4. Remover usu�rio\n"
				+ "| 5. Atualizar usu�rio\n"
				+ "| 0. Sair do sistema\n"
				+ "\n=====================================");
	}

	public static void infoCpf() {
		System.out.println("Informe o CPF: \n");
	}

	public static void findUser() {
		System.out.println("======= Escolha a op��o desejada =======\n\n"
				+ "| 1. Buscar uma pessoa\n"
				+ "| 2. Buscar um aluno\n"
				+ "| 3. Voltar ao menu anterior\n"
				+ "\n=====================================");
	}

	public static void userList() {
		System.out.println("========= Escolha a op��o =========\n"
				+ "| 1. Listar alunos\n"
				+ "| 2. Listar pessoas\n"
				+ "| 3. Para voltar ao menu anterior\n"
				+ "\n=====================================");
	}

	public static void studentsList() {
		System.out.println("========= Lista de alunos =========\n");
	}

	public static void listPerson() {
		System.out.println("========= Lista de pessoas =========\n");
	}

	public static void removeUser() {
		System.out.println("Escolha a op��o desejada: \n"
				+ "| 1. Remover um aluno\n"
				+ "| 2. Remover uma pessoa\n"
				+ "| 3. Voltar ao menu anterior\n"
				+ "\n=====================================");
	}

	public static void confirmRemoval() {
		System.out.println("Confirma a remo��o do aluno?\n"
				+ "| 1. Confirmar\n"
				+ "| 2. Cancelar\n"
				+ "\n=====================================");
	}

	public static void updateUser() {
		System.out.println("========= Digite a op��o =========\n"
				+ "| 1. Atualizar aluno\n"
				+ "| 2. Atualizar pessoa\n"
				+ "| 3. Retornar ao menu anterior\n"
				+ "\n=====================================");
	}

}
