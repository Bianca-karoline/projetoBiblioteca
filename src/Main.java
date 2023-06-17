import control.UsuarioController;
import model.Emprestimo;

public class Main {
	public static void main(String[] args) {
		UsuarioController u = new UsuarioController();
		//u.addUsuario();
		//u.emprestar();
		//u.devolver();
		Emprestimo e = new Emprestimo();
		e.relatorio();
	}
}
