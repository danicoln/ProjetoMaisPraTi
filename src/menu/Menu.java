package menu;

public class Menu {

	public static void menu1() {
		System.out.println("========= Acesso ao Sistema ========= \n");
		System.out.println("| 1. Cadastrar usuário");
		System.out.println("| 2. Buscar pessoa");
		System.out.println("| 3. Listar todos alunos");
		System.out.println("| 4. Remover aluno");
		System.out.println("| 5. Atualizar aluno");
		System.out.println("| 0. Sair do sistema");
		System.out.println("\n=====================================");
	}
	
	public static void infoCpf() {
		System.out.println("Informe o CPF: \n");
	}

	public static void inserirAluno() {
		System.out.println("======= Para inserir os dados do aluno =======");
		System.out.println("======= Digite 1 para inserir os dados =======");
		System.out.println("======= Digite 2 para voltar ao menu anterior =======");
	}

	public static void listarAlunos() {
		System.out.println("======= Lista de alunos =======");
	}

	public static void atualizarAluno() {
		System.out.println("======= Atualizar aluno =======");		
	}

	public static void deletarAluno() {
		System.out.println("======= Deletar dados do aluno =======");
	}
	
	
}
