package controllers;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import models.Aluno;

import models.ConnectionFactory;
import models.Funcionario;


public class UsuarioController {
	ConnectionFactory conn  = new ConnectionFactory("root", "jdbc:mysql://localhost/biblioteca_db", "");
	
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
                //FuncionarioDao add = new FuncionarioDao();
                //add.inserir(f);
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
                //AlunoDao add2 = new AlunoDao();
                //add2.inserir(a);
            default:
        }
    }
    public void emprestar(){
        String cpf;
        System.out.println("CPF do usuario: ");
        cpf = sc.next();
        String sql = "SELECT atribuicao FROM usuario WHERE cpf = ?";
        try {
            PreparedStatement ps = conn.getConnection().prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet result = ps.executeQuery();
            String teste = result.getString(0);
            if(teste != null){
                if(teste.equals("funcionario")){
                Funcionario f = new Funcionario(cpf);
                //FuncionarioDao add = new FuncionarioDao();
                System.out.println("Digite o id do livro: ");
                String id = sc.next();
                //add.emprestar(f, id);
                }else{
                Aluno f = new Aluno(cpf);
                //AlunoDao add = new AlunoDao();
                System.out.println("Digite o id do livro: ");
                String id = sc.next();
                //add.emprestar(f, id);
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
            PreparedStatement ps = conn.getConnection().prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            String teste = result.getString(0);
            if(teste != null){
                if(teste.equals("funcionario")){
                Funcionario f = new Funcionario(cpf);
                //FuncionarioDao add = new FuncionarioDao();
                //add.devolver(f);
                }else{
                Aluno f = new Aluno(cpf);
                //AlunoDao add = new AlunoDao();
                //add.devolver(f);
                }
            }else {
                System.out.println("Erro buscar cpf");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao devolver");
        }
    }
}