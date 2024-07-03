package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [] vetorA = new int[10];
        int x;
        int [] vetorM = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Digite o número do vetor ["+i+"]");
            vetorA [i]=ler.nextInt();
        }

        System.out.println("Digite o valor de x:");
        x = ler.nextInt();

        for(int i=0; i< vetorA.length; i++ ){
            vetorM [i]= vetorA[i] * x;
            System.out.println(""+vetorM[i]);
        }




    }


}
