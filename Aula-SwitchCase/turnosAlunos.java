package monitoria03;

import java.util.Scanner;

public class turnosAlunos {

	public static void main(String[] args) {
		
		char escolha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Em que turno voce estudo? (M)anha , (T)arde , (N)oite: ");
		escolha = sc.next().charAt(0);
		
		char escolhaGrande = Character.toUpperCase(escolha);
		
		sc.close();
		
		switch(escolhaGrande) {
		
		case 'M':
			System.out.println("Bom dia");
		break;
		
		case 'T':
			System.out.println("Boa Tarde");
		break;
		
		case 'N':
			System.out.println("Boa Noite");
		break;
		
		default:
			
			System.out.println("Opção Invalida.");
		
		}

	}

}
