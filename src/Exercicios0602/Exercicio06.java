package Exercicios0602;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o primeiro valor : ");
         float num1 = ler.nextFloat();

        System.out.println("Insira o segundo valor : ");
        float num2 = ler.nextFloat();

        if (num1 == num2)
            System.out.println("Erro: Números iguais.");
        else if (num1 > num2)
            System.out.println("O primeiro valor inserido ("+num1+") é maior que o segundo valor("+num2+")");
        else if (num2 > num1)
            System.out.println("O segundo valor inserido ("+num2+") é maior que o primero valor("+num1+")");


    }
}
