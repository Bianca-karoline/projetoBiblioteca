package views;

import java.util.Scanner;

import controllers.UsuarioController;
import models.Artigo;
import models.Emprestimo;
import models.ItemBiblioteca;
import models.Livro;
import models.Revista;

public class Menu {
	UsuarioController u = new UsuarioController();
	Scanner sc = new Scanner(System.in);
	Emprestimo e = new Emprestimo();
	int op;
	public static ItemBiblioteca MenuAddItem() {
	    ItemBiblioteca item = null;
		Scanner sc = new Scanner(System.in);
	    String menu = "Qual o tipo do item:\n"
	            + "[1] Livro\n"
	            + "[2] Revista\n"
	            + "[3] Artigo\n"
	            + "[4] Voltar";
	    
	    int op;
	    
	    //do {
	    	
		    System.out.print(menu);
		    op = sc.nextInt();
		    sc.reset();
	    
	    switch(op) {
	    
	    case 1:
	    	String tipo = "Livro";
	        System.out.println("----------:Cadastro de Livro:----------");
	        System.out.println("Digite o título do Livro: ");
	        String titulo = sc.next();
	        sc.reset();
	        
	        System.out.println("Digite o autor do Livro: ");
			String autor = sc.next();
			sc.reset();
			
			System.out.println("Digite a quantidade de exemplares do Livro: ");
			int qtdExemplares = sc.nextInt();
			sc.reset();

	        item = new Livro(titulo, autor, tipo, qtdExemplares);
	        
	    }
	    //}while(op <= 4);
	    
	    return item;
	    
	}
		
		
	public void menuPrincipal(){
		do{
			System.out.println("------------ MENU PRINCIPAL ------------\n"
			+ "[1] Acervo \n" +
			"[2] Inserir usuario \n" +
			"[3] Emprestar \n" +
			"[4] Devolver \n" +
			"[5] Emprestimos");
			op = sc.nextInt();
			switch(op){
				case 1:

					break;
				case 2:
					u.addUsuario();
					break;
				case 3:
					u.emprestar();
					break;
				case 4:
					u.devolver();
					break;
				case 5:
					e.relatorio();
					break;
			}
		}while(op!=0);
	}
}
