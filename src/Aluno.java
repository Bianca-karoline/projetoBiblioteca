import java.util.Calendar;

public class Aluno extends Usuario{
	private String curso;

	public Aluno(String nome, String cpf, String telefone, String email, String curso) {
		super(nome, cpf, telefone, email);
		this.curso = curso;
	}
	
    public void emprestar(String idLivro){
		// Verifica se o status usuario permite o emprestimo
		
		if(isStatusEmprestimo()){
			// cria um objeto de emprestimo e calcula as datas corretas
			// Estou estudando sobre qual classe de data usar
			// Talvez seja preciso alguma autenticação quanto ao livro
			Emprestimo e = new Emprestimo(getCpf(), idLivro, null, null);
			// depois de criar registramos no banco de dados
			e.registra();
			setStatusEmprestimo(false);
			// O objeto emprestimo depois de registrado no banco de dados pode deixar de exitir
			// Para verificar a lista de emprestimos podemos criar um método SELECT * no banco
			// não precismos deixar tudo instanciado na memória, podemos apenas criar objetos temporarios com os dados do banco
			// Essa ideia tambem serve tanto pra lista de usuarios, acervo e emprestimos
		}
	}
}
