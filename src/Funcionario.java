
public class Funcionario extends Usuario{
	private String funcao;

	public Funcionario(String nome, String cpf, String telefone, String email, String funcao) {
		super(nome, cpf, telefone, email);
		this.funcao = funcao;
	}
}
