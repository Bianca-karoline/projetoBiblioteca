import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Biblioteca biblioteca = new Biblioteca();
		
		//tratamentos de excessao para não deixar o usuario quebrar a aplicação
		
		int op = 0;
		do {
			System.out.println(menuPrincipal());
			System.out.print("Opção: ");
			op = sc.nextInt();
			sc.reset();
			
			switch(op) {
			case 1:
				//1 - Editar o acervo da Biblioteca.\n"
				//cadastrar item
				//editar item
				//excluir item
				System.out.print("Escolha uma ação: \n"
						+ "1 - Cadastrar um novo item\n"
						+ "2 - Editar um item\n"
						+ "3 - Excluir item\n"
						+ "4 - Ver Acervo\n");
				System.out.print("Opção: ");
				op = sc.nextInt();
				sc.reset();
				
				if(op == 1) {
					System.out.println("Qual a categoria do item:\n"
				            + "1 - Livro\n"
				            + "2 - Revista\n"
				            + "3 - Artigo");
				    String cat = sc.next();
				    sc.reset();
					
				//o metodo retorna um item e dai chamo o metodo add para adicionar o item no acervo
				    biblioteca.addItem(cadastrarItem(cat));
					
				}else if(op == 2) {
					//editar item, buscar por titulo
					
				}else if(op == 3) {
					//Excluir um item, buscar por titulo
					
				}else if(op == 4) {
					biblioteca.verAcervo();
				}
				break;
				
			case 2:
				 //2 - Gerenciar usuarios
				 //cadastrar usuario
				 //editar usuario, editar statusEmprestimo
				 //excluir usuario
				//listar usuario cadastrado e sua situação
				break;
				
			case 3:
				//3 - Realizar um emprestimo ou uma devolução
				//fazer emprestimo
				//fazer uma devolução
				break;
				
			case 4:
				//4 - Relatorio de atrasos.\n"
				//Relatorio: lista de usuarios com atraso
				//lista de itens indisponiveis por falta de exemplares
				break;
				
			default:
					System.out.println("Opção inválida!");
			}
		}while(op !=5);
		
		
		
		
		//pra limpar a main declaro o metodo e depois so chamo
		//System.out.println(menuPrincipal());

	}
	
	public static ItemBiblioteca cadastrarItem(String cat) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    ItemBiblioteca item = null;

	    if (cat.equals("1") || cat.equalsIgnoreCase("livro")) {
	        String categoria = "Livro";
	        System.out.println("----------:Cadastro de Livro:----------");
	        System.out.println("Digite o título do Livro: ");
	        String titulo = sc.next();
	        sc.reset();
	        
	        System.out.println("Digite o autor do Livro: ");
			String autor = sc.next();
			sc.reset();
			
			System.out.println("Digite a editora do Livro: ");
			String editora = sc.next();
			sc.reset();
			
			System.out.println("Digite a quantidade de exemplares do Livro: ");
			int qtdExemplares = sc.nextInt();
			sc.reset();
			
			System.out.println("Digite o ano de publicação do Livro: ");
			int anoPublicacao = sc.nextInt();
			sc.reset();

	        item = new Livro(titulo, autor, editora, categoria, qtdExemplares, anoPublicacao);
	        
	    }else if(cat.equals("2") || cat.equalsIgnoreCase("revista")) {
			String categoria = "Revista";
			//parametros, titulo, autor, editora, categoria, qtdExemplares, numExemplares
			System.out.println("----------:Dados da Revista:----------");
			System.out.println("Digite o titulo da Revista: ");
			String titulo = sc.next();
			sc.reset();
			
			System.out.println("Digite o autor da Revista: ");
			String autor = sc.next();
			sc.reset();
			
			System.out.println("Digite a editora da Revista: ");
			String editora = sc.next();
			sc.reset();
			
			System.out.println("Digite a quantidade de exemplares da Revista: ");
			int qtdExemplares = sc.nextInt();
			sc.reset();
			
			System.out.println("Digite o numero da edição da Revista: ");
			int numEdicao = sc.nextInt();
			sc.reset();
			
			item = new Revista(titulo, autor, editora, categoria, qtdExemplares, numEdicao);
		}else if(cat.equals("3") || cat.equalsIgnoreCase("artigo")) {
			String categoria = "Artigo";
			//parametros, titulo, autor, editora, categoria, qtdExemplares, numExemplares
			System.out.println("----------:Dados do Artigo:----------");
			System.out.println("Digite o titulo do Artigo: ");
			String titulo = sc.next();
			sc.reset();
			
			System.out.println("Digite o autor do Artigo: ");
			String autor = sc.next();
			sc.reset();
			
			System.out.println("Digite a editora do Artigo: ");
			String editora = sc.next();
			sc.reset();
			
			System.out.println("Digite a quantidade de exemplares do Artigo: ");
			int qtdExemplares = sc.nextInt();
			sc.reset();
			
			System.out.println("Digite o numero da edição da Revista: ");
			int numEdicao = sc.nextInt();
			sc.reset();
			
			item = new Revista(titulo, autor, editora, categoria, qtdExemplares, numEdicao);
		}
		//else opção ivalida, digite novamente

	    return item;
	}
	
	//todos os menu da aplicação
	public static String menuPrincipal() {
		String menuPrincipal = "::----------Biblioteca----------::\n"
				 + "1 - Editar o acervo da Biblioteca.\n"
				 //cadastrar item
				 //editar item
				 //excluir item
				 + "2 - Gerenciar usuarios.\n"
				 //cadastrar usuario
				 //editar usuario
				 //excluir usuario
				 + "3 - Realizar um emprestimo ou uma devolução.\n"
				 //fazer emprestimo
				 //fazer uma devolução
				 + "4 - Relatorio de atrasos.\n";
				 //Relatorio: lista de usuarios com atraso
		return menuPrincipal;
	}
}
