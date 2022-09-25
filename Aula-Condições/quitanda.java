import java.util.Scanner;

public class quitanda {

	public static void main(String[] args) {
		
		double precoMaca, totalVenda;
		int quantidade;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de maça: ");
		quantidade = sc.nextInt();
		
		sc.close();
		
		if(quantidade < 12) {
			
			precoMaca = 0.30;
			
			totalVenda = (quantidade * precoMaca);
			
			System.out.printf("O total da Venda foi: R$ %.2f", totalVenda);
			
		}else if(quantidade >= 12){
			
			precoMaca = 0.25;
			
			totalVenda = (quantidade * precoMaca);
			
			System.out.printf("O total da Venda foi: R$ %.2f" , totalVenda);
		}

	}

}
