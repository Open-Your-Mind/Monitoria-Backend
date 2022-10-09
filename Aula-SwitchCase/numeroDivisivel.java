package monitoria03;

import java.util.Scanner;

public class numeroDivisivel {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		numero = sc.nextInt();
		
		sc.close();
		
		double divisivelPor2 = (numero % 2);
		double divisivelPor5 = (numero % 5);
		double divisivelPor10 = (numero % 10);
		
		if(numero != 0) {
			if(divisivelPor2 == 0) {
				System.out.println("O numero: " + numero + ", eh divisivel por 2!");
			}else{
				System.out.println("O numero: " + numero + ", NÃO eh divisivel por 2!");
			}if(divisivelPor5 == 0) {
				System.out.println("O numero: " + numero + ", eh divisivel por 5!");
			}else{
				System.out.println("O numero: " + numero + ", NÃO eh divisivel por 5!");
			}if(divisivelPor10 == 0) {
				System.out.println("O numero: " + numero + ", eh divisivel por 10!");
			}else{
				System.out.println("O numero: " + numero + ", NÃO eh divisivel por 10!");
			}
		}else {
				System.out.println("Todo numero divido por 0 eh 0");
			}
		}
	}
