
public abstract class ItemBiblioteca implements Comparable<ItemBiblioteca>{
	private String titulo, autor, editora, categoria;
	private int qtdExemplares;
	
	//parametros, titulo, autor, editora, categoria, qtdExemplares
	public ItemBiblioteca(String titulo, String autor, String editora, String categoria, int qtdExemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.categoria = categoria;
		this.qtdExemplares = qtdExemplares;
	}


	//Metodo para verificar disponibilidade
	public abstract boolean verificarDisponibilidade();
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getQtdExemplares() {
		return qtdExemplares;
	}

	public void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}
	

	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

	@Override
	public String toString() {
		return "ItemBiblioteca [titulo=" + titulo 
				+ ", autor=" + autor 
				+ ", editora=" + editora 
				+ ", categoria=" + categoria 
				+ ", qtdExemplares=" + qtdExemplares 
				+ "]";
	}


	@Override
	public int compareTo(ItemBiblioteca item) {
		return titulo.compareTo(item.titulo);
	}
}
