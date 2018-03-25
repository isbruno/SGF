//Alterado em 25/03/2018
package sgf.ssoftware.com.br.sgf.javabeans.usuario;

public class UsuarioSGF {

    private String nome;
    private String senha;

    public UsuarioSGF(){

    }

    public UsuarioSGF(String nome, String senha) {

        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "UsuarioSGF{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}


















