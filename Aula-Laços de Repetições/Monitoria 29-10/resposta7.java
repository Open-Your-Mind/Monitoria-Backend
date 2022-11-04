package monitoriaJava;

import java.util.Random;
import java.util.Scanner;

public class resposta7 {
    public static void main(String[] args) {

        int media = 0, soma = 0;

        Scanner sc = new Scanner(System.in);
        Random random = new Random(); //Chama o metodo de numeros aleatorios

        for (int i = 0; i < 20; i++) {
            int idade = random.nextInt(100); //Numeros aleatorios de 0 a 100.
            System.out.println("A idade é: " + idade);
            soma += idade;
        }

        media = soma / 20;

        System.out.println("A media das idade é: " + media);

        sc.close();
    }
}
