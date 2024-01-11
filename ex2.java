package exCondicional;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        scan.close();
    }
}
