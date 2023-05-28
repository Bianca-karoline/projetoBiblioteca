
public class Livro extends ItemBiblioteca{
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, String editora, String categoria, int qtdExemplares, int anoPublicacao) {
		super(titulo, autor, editora, categoria, qtdExemplares);
		this.anoPublicacao = anoPublicacao;
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

	@Override
	public String toString() {
		return "Ano de publicação: " + anoPublicacao;
	}
}
