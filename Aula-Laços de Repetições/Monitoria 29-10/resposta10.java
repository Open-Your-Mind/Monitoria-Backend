package monitoriaJava;

import java.util.Scanner;

public class resposta10 {
    public static void main(String[] args) {

        int numero, count = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            if(numero > 8){
                count += 1;
            }
        }

        System.out.println("Apenas " + count + ", Foram maiores que 8!");
        sc.close();
    }
}
