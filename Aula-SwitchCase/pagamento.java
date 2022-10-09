package aula01;

import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {

        double preco, total;
        int escolha;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do produto: ");
        preco = sc.nextDouble();

        System.out.println("====LOJAS AMERICANAS====");
        System.out.println("===FORMA DE PAGAMENTO===");
        System.out.println("1 - A Vista");
        System.out.println("2 - A Prazo");
        System.out.println("========================");
        System.out.println("");
        System.out.print("Escolha o metodo: ");
        escolha = sc.nextInt();

        sc.close();

        switch (escolha){
            case 1:
                total = preco - (preco * 0.1);
                System.out.printf("O total foi de R$: %.2f", total);
            break;

            case 2:
                System.out.printf("O total foi de R$: %.2f", preco);
            break;

            default:
                System.out.println("Opção Invalida");
        }

    }
}
