package model;
public abstract class Usuario{
	private String nome, cpf, telefone, email;
	private boolean statusEmprestimo = true;
	
	public Usuario(String nome, String cpf, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
	public Usuario(String cpf){
		this.cpf = cpf;
	}
	public boolean statusEmprestimo() {
		boolean status = false;
		return status;
	}

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

	public boolean isStatusEmprestimo() {
		return statusEmprestimo;
	}

	public void setStatusEmprestimo(boolean statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}
	
	public abstract void emprestar(String idLivro);
	public abstract void devolver();
}
