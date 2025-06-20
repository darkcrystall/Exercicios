package Exercicio13;

import java.time.LocalTime;

public class VerificacaoHorario {
    static LocalTime envio = LocalTime.of(23, 0);
    static LocalTime limite = LocalTime.of(22, 59);

    public static void main(String[] args) {
        if (!envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário.");
        } else {
            System.out.println("Tarefa enviada com sucesso.");
        }
    }
}