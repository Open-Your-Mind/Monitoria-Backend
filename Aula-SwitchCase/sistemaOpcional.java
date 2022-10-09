package monitoria03;

import java.util.Scanner;

public class sistemaOpcional {

	public static void main(String[] args) {
		
		char escolha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja Logar no sistema? [S/n]: ");
		escolha = sc.next().charAt(0);
		
		char escolhaGrande = Character.toUpperCase(escolha);

		switch(escolhaGrande) {
		
		case 'S':
			final int SENHA = 1234;
			int senhaUser;
			
			System.out.print("Informe a senha: ");
			senhaUser = sc.nextInt();
			
			if(senhaUser == SENHA) {
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Acesso Negado");
			}
		break;
		
		case 'N':
			System.out.println("Nunca é um Adeus!");
		break;
		
		default:
			System.out.println("Entrada Invalida!");			
		}
		sc.close();
	}

}
