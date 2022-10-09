package monitoria03;

import java.util.Scanner;

public class imcCalculo {

	public static void main(String[] args) {
		
		double pesoCaba, imc, altura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu Peso: ");
		pesoCaba = sc.nextDouble();		
		
		System.out.print("Informe sua Altura: ");
		altura = sc.nextDouble();
		
		sc.close();
		
		imc = (pesoCaba/(altura * altura));
		
		if(imc < 20) {
			System.out.println("Você esta abaixo do PESO");
		}else if((imc >= 20) && (imc <= 25)) {
			System.out.println("Voce esta com o peso Normal");
		}else if((imc > 25) && (imc <= 30)) {
			System.out.println("Você esta com Sobre Peso");
		}else if((imc > 30) && (imc <= 40)) {
			System.out.println("Você esta OBESO");
		}else if(imc > 40) {
			System.out.println("Obeso Morbido");
		}

	}

}
