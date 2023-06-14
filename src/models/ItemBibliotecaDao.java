package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemBibliotecaDao {
	
	public static void addItem(ItemBiblioteca item){
		//@Method criando conexão
		ConnectionFactory conn  = new ConnectionFactory("root", "jdbc:mysql://localhost/biblioteca_db", "");
		
		//parametros titulo, autor, tipo, qtd_exemplares
        String sql = "INSERT INTO itembiblioteca (titulo, autor, tipo, qtd_exemplares)" + "VALUES (?, ?, ?, ?)";
        
		try {
			PreparedStatement ps = conn.getConnection().prepareStatement(sql);
			//parametros titulo, autor, tipo, qtd_exemplares
			ps.setString(1, item.getTitulo());
			ps.setString(2, item.getAutor());
			ps.setString(3, item.getTipo());
			ps.setInt(4, item.getQtdExemplares());

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
