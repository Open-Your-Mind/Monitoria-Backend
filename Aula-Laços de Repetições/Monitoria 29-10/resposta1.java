package monitoriaJava;

public class resposta1 {
    public static void main(String[] args) {

        int i = 0, y = 0;

        while(i < 20){
            System.out.println(i + "- " + "While - Eu gosto de estudar algoritmo!");
            i++;
        }

        do{
            System.out.println(y + "- " + "Do While - Eu gosto de estudar algoritmo!");
            y++;
        }while(y < 20);

        //---------------------------------------------------------------------
            //0 ---> 0 < 20 ? 0 > 1
        for(int j = 0; j < 20; j++) {
            System.out.println(j + " - " + "FOR - Eu gosto de estudar algoritmo!");
        }



    }
}
