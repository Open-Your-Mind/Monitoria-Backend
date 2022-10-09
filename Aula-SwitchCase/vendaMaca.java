package monitoria03;

import java.util.Scanner;

public class vendaMaca {

	public static void main(String[] args) {

		int quantidade;
		double total;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de maças que deseja: ");
		quantidade = sc.nextInt();
		
		sc.close();
		
		if(quantidade < 12) {
			total = (quantidade * 0.30);
			System.out.printf("O total da sua compra foi: %.2f", total);
		}else if(quantidade >= 12) {
			total = (quantidade * 0.25);
			System.out.printf("O total da sua compra foi: %.2f", total);
		}

	}

}
