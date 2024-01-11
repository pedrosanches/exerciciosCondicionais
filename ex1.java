package exCondicional;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N < 0) {
            System.out.println("NEGATIVO");
        }

        else
            System.out.println("POSITIVO");

        scan.close();
    }

}
