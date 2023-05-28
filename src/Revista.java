
public class Revista extends ItemBiblioteca{
	private int numEdicao;

	public Revista(String titulo, String autor, String editora, String categoria, int qtdExemplares, int numEdicao) {
		super(titulo, autor, editora, categoria, qtdExemplares);
		this.numEdicao = numEdicao;
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
}
