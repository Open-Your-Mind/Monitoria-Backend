package monitoriaJava;

import java.util.Scanner;

public class resposta4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de vezes a ser repetida: ");
        int n = sc.nextInt();

        System.out.print("Informe seu nome: ");
        String nome = sc.next();

        for (int i = 0; i < n; i++) {
            System.out.println("Seu nome: " + nome);
        }

        sc.close();
    }
}
