import java.util.Date;

public abstract class Pessoa {
    private String cpf;
    private String nomeCompleto;
    private Date dataNascimento;
    private String email;
    private String senha;

    public abstract void emprestar();
    public abstract void devolver();
    public abstract void regularizar();

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento
                + ", email=" + email + ", senha=" + senha + "]";
    }
}
