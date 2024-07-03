package ExerciciosVetores;
import java.util.Scanner;
import java.util.Random;
public class ExemploVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int[] numeros = new int[20];
            int[] par = new int[20]; // Tamanho máximo para garantir que todos os números pares sejam armazenados
            int[] impar = new int[20]; // Tamanho máximo para garantir que todos os números ímpares sejam armazenados
            Random random = new Random();

            // Preenche o vetor numeros com valores inteiros aleatórios entre 0 e 100
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(101); // Gera números aleatórios de 0 a 100
            }

            // Separa os números pares e ímpares nos vetores correspondentes
            int indicePar = 0;
            int indiceImpar = 0;
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    par[indicePar++] = numero;
                } else {
                    impar[indiceImpar++] = numero;
                }
            }

            // Imprime os números pares
            System.out.println("Números Pares:");
            for (int i = 0; i < indicePar; i++) {
                System.out.print(par[i] + " ");
            }
            System.out.println();

            // Imprime os números ímpares
            System.out.println("Números Ímpares:");
            for (int i = 0; i < indiceImpar; i++) {
                System.out.print(impar[i] + " ");
            }
            System.out.println();

    }


    }



