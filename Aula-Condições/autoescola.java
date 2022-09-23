import java.util.Scanner;

public class autoescola {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu Nome: ");
		nome = sc.next();
		
		System.out.print("Informe sua Idade: ");
		idade = sc.nextInt();
		
		sc.close();
		
		if(idade >= 18) {
			System.out.println("Olá " + nome + ", Voce PODE tirar a CNH");
		}else {
			System.out.println("Olá " + nome + ", Voce NAO pode tirar a CNH");
		}

	}

}
