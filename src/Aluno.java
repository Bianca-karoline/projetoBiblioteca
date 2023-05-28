
public class Aluno extends Usuario{
	private String curso;

	public Aluno(String nome, String cpf, String telefone, String email, String curso) {
		super(nome, cpf, telefone, email);
		this.curso = curso;
	}
    
}
