package igor.moreira.codeca;

public class ModeloUsuario {
    private String nome;
    private String eMail;
    private String senha;
    private String CPF;
    private String telefone;
    private int IDbackend;
    public ModeloUsuario(String nome, String eMail, String senha, String CPF, String telefone) {
        this.nome = nome;
        this.eMail = eMail;
        this.senha = senha;
        this.CPF = CPF;
        this.telefone = telefone;

    }
    public ModeloUsuario(){

    }

    public void setIDbackend(int id){
        this.IDbackend = id;
    }
    public int getIDbackend(){
        return IDbackend;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
