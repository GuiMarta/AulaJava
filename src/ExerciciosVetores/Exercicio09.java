package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*Ler dois vetores: R de 5 elementos e S de 10 elementos. Gerar um vetor X de 15 elementos
        cujas 5 primeiras posições contenham os elementos de R e as 10 últimas posições, os
        elementos de S. Escrever o vetor X.*/

        int [] r = new int[5];
        int[] s = new int[10];

        int[] x = new int [15];
        int resultadoX;

        for(int i = 0; i < r.length; i++){
            System.out.println("Digite 5 numeros para o vetor R");
            r[i] = ler.nextInt();
        }
        for(int i = 0; i < s.length; i++){
            System.out.println("Digite 10 numeros para o vetor S");
            s[i] = ler.nextInt();
        }

        for(int i=0; i < r.length; i++){
            x[i] = r[i];
        }

        for(int i=0; i<s.length; i++){
            x[r.length + i]=s[i];
        }

        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }

    }


}
