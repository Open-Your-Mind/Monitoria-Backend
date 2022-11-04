package monitoriaJava;

import java.util.Scanner;

public class resposta9 {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        numero = sc.nextInt();
        System.out.println("===============================");

        if (numero != 0){
            System.out.println("Tabuada do " + numero);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " x " + numero + " = " + (i*numero));
            }
        }else{
            System.out.println("Qualquer numero multiplicado por 0, será 0!");
        }

        sc.close();
    }
}
