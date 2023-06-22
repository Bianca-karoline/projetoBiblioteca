package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Revista extends ItemBiblioteca{
	FabricaConexao fc  = new FabricaConexao(
			"root", "jdbc:mysql://localhost/biblio", "1234");
	
	public void exibir() {
		String sql = "SELECT * FROM itembiblioteca WHERE tipo = 'revista';";
		try {
            PreparedStatement ps = fc.getConnection().prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (true){
				if(result.next()){
					System.out.println(result.getString(1) + '\t' + result.getString(2) + '\t' + result.getString(3) +
					 '\t' + result.getString(4));
            	}else{
					break;
			}
            
            }  

        } catch (SQLException e) {
            System.out.println("Erro ao devolver");
            
        }
	}
	 
}
