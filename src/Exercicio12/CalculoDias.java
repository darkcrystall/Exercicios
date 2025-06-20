package Exercicio12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalculoDias {
    static LocalDate data = LocalDate.of(2025, 06, 10);
    static int diasUteis = 0;

    public static void main(String[] args) {
        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }
        System.out.println(data);
    }
}