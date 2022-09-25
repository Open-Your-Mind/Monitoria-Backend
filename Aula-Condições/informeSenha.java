import java.util.Scanner;

public class informeSenha {

	public static void main(String[] args) {
		
		int senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============SISTEMA MONITORIA=============");
		System.out.println("");
		System.out.print("Ola, bem vindo, por favor insira sua senha: ");
		senha = sc.nextInt();
		
		sc.close();
		
		
		if(senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		}else {
			System.out.println("ACESSO NEGADO");
		}
		

	}

}
