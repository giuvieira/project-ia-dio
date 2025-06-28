package java.exercicios.fundamentos;

import java.util.Scanner;

public class ImprimirNome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = sc.nextLine();
        
        System.out.println("Seu nome é: " + nome + "." + " Sua idade é: " + idade);
        
        sc.close();
    }
}
