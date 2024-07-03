package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*Declarar um vetor de até 100 números inteiros positivos, pedir para o usuário
        digitar elementos para o vetor, até que ele digite um 0 ou que o vetor esteja cheio,
        que encerra a leitura. Mostrar o vetor lido.
         */

        int [] vetor = new int[100];
        int posicao;
        int cont=0;
        do{
            System.out.println("Digite um valor para o vetor: ");
            posicao = ler.nextInt();
            if(posicao!=0) {
                vetor[cont] = posicao;
                cont++;
            }
        }
        while(posicao != 0 && cont <100);

        for(int i=0; i<cont; i++){
            System.out.print(vetor [i]+ " ");
        }

    }

    }


