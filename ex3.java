package exCondicional;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A % B == 0 || B % A == 0)
            System.out.println("São multiplos");

        else
            System.out.println("Não são multiplos");

        scan.close();

    }
}
