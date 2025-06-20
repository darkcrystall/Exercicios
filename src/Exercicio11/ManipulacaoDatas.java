package Exercicio11;

import java.time.LocalDate;

public class ManipulacaoDatas {
    static LocalDate hoje = LocalDate.of(2025, 6, 9);
    static LocalDate prazo = hoje.plusDays(10);

    public static void main(String[] args) {
        System.out.println(prazo);
    }
}