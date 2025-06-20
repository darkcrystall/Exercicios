package Exercicio4;

public class ControleDeFluxo {
    static int prioridade = 4;
    static int urgencia = 8;

    public static void main(String[] args) {
        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }
    }
}