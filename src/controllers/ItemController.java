package controllers;

import models.ConnectionFactory;
import models.ItemBiblioteca;
import models.ItemBibliotecaDao;
import views.Menu;

public class ItemController {
	
	//criando uma conexão
	//ConnectionFactory conn   = new ConnectionFactory("root", "jdbc:mysql://localhost/biblioteca_db", "1234");
	
	public static void addItem() {
		//devolve um item
		ItemBiblioteca item = Menu.MenuAddItem();
		if(item != null) {
			//quero verificar os campos
			//pra dai adicionar no banco com o metodo de itemDao
			ItemBibliotecaDao.addItem(item);
		}
	}
}
