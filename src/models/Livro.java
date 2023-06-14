package models;

public class Livro extends ItemBiblioteca{
	
	//@Constructor
	public Livro( String titulo, String autor, String tipo, int qtdExemplares) {
		super(titulo, autor, tipo, qtdExemplares);
	}
}
