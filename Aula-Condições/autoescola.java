import java.util.Scanner;

public class autoescola {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o 1� numero: ");
		a = sc.nextInt();
		
		System.out.print("Informe o 2� numero: ");
		b = sc.nextInt();
		
		sc.close();
		
		System.out.println("O Primeiro numero �: " + b);
		System.out.println("O Segundo numero �: " + a);
	}

}
