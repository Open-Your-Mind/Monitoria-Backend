package monitoria03;

import java.util.Scanner;

public class saudacoes {

	public static void main(String[] args) {
		
		char turno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu Turno: (M)anha / (V)espetino / (N)oite: ");
		turno = sc.next().charAt(0);
		
		sc.close();
		
		char escolhaGrande = Character.toUpperCase(turno);
		
		switch(escolhaGrande) {
		
			case 'M':
				System.out.println("Bom Dia");
			break;
			
			case 'V':
				System.out.println("Boa Tarde");
			break;
			
			case 'N':
				System.out.println("Boa Noite");
			break;
			
			default:
				System.out.println("Valor Invalido!");
		}

	}

}
