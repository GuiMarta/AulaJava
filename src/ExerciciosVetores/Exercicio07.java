package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*Ler um vetor que contenha as notas de uma turma de 10 alunos. Calcular a média
        da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever
        a média da turma e o resultado da contagem.*/

        int[] notas = new int[10];
        int nota;
        int soma=0;
        int media=0;

        for(int i=0; i< notas.length; i++){
            System.out.println("Digite a "+(i+1)+"º nota");
            nota= ler.nextInt();
        }

        for(int i=0; i < notas.length; i++){
            soma = notas[i] + notas[i];
            System.out.println(soma);

        }





    }
}
