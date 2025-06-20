package Exercicio5;

public class Notificacoes {
    static int notificacoes = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }
        System.out.println(notificacoes);
    }
}