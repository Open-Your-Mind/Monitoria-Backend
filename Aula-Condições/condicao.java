import java.util.Locale;
import java.util.Scanner;

public class condicao {

	public static void main(String[] args) {
		
		double p1, p2, p3, p4, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe a nota 1 do Aluno: ");
		p1 = sc.nextDouble();
		
		System.out.print("Informe a nota 2 do Aluno: ");
		p2 = sc.nextDouble();
		
		System.out.print("Informe a nota 3 do Aluno: ");
		p3 = sc.nextDouble();
		
		System.out.print("Informe a nota 4 do Aluno: ");
		p4 = sc.nextDouble();
		
		sc.close();
		
		media = (p1 + p2 + p3 + p4) / 4;
		
		
		if(media >= 6) {
			System.out.println("Sua media foi: " + media + " Logo esta Aprovado");
		}else {
			System.out.println("Sua media foi: " + media + " Logo esta Reprovado");
		}
		
	}

}
