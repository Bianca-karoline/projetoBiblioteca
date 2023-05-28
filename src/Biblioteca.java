import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
	private ArrayList <ItemBiblioteca> acervo;

	public Biblioteca() {
		this.acervo = new ArrayList<>() ;
	}
	
	//metodo para editar um item do acervo
	
	//metodo para adicionar item ao array acervo
	public void addItem(ItemBiblioteca item) {
		acervo.add(item);
	}
	
	//metodo para remover um item do acervo
	public void removeItem(ItemBiblioteca item) {
		acervo.remove(item);
	}
	//metodo para exibir acervo
	public void verAcervo() {
		System.out.println("----------::Acervo da biblioteca::----------");
		//colocar os itens em ordem
		Collections.sort(acervo);
		for(ItemBiblioteca item : acervo) {
			if(item.verificarDisponibilidade() == false) {
				System.out.println("Item: " + item.getTitulo() + "\t" + "Categoria: " + item.getCategoria() + "\n");
				System.out.println("Indisponivel. Item esgostado!");
				System.out.println("--------------------------------------------");
			}else {
				System.out.println("Categoria: " + item.getCategoria()  + "\t"
						 + "Quantidade de exemplares: " + item.getQtdExemplares() + "\n"
						 + "------:Informações do item:----------\n"
						 + "Titulo: " + item.getTitulo() + "\n"
						 + "Autor: " + item.getAutor()  + "\n"
						 + "Editora: " + item.getEditora()  + "\n"
						 + "" + item.toString());
				System.out.println("--------------------------------------------");
			}
		}	
	}
	
	//no toString vou fazer um relatorio de itens
}
