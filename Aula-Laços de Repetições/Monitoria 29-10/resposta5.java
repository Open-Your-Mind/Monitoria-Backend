package monitoriaJava;

import java.util.Scanner;

public class resposta5 {
    public static void main(String[] args) {

        int soma = 0, numero = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numero: ");
            numero = sc.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos numeros informados é: " + soma);


    }
}
