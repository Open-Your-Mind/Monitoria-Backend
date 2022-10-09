package monitoria03;

import java.util.Scanner;

public class cefCalculo {

	public static void main(String[] args) {
		
		double saldoMedio, credito, retornoCliente;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu Saldo Medio no ano de 2021: ");
		saldoMedio = sc.nextDouble();
		
		sc.close();
		
		if((saldoMedio >= 0) && (saldoMedio <= 500)) {
			
			System.out.println("Você não direito a Credito!");
			
		}else if((saldoMedio >= 501) && (saldoMedio <= 1000)) {
			
			credito = (saldoMedio * 0.30);
			retornoCliente = (saldoMedio + credito);
			
			System.out.printf("O valor do seu credito foi: R$ %.2f \n ", credito);
			System.out.printf("O valor total sera de: R$ %.2f \n", retornoCliente);
			
		}else if((saldoMedio >= 1001) && (saldoMedio <= 3000)) {
			
			credito = (saldoMedio * 0.40);
			retornoCliente = (saldoMedio + credito);
			
			System.out.printf("O valor do seu credito foi: R$ %.2f\n", credito);
			System.out.printf("O valor total sera de: R$ %.2f \n", retornoCliente);
			
		}else if(saldoMedio >= 3001) {
			
			credito = (saldoMedio * 0.50);
			retornoCliente = (saldoMedio + credito);
			
			System.out.printf("O valor do seu credito foi: R$ %.2f \n" + credito);
			System.out.printf("O valor total sera de: R$ %.2f \n" + retornoCliente);
		}

	}

}
