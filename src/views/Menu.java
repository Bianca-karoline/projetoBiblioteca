package views;

import java.util.InputMismatchException;
import java.util.Scanner;
import controllers.UsuarioController;
import models.Emprestimo;
import controllers.ItemController;

public class Menu {
	ItemController i = new ItemController();
	UsuarioController u = new UsuarioController();
	Scanner sc = new Scanner(System.in);
	Emprestimo e = new Emprestimo();
	int op;	
		
	public void menuPrincipal(){
			try {
				do{
					System.out.println("------------ MENU PRINCIPAL ------------\n"
						+ "[1] Adicionar livro \n" +
						"[2] Emprestimos\n" +
						"[3] Inserir usuario \n" +
						"[4] Emprestar \n" +
						"[5] Devolver \n" +
						"[6] Mostrar acervo\n"
						+ "[7] Exibir revistas\n"
						+ "[8] Exibir livros\n"
						+ "[9] Exibir artigos");
						op = sc.nextInt();
						switch(op){
							case 1:
								i.addItem();
								break;
							case 2:
								e.relatorio();
								break;
							case 3:
								u.addUsuario();
								break;
							case 4:
								u.emprestar();
								break;
							case 5:
								u.devolver();
								break;
							case 6:
								i.exibir();
								break;
							case 7:
								i.exibirRevistas();
								break;
							case 8:
								i.exibirLivros();
								break;
							case 9:
								i.exibirArtigos();
								break;
						}
					}while(op!=0);
			}catch(InputMismatchException e) {
				System.out.println("ERRO! Opção invalida");
			}
			
	}
}
