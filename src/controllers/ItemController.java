package controllers;

import java.util.InputMismatchException;
import java.util.Scanner;

import models.Artigo;
import models.FabricaConexao;
import models.ItemBiblioteca;
import models.ItemBibliotecaDao;
import models.Livro;
import models.Revista;

public class ItemController {
	
	Scanner sc = new Scanner(System.in);
	FabricaConexao fc  = new FabricaConexao(
			"root", "jdbc:mysql://localhost/biblio", "1234");
	
	public void addItem() {
		ItemBibliotecaDao i = new ItemBibliotecaDao();
		String n, a;
		System.out.println("[1] - Adicionar livro\n"
				+ "[2] - Adicionar artigo\n"
				+ "[3] - Adicionar revista");
		try {
			int op = sc.nextInt();
			do {
				System.out.println("Titulo: ");
				sc.nextLine();
				n = sc.nextLine();
			}while(n == null);
			 do {
					System.out.println("Autor: ");
					
					a = sc.nextLine();
				}while(a == null);
			switch(op) {
			case 1:
				i.addItem(n, a, "livro");
				break;
			case 2:
				i.addItem(n, a, "artigo");
				break;
			case 3:
				i.addItem(n, a, "revista");
				break;
			}
		}catch(InputMismatchException e){
			System.out.println("ERRO");
		}
		
	}
	public void exibir() {
		ItemBiblioteca i = new ItemBiblioteca();
		i.exibir();

	}
	public void exibirRevistas() {
		Revista r = new Revista();
		r.exibir();
	}
	public void exibirArtigos() {
		Artigo a = new Artigo();
		a.exibir();
		
	}
	public void exibirLivros() {
		Livro l = new Livro();
		l.exibir();
	}
}
