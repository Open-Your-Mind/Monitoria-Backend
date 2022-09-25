import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o numero 1: ");
		numero1 = sc.nextInt();
		
		System.out.print("Insira o numero 2: ");
		numero2 = sc.nextInt();
		
		sc.close();
		
		if(numero1 > numero2) {
			System.out.println("O Numero 1 é Maior!");
		}else if (numero1 == numero2){
			System.out.println("Ambos numeros são iguais, Logo não tem Maior.");
		}else {
			System.out.println("O Numero 2 é o Maior!");
		}

	}

}
