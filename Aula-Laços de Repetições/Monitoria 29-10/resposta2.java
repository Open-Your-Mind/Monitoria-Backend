package monitoriaJava;

public class resposta2 {
    public static void main(String[] args) {

        int soma = 0;


        for (int i = 0;i <= 15; i++) {
            System.out.println("Contagem: " + i);
            soma += i;
        }
        System.out.println("A Soma total foi: " + soma);
    }
}
