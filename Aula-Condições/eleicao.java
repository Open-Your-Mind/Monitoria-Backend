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
			System.out.println("Voce PODE votar! E � OBRIGATORIO");
			
		}else if((possoVotar >= 16) && (possoVotar < 18) || (possoVotar >= 60)){
			System.out.println("Voc� PODE votar, por�m N�O � OBRIGATORIO");
			
		}else {
			System.out.println("Voc� ainda � uma crian�a, vai se preocupar com outra coisa");
		}

	}

}
