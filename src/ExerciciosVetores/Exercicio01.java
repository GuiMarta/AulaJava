package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       /* Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10).
        O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem
        lidos (1 a 10), os dois vetores terão o mesmo número de elementos. Gerar um terceiro
        vetor chamado Soma (de no máximo 10 elementos) que seja a soma dos dados do vetor A
        com os do vetor B. */

        System.out.println("Escolha um número (1 a 10) para o tamanho do vetor");
        int tamanho = ler.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorSoma = new int[tamanho];

        for (int i=0; i< tamanho; i++){
            System.out.printf("vetorA[%d]:",i);
            vetorA[i]=ler.nextInt();
        }

        for (int i=0; i< tamanho; i++){
            System.out.printf("vetorB[%d]:",i);
            vetorB[i]=ler.nextInt();
        }

        for(int i=0; i<tamanho;i++){
            vetorSoma[i] = vetorA[i] + vetorB [i];
            System.out.println(""+vetorSoma[i]);

        }




    }
}
