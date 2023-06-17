package views;

import java.util.Scanner;

import models.Artigo;
import models.ItemBiblioteca;
import models.Livro;
import models.Revista;

public class Menu {
	public static ItemBiblioteca MenuAddItem() {
		
Scanner sc = new Scanner(System.in);
	    
	    ItemBiblioteca item = null;
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
		
		/*Scanner sc = new Scanner(System.in);
		
		ItemBiblioteca item = null;
		
		System.out.println("Qual o tipo do item:\n"
	            + "1 - Livro\n"
	            + "2 - Revista\n"
	            + "3 - Artigo\n"
	            + "4- Voltar");
	    String tipo = sc.next();
	    sc.reset();
	    
	    if (tipo.equals("1") || tipo.equalsIgnoreCase("livro")) {
	    	
	        tipo = "Livro";
	        
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
	        
	    }else if(tipo.equals("2") || tipo.equalsIgnoreCase("revista")) {
	    	
	    	tipo = "Revista";
	        
	        System.out.println("----------:Cadastro de Revista:----------");
	        System.out.println("Digite o título do Revista: ");
	        
	        String titulo = sc.next();
	        sc.reset();
	        
	        System.out.println("Digite o autor do Revista: ");
			String autor = sc.next();
			sc.reset();
			
			System.out.println("Digite a quantidade de exemplares do Revista: ");
			int qtdExemplares = sc.nextInt();
			sc.reset();

	        item = new Revista(titulo, autor, tipo, qtdExemplares);
			//pra adicionar ao banco de dados chamar um metodo da classe adicionarItemcontrol
			//metodo 
	    }else if(tipo.equals("3") || tipo.equalsIgnoreCase("artigo")) {
	    	
	    	tipo = "Artigo";
	        
	        System.out.println("----------:Cadastro de Artigo:----------");
	        System.out.println("Digite o título do Artigo: ");
	        
	        String titulo = sc.next();
	        sc.reset();
	        
	        System.out.println("Digite o autor do Artigo: ");
			String autor = sc.next();
			sc.reset();
			
			System.out.println("Digite a quantidade de exemplares do Artigo: ");
			int qtdExemplares = sc.nextInt();
			sc.reset();

	        item = new Artigo(titulo, autor, tipo, qtdExemplares);
			//pra adicionar ao banco de dados chamar um metodo da classe adicionarItemcontrol
			//metodo 
	    }
	    return item;
	}*/
}
