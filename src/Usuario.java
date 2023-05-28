
public class Usuario implements StatusEmprestavel{
	//atributos
	private String nome, cpf, telefone, email;
	private boolean statusEmprestimo;
	
	//metodos e construtores
	public Usuario(String nome, String cpf, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
	
	//quero um metodo para definir status das subclasses de pessoa
	//se tiver true esta bloqueado e não pode emprestar
	//se tiver false esta sem bloqueio e pode emprestar
	//vai ser aplicado na hora que um usuario (aluno, funcionario, professor quiser realizar um emprestimo;
	//cada subclasse vai ter que realizar a verificação com base no atraso do emprestimo
	//verificar por data de emprestimo
	public boolean statusEmprestimo() {
		boolean status = false;
		return status;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
