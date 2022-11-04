package monitoriaJava;

import java.util.Scanner;

public class resposta3 {
    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = sc.next().toUpperCase();

        for (int i = 0; i < 10; i++) {
            System.out.println("Seu nome: " + nome);
        }
        
        sc.close();
    }
}
