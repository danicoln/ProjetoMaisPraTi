package menu;

public class Menu {

	public static void menu1() {
		System.out.println("========= Acesso ao Sistema ========= \n");
		System.out.println("| 1. Cadastrar usuário");
		System.out.println("| 2. Buscar usuário");
		System.out.println("| 3. Listar usuários");
		System.out.println("| 4. Remover usuário");
		System.out.println("| 5. Atualizar usuário");
		System.out.println("| 0. Sair do sistema");
		System.out.println("\n=====================================");
	}

	public static void infoCpf() {
		System.out.println("Informe o CPF: \n");
	}

	public static void findUser() {
		System.out.println("======= Escolha a opção desejada =======");
		System.out.println("| 1. Buscar uma pessoa");
		System.out.println("| 2. Buscar um aluno");
		System.out.println("| 3. Encerrar");
	}

	public static void userList() {
		System.out.println("========= Escolha a opção =========\n");
		System.out.println("| 1. Listar alunos");
		System.out.println("| 2. Listar pessoas");
		System.out.println("| 3. Para voltar ao menu anterior");
	}

	public static void studentsList() {
		System.out.println("========= Lista de alunos =========\n");
	}

	public static void listPerson() {
		System.out.println("========= Lista de pessoas =========\n");
	}

	public static void removeUser() {
		System.out.println("Escolha a opção desejada: ");
		System.out.println("| 1. Remover um aluno");
		System.out.println("| 2. Remover uma pessoa");
	}

	public static void confirmRemoval() {
		System.out.println("Confirma a remoção do aluno?\n");
		System.out.println("| 1. Confirmar");
		System.out.println("| 2. Cancelar");
	}

	public static void updateUser() {
		System.out.println("========= Digite a opção =========\n");
		System.out.println("| 1. Atualizar aluno");
		System.out.println("| 2. Atualizar pessoa");
		System.out.println("| 3. Retornar ao menu anterior");
	}

}
