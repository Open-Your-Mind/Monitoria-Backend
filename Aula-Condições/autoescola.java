import java.util.Scanner;

public class autoescola {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o 1º numero: ");
		a = sc.nextInt();
		
		System.out.print("Informe o 2º numero: ");
		b = sc.nextInt();
		
		sc.close();
		
		System.out.println("O Primeiro numero é: " + b);
		System.out.println("O Segundo numero é: " + a);
	}

}
