//5) Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
package Exercicios0602;
import java.util.Scanner;
public class Exercicio05{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um numero inteiro : ");
        int num = ler.nextInt();

        if (num >= 10 && num <= 15 )
            System.out.println("numero esta entre 10 e 15 ");
        else
            System.out.println("nao está");
    }
    }
