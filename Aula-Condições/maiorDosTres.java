import java.util.Scanner;

public class maiorDosTres {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o numero 1: ");
		num1 = sc.nextInt();
		
		System.out.println("informe o numero 2: ");
		num2 = sc.nextInt();
		
		System.out.println("informe o numero 3: ");
		num3 = sc.nextInt();		
		
		sc.close();
		
		
		if(num3 > num1) {
			if(num1 > num2) {
				System.out.println("A ordem crescente: " + num2 + ", " + num1 + ", " + num3);
			}else if(num2 < num3) {
				System.out.println("A ordem crescente: " + num1 + ", " + num2 + ", " + num3);
			}
			
		}if(num1 > num2) {
			if(num2 > num3) {
				System.out.println("A ordem crescente: " + num3 + ", " + num2 + ", " + num1);
			}else if(num3 < num1) {
				System.out.println("A ordem crescente: " + num2 + ", " + num3 + ", " + num1);
			}
			
		}if(num1 < num2) {
			if(num3 < num1) {
				System.out.println("A ordem crescente: " + num3 + ", " + num1 + ", " + num2);
			}else if(num3 < num2) {
				System.out.println("A ordem crescente: " + num1 + ", " + num3 + ", " + num2);
			}
		}		
	}
}
