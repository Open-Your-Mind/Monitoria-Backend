package monitoriaJava;

import java.util.Scanner;

public class resposta6 {
    public static void main(String[] args) {

        int soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int idade = 0;
            System.out.print("Informe sua idade: ");
            idade = sc.nextInt();

            soma += idade;
        }

        System.out.println("A soma das idade foi: " + soma);
    }
}
