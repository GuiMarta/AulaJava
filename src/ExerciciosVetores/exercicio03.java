package ExerciciosVetores;
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

           /*3 - Ler um vetor de números, de 10 elementos. Declarar outro vetor inverso,
            copiar todos os elementos de números de trás para frente para o vetor inverso.
            */

        int[] vetor = new int[10];
        int[] vetorInverso = new int[10];

        for(int i =0; i<vetor.length; i++){
            System.out.println("Digite os numeros do vetor["+i+"]");
            vetor[i]= ler.nextInt();
        }
        for(int i =0, j=9; i<10; i++, j--){
            vetorInverso[i] = vetor[j];
            System.out.println(vetorInverso[i]+"");
        }




    }

}



