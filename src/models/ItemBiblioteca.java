package models;

public class ItemBiblioteca implements Comparable<ItemBiblioteca>{
	private int id;
	private String titulo, autor, tipo;
	private int qtdExemplares;
	
	public String toTipoItem() {
        return tipo;
    }
	
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getTipo() {
		return tipo;
	}
	public int getQtdExemplares() {
		return qtdExemplares;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}
	
	@Override
	public int compareTo(ItemBiblioteca item) {
		return titulo.compareTo(item.titulo);
	}
	
	public void inserir() {
		
	}
}
