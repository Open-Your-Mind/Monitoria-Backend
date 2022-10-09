package monitoria03;

import java.util.Scanner;

public class validador {

	public static void main(String[] args) {
		
		char escolha;
		int senhaUser;
		final int sisSenha = 1234;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja fazer Login? [S/n]: ");
		escolha = sc.next().charAt(0);
		
		char conversao = Character.toUpperCase(escolha);
		
		switch(conversao) {
		
		case 'S':
			System.out.print("Informe a senha: ");
			senhaUser = sc.nextInt();
		
			if(senhaUser == sisSenha) {
				System.out.println("ACESSO PERMITIDO");
			}else {
				System.out.println("ACESSO NEGADO");
			}
		break;
		
		case 'N':
			System.out.println("Xau!!!");
		break;
		
		default:
			System.out.println("Valor Invalido");
		}
		
		sc.close();

	}

}
