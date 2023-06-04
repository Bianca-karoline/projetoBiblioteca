import java.util.Calendar;

public class Emprestimo {
    private int id;
    private String cpf;
    private String idLivro;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    private boolean status = true;
    public Emprestimo(String cpf, String idLivro, Calendar dataEmprestimo, Calendar dataDevolucao) {
        this.cpf = cpf;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void registra(){
        // envia as informações para o banco de dados
    }
}
