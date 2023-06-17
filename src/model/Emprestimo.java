package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Emprestimo {
    private String cpf;
    private String idLivro;
    private String dataEmprestimo;
    private String dataDevolucao;
    FabricaConexao fc  = new FabricaConexao(
			"root", "jdbc:mysql://localhost/biblio", "1234");
    
    public Emprestimo(String cpf, String idLivro, String dataEmprestimo, String dataDevolucao) {
        this.cpf = cpf;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    public Emprestimo(String cpf){
        this.cpf = cpf;
    }
	public Emprestimo(){}

    public void registra(){
        String sql = "INSERT INTO emprestimo (data_emprestimo,data_devolucao, status_emprestimo, fk_usuario_cpf,fk_itemBiblioteca_id_item )"
				+ "VALUES (?, ?, 1,?, ?)";
		String up = "UPDATE usuario SET status_emprestimo = 0 WHERE fk_usuario_cpf = '" + cpf + "'";
		try {
			PreparedStatement ps = 
					fc.getConnection().prepareStatement(sql);
			ps.setString(1, this.dataEmprestimo);
			ps.setString(2, this.dataDevolucao);
            ps.setString(3, this.cpf);
            ps.setString(4, this.idLivro);
			int rowAffected = ps.executeUpdate();
			PreparedStatement ps2 = fc.getConnection().prepareStatement(up);
			int rowAffected2 = ps2.executeUpdate();
			if(rowAffected == 1 && rowAffected2 == 1) {
				System.out.println("SUCESSO ao inserir");
				
			}else {
				System.out.println("ERR - Linhas "+rowAffected);
				
			}
			
		}catch(SQLException e) {
			System.out.println("Erro emp");
			
		}
    }
    public void devolucao(String cpf){
        String sql = "UPDATE emprestimo SET status_emprestimo = 0 WHERE fk_usuario_cpf = " + cpf + " AND status_emprestimo = 1";
		String up = "UPDATE usuario SET status_emprestimo = 1 WHERE fk_usuario_cpf = " + cpf;
        try {
			PreparedStatement ps = 
					fc.getConnection().prepareStatement(sql);
			PreparedStatement ps2 = fc.getConnection().prepareStatement(up);
			int rowAffected = ps.executeUpdate();
			int rowAffected2 = ps2.executeUpdate();
			if(rowAffected == 1 && rowAffected2 == 1) {
				System.out.println("Devolução concluida");
				
				
			}else {
				System.out.println("ERR - Linhas "+rowAffected);
			}
			
		}catch(SQLException e) {
			System.out.println("Erro ao devolver");
			
		}
		
    }
	public void relatorio(){
		String sql = "SELECT * FROM emprestimo";
		try {
            PreparedStatement ps = fc.getConnection().prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (true){
				if(result.next()){
					System.out.println(result.getString(1) + '\t' + result.getString(2) + '\t' + result.getString(3) +
					 '\t' + result.getString(4) + '\t' + result.getString(5));
            	}else{
					break;
			}
			}
            

        } catch (SQLException e) {
            System.out.println("Erro ao devolver");
        }
	}
}
