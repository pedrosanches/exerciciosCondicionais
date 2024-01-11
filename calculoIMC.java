package exCondicional;

import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        altura = altura / 100;
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é " + peso / (altura * altura));

        if (imc < 18.5) {
            System.out.println("MAGRO");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("NORMAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("SOBREPESO");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("OBESIDADE");
        } else
            System.out.println("OBESIDADE GRAVE");
        scan.close();
    }
}
