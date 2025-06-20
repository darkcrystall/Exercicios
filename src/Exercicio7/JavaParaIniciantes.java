package Exercicio7;

public class JavaParaIniciantes {
    static Livro l = new Livro();

    public static void main(String[] args) {
        l.titulo = "Java para Iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}