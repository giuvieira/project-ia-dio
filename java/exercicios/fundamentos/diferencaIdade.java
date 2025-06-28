package java.exercicios.fundamentos;

import java.util.Scanner;

public class DiferencaIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade de duas pessoas: ");
        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        System.out.printf("%d%n", Math.abs(idade1 - idade2)); 
        sc.close();
    }
}