package Exercicio6;

import java.util.ArrayList;

public class Horarios {
    static ArrayList<String> horarios = new ArrayList<>();

    public static void main(String[] args) {
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");

        System.out.println(horarios.get(1));
    }
}