
public class Artigo extends ItemBiblioteca{
	private String dataPublicacao;

	public Artigo(String titulo, String autor, String editora, String categoria, int qtdExemplares,
			String dataPublicacao) {
		super(titulo, autor, editora, categoria, qtdExemplares);
		this.dataPublicacao = dataPublicacao;
	}
	
	public boolean verificarDisponibilidade() {
		boolean disponibilidade;
		if(getQtdExemplares() <= 0) {
			disponibilidade = false;
		}else {
			disponibilidade = true;
		}
		return disponibilidade;
	}
  
	public String toString() {
		return "Data de publicação do Artigo: " + dataPublicacao;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
}
