
public class Livro extends ItemBiblioteca{
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, String editora, String categoria, int qtdExemplares, int anoPublicacao) {
		super(titulo, autor, editora, categoria, qtdExemplares);
		this.anoPublicacao = anoPublicacao;
	}

	public void verificarDisponibilidade() {
		if(getQtdExemplares() <= 0) {
			System.out.println("Indisponivel. Item esgostado!");
		}else {
			System.out.println("Disponivel. Quantidades de exemplares: " + getQtdExemplares());
		}
	}
}
