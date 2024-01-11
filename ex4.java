package exCondicional;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horainicio = scan.nextInt();
        int horafim = scan.nextInt();
        int duracao = 0;
        if (horainicio < horafim) {
            duracao = horafim - horainicio;
        } else {
            duracao = 24 - horainicio + horafim;
        }
        System.out.println("tempo de partida " + duracao);

        scan.close();
    }

}
