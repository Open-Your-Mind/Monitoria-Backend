package monitoria03;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		int operacao, numA, numB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======CALCULADORA======");
		System.out.println(" 1 - SOMA");
		System.out.println(" 2 - SUBTRAÇÃO");
		System.out.println(" 3 - MULTIPLICAÇÃO");
		System.out.println(" 4 - DIVISÃO");
		System.out.println("=======================");
		System.out.print("Informe o Tipo de Operação: ");
		operacao = sc.nextInt();
		
		System.out.print("Insira o primeiro numero: ");
		numA = sc.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		numB = sc.nextInt();
		
		sc.close();
		
		switch(operacao) {
		
		case 1:
			int soma = (numA + numB);
			System.out.println("O resultado da soma foi: " + soma);
		break;
		
		case 2:
			int subtracao = (numA - numB);
			System.out.println("O resultado da subtracão foi: " + subtracao);
		break;
		
		case 3:
			int multiplicacao = (numA * numB);
			System.out.println("O resultado da multiplicação foi: " + multiplicacao);
		break;
		
		case 4:
			if((numA == 0) || (numB == 0)) {
				System.out.println("Qualquer numero dividido por 0 será 0");
			}else {
				int divisao = (numA / numB);
				System.out.println("O resultado da soma foi: " + divisao);
			}			
		break;
		
		default:
			System.out.println("Valor Invalido");
		}

	}

}
