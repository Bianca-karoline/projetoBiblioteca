package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemBibliotecaDao {
	
	public void addItem(String titulo, String autor, String tipo){
		
		FabricaConexao fc  = new FabricaConexao(
				"root", "jdbc:mysql://localhost/biblio", "1234");
		
        String sql = "INSERT INTO itembiblioteca (titulo, autor, tipo) VALUES (?, ?, ?)";
        
		try {
			PreparedStatement ps = fc.getConnection().prepareStatement(sql);
			
			ps.setString(1, titulo);
			ps.setString(2, autor);
			ps.setString(3, tipo);

			int rowAffected = ps.executeUpdate();
			
			if(rowAffected == 1) {
				System.out.println("SUCESSO! Item adicionado.");
			}else {
				System.out.println("ERRO! Item não adicionado" + rowAffected);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir item");
		}
    }

}
