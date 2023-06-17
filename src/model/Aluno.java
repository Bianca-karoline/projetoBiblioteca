package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aluno extends Usuario{

	public Aluno(String nome, String cpf, String telefone, String email) {
		super(nome, cpf, telefone, email);
	}
	public Aluno(String cpf){
		super(cpf);
	}
	
	public void emprestar(String idLivro){
		Calendar a = Calendar.getInstance();
		Calendar b = Calendar.getInstance();
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        b.add(7,7);
		if(isStatusEmprestimo()){
			Emprestimo e = new Emprestimo(getCpf(), idLivro, (f.format(a.getTime())), (f.format(b.getTime())));
			e.registra();
		}else{
			System.out.println("Usuario não pode emprestar");
		}
	}
    public void devolver(){
		Emprestimo e = new Emprestimo(getCpf());
		e.devolucao(getCpf());
	}
}
