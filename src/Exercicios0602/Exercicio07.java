package Exercicios0602;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("==Insira o número corresponde a operação desejada ==");
        System.out.println("1 - Conversão de Graus para Fahrenheit ");
        System.out.println("2 - Conversão de Fahrenheit para Graus");

        int op = ler.nextInt();

        switch (op){
            case 1 :
                System.out.println("Insira o número a ser convertido : ");
                float tempInicial = ler.nextFloat();
                float tempFinal = (float) ((1.8 * tempInicial) + 32);
                System.out.println("O resultado da conversão é de "+tempFinal+"Fahrenheit ");
                break;
            case 2:
                System.out.println("Insira o número a ser convertido : ");
                 tempInicial = ler.nextFloat();
                 tempFinal = (float) ((tempInicial - 32) / 1.8);
                System.out.println("O resultado da conversão é de "+tempFinal+" Graus");
                break;
            default:
                System.out.println("ERRO");
                break;



        }




    }
}
