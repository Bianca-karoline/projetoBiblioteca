package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemBiblioteca implements Comparable<ItemBiblioteca>{
	private int id;
	private String titulo, autor, tipo;
	private int qtdExemplares;
	FabricaConexao fc  = new FabricaConexao(
			"root", "jdbc:mysql://localhost/biblio", "1234");
			
	public String toTipoItem() {
        return tipo;
    }
	
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getTipo() {
		return tipo;
	}
	public int getQtdExemplares() {
		return qtdExemplares;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}
	
	@Override
	public int compareTo(ItemBiblioteca item) {
		return titulo.compareTo(item.titulo);
	}
	
	public void exibir() {
		String sql = "SELECT * FROM itembiblioteca;";
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
