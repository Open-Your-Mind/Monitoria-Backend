package monitoriaJava;

import java.util.Scanner;

public class resposta11 {
    public static void main(String[] args) {

        int numero, count = 0, par;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            par = numero % 2;
            if(par == 0){
                count += 1;
            }
        }

        System.out.println("Apenas " + count + ", Foram numeros pares!");
        sc.close();
    }
}
