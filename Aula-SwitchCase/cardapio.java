package aula01;

import java.util.Scanner;

public class cardapio {
    public static void main(String[] args) {
        int escolha, quantidade;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("======LANCHONETE COMA BEM======");
        System.out.println("100 - Cachorro quente - R$ 1,70");
        System.out.println("101 - Bauru Simples   - R$ 2,30");
        System.out.println("102 - Bauru com ovo   - R$ 2,60");
        System.out.println("103 - Hamburguer      - R$ 2,40");
        System.out.println("104 - Cheeseburguer   - R$ 2,50");
        System.out.println("105 - Refrigerante    - R$ 1,00");
        System.out.println("===============================");
        System.out.println("");
        System.out.print("Escolha seu Lanche: ");
        escolha = sc.nextInt();



        switch (escolha){
            case 100:
                System.out.print("Quantos Cachorro Quente? ");
                quantidade = sc.nextInt();

                total = (quantidade * 1.70);

                System.out.printf("O valor total foi de: %.2f", total);
            break;

            case 101:
                System.out.print("Quantos Bauru Simples? ");
                quantidade = sc.nextInt();

                total = (quantidade * 2.30);

                System.out.printf("O valor total foi de: %.2f", total);
            break;

            case 102:
                System.out.print("Quantos Bauru com ovo? ");
                quantidade = sc.nextInt();

                total = (quantidade * 2.60);

                System.out.printf("O valor total foi de: %.2f", total);
            break;

            case 103:
                System.out.print("Quantos Hamburguer? ");
                quantidade = sc.nextInt();

                total = (quantidade * 2.40);

                System.out.printf("O valor total foi de: %.2f", total);
            break;

            case 104:
                System.out.print("Quantos Cheeseburguer? ");
                quantidade = sc.nextInt();

                total = (quantidade * 2.50);

                System.out.printf("O valor total foi de: %.2f", total);
            break;

            case 105:
                System.out.print("Quantos Refrigerantes? ");
                quantidade = sc.nextInt();

                total = (quantidade * 1.00);

                System.out.printf("O valor total foi de: %.2f", total);
                break;

            default:
                System.out.println("Valor invalido!");
        }

        sc.close();
    }
}
