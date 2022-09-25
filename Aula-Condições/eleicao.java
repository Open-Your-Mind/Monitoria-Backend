import java.util.Scanner;

public class eleicao {

	public static void main(String[] args) {
		
		int anoNascimento;
		final int anoAtual = 2022;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		sc.close();
		
		int possoVotar = (anoAtual - anoNascimento);
		
		if( (possoVotar >= 18) && (possoVotar < 60) ) {
			System.out.println("Voce PODE votar! E é OBRIGATORIO");
			
		}else if((possoVotar >= 16) && (possoVotar < 18) || (possoVotar >= 60)){
			System.out.println("Você PODE votar, porém NÃO É OBRIGATORIO");
			
		}else {
			System.out.println("Você ainda é uma criança, vai se preocupar com outra coisa");
		}

	}

}
