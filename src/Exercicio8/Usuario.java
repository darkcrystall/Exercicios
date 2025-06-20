package Exercicio8;

public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    static Usuario u = new Usuario("João", 25);

    public static void main(String[] args) {
        System.out.println(u.getNome());
        System.out.println(u.getIdade());
    }
}