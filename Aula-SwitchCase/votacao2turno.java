package monitoria03;

import java.util.Scanner;

public class votacao2turno {

	public static void main(String[] args) {
		
		int anoDeNascimento, podeVotar;
		final int ANOATUAL = 2022;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu Ano de Nascimento: ");
		anoDeNascimento = sc.nextInt();
		
		sc.close();
		
		podeVotar = (ANOATUAL - anoDeNascimento);
		
		if((podeVotar >= 16) && (podeVotar == 17) || (podeVotar >= 60)) {
			System.out.println("Voce PODE VOTAR, mas NÃO É OBRIGADO");
		}else if((podeVotar >= 18) && (podeVotar < 60)) {
			System.out.println("Você OBRIGADO a Votar");
		}else {
			System.out.println("Você uma criança!");
		}

	}

}
