package models;

public class ItemBiblioteca implements Comparable<ItemBiblioteca>{
	private int id;
	private String titulo, autor, tipo;
	private int qtdExemplares;
	
	//parametros, titulo, autor, editora, categoria, qtdExemplares
	//@Constructor
	public ItemBiblioteca(String titulo, String autor, String tipo, int qtdExemplares) {
		//this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
		this.qtdExemplares = qtdExemplares;
		}
	//Method para verificar disponibilidade
	public void disponivel() {	
		if(qtdExemplares > 0) {
			System.out.println("Disponivel! Qtd. Exemplares: " + this.qtdExemplares);
		}else {
			System.out.println("Indisponivel! Qtd. Exemplares: " + this.qtdExemplares);
		}
	}
	
	//@Method para retornar o tipo de item, para buscas por tipo
	public String toTipoItem() {
        return tipo;
    }
	
	//@Getters
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
	
	//@Setters
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
}
