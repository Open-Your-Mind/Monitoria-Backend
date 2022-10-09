package aula01;

import java.util.Scanner;

public class produtoReferencia {
    public static void main(String[] args) {

        int codigo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o codigo desejado: ");
        codigo = sc.nextInt();

        sc.close();

        switch (codigo){
            case 1:
                System.out.println("Alimento não-perecível");
            break;

            case 2, 3, 4:
                System.out.println("Alimento perecível");
            break;

            case 5, 6:
                System.out.println("Vestuário");
            break;

            case 7:
                System.out.println("Higiene pessoal");
            break;

            case 8, 9,10, 11,12,13,14,15:
                System.out.println("Limpeza e Utensilios Domésticos");
            break;

            default:
                System.out.println("Valor invalido");
        }
    }
}
