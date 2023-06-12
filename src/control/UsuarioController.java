package control;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Aluno;
import model.AlunoDao;
import model.FabricaConexao;
import model.Funcionario;
import model.FuncionarioDao;

public class UsuarioController {
    FabricaConexao fc  = new FabricaConexao(
			"root", "jdbc:mysql://localhost/biblio", "1234");
    Scanner sc = new Scanner(System.in);
    public void addUsuario(){
        String n, cpf, telefone, email;
        System.out.println("[1] Adicionar Funcionario \n[2] Adicionar Aluno");
        int op = sc.nextInt();
        sc.reset();
        switch  (op) {
            case 1:
                do {
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    n = sc.nextLine();
                } while (n == null);
                do {
        
                    System.out.println("Digite o cpf: ");
                    cpf = sc.nextLine();
                } while (n == null);
                do {
                    
                    System.out.println("Digite o telefone: ");
                    telefone = sc.nextLine();
                } while (n == null);
                do {
                    
                    System.out.println("Digite o email: ");
                    email = sc.nextLine();
                } while (n == null);
                Funcionario f = new Funcionario(n,cpf,telefone, email);
                FuncionarioDao add = new FuncionarioDao();
                add.inserir(f);
                break;
            case 2:
                do {
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    n = sc.nextLine();
                } while (n == null);
                do {
                    
                    System.out.println("Digite o cpf: ");
                    cpf = sc.nextLine();
                } while (n == null);
                do {
                    
                    System.out.println("Digite o telefone: ");
                    telefone = sc.nextLine();
                } while (n == null);
                do {
                    
                    System.out.println("Digite o email: ");
                    email = sc.nextLine();
                } while (n == null);
                Aluno a = new Aluno(n,cpf,telefone, email);
                AlunoDao add2 = new AlunoDao();
                add2.inserir(a);
            default:
        }
    }
    public void emprestar(){
        String cpf;
        System.out.println("CPF do usuario: ");
        cpf = sc.next();
        String sql = "SELECT atribuicao FROM usuario WHERE cpf = ?";
        try {
            PreparedStatement ps = fc.getConnection().prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet result = ps.executeQuery();
            String teste = result.getString(0);
            if(teste != null){
                if(teste.equals("funcionario")){
                Funcionario f = new Funcionario(cpf);
                FuncionarioDao add = new FuncionarioDao();
                System.out.println("Digite o id do livro: ");
                String id = sc.next();
                add.emprestar(f, id);
                }else{
                Aluno f = new Aluno(cpf);
                AlunoDao add = new AlunoDao();
                System.out.println("Digite o id do livro: ");
                String id = sc.next();
                add.emprestar(f, id);
                }
            }else {
                System.out.println("Erro buscar cpf");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao devolver");
        }
    }
    public void devolver(){
        String cpf;
        System.out.println("CPF do usuario: ");
        cpf = sc.next();
        String sql = "SELECT atribuicao FROM usuario WHERE cpf =" + cpf;
        try {
            PreparedStatement ps = fc.getConnection().prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            String teste = result.getString(0);
            if(teste != null){
                if(teste.equals("funcionario")){
                Funcionario f = new Funcionario(cpf);
                FuncionarioDao add = new FuncionarioDao();
                add.devolver(f);
                }else{
                Aluno f = new Aluno(cpf);
                AlunoDao add = new AlunoDao();
                add.devolver(f);
                }
            }else {
                System.out.println("Erro buscar cpf");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao devolver");
        }
    }
}
