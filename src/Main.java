
public class Main {

	public static void main(String[] args) {
		
		//parametros, titulo, autor, editora, categoria, qtdExemplares, anoPublicação
		ItemBiblioteca livro1 = new Livro("titulo", "autor", "editora", "Livro", 15, 2023);
		livro1.verificarDisponibilidade();
		
		//pra limpar a main declaro o metodo e depois so chamo
		System.out.println(menuPrincipal());

	}
  
	//todos os menu da aplicação
	public static String menuPrincipal() {
		String menuPrincipal = "::----------Biblioteca----------::\n"
				 + "1- Cadastrar novo item.\n"
				 + "2- Visualizar Acervo.\n"
				 + "3- Cadastrar usuario.\n"
				 + "3- Realizar um emprestimo.\n"
				 + "4- Realizar uma devolução.\n"
				 + "5- Relatorio de atrasos.\n"
				 //Relatorio: lista de usuarios com atraso
				 + "6- Encerrar!";
		return menuPrincipal;
	}
}
