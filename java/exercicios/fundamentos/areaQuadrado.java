package java.exercicios.fundamentos;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f%n", area);

        sc.close();
    }
}