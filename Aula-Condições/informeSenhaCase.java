import java.util.Scanner;

public class informeSenhaCase {

	public static void main(String[] args) {
		
		int senha, senhaUser;
		String escolha;
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============SISTEMA MONITORIA=============");
		System.out.println("");
		System.out.println("============= Você deseja cadastrar uma nova senha? [S/n] =============");
		escolha = sc.next();
			
		
		switch(escolha) {
		
		case "s":
			
			System.out.print("Informe a nova senha: ");
			senha = sc.nextInt();
			
			
			System.out.print("Informe a sua Senha: ");
			senhaUser = sc.nextInt();
			
			if(senhaUser == senha) {
				System.out.println("ACESSO PERMITO");
			}else {
				System.out.println("ACESSO NEGADO");
			}
			
		break;
		
		case "n":
			System.out.println("Ok... Xau");
		break;
		
		default:
			
		}
		sc.close();
		

		
	}
	
}
