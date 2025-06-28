package java.exercicios.fundamentos;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base e a altura do retângulo: ");
        double base = sc.nextDouble(), altura = sc.nextDouble();
        System.out.printf("%.2f%n", base * altura);
        sc.close();
    }
}