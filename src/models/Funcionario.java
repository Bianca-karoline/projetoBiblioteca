package models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Funcionario extends Usuario{

	public Funcionario(String nome, String cpf, String telefone, String email) {
		super(nome, cpf, telefone, email);
	}
	public Funcionario(String cpf){
		super(cpf);
	}
	public void emprestar(String idLivro){
		Calendar a = Calendar.getInstance();
		Calendar b = Calendar.getInstance();
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        b.add(7,14);
		if(isStatusEmprestimo()){
			Emprestimo e = new Emprestimo(getCpf(), idLivro, (f.format(a.getTime())), (f.format(b.getTime())));
			e.registra();
			setStatusEmprestimo(false);
		}else{
			System.out.println("Usuario não pode emprestar");
		}
	}
    public void devolver(){
		Emprestimo e = new Emprestimo(getCpf());
		e.devolucao(getCpf());
	}
}
