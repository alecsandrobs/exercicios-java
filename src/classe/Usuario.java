package classe;

public class Usuario {

    public String nome;
    public String email;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object object) {
        if (object instanceof Usuario) {
            Usuario usuario = (Usuario) object;
            boolean nomeIgual = usuario.nome.equals(this.nome);
            boolean emailIgual = usuario.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
}
