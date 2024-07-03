//4) Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar. Use o operador matemático % (resto
// da divisão ou módulo) e o teste condicional if

        package Exercicios0602;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um numero inteiro : ");
        int num = ler.nextInt();

        if (num % 2 == 0 )
            System.out.println("Numero par");
        else
            System.out.println("Numero impar");


    }
}
