package monitoria03;

import java.util.Scanner;

public class calculadoraSimples {

	public static void main(String[] args) {
		
		int numA, numB;
		int tipoOperacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe 1º Numero: ");
		numA = sc.nextInt();
		
		System.out.print("Informe 2º Numero: ");
		numB = sc.nextInt();
		
		
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		System.out.println("");
		System.out.print("Que tipo de operação deseja fazer?: ");
		tipoOperacao = sc.nextInt();
		
		sc.close();
		
		switch(tipoOperacao) {
		
		case 1:
			int soma = numA + numB;
			
			System.out.println("A soma dos numero é: " + soma);
		break;
		
		case 2:
			int subtracao = numA - numB;
			
			System.out.println("A subtração dos numero é: " + subtracao);
		break;
		
		case 3:
			int multiplicacao = numA * numB;
			
			System.out.println("A Multiplicação dos numero é: " + multiplicacao);
		break;
		
		case 4:
			
			if( (numA == 0) || (numB == 0)) {
				System.out.println("Qualquer numero dividido por 0 será 0");
			}else {
				int divisao = numA / numB;
				System.out.println("A Divisão dos numero é: " + divisao);
			}
			
		break;
			
		default:
			System.out.println("Operação Invalida");
		}

	}

}
