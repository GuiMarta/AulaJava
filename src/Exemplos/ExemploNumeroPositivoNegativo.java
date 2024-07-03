package Exemplos;

import java.util.Scanner;
public class ExemploNumeroPositivoNegativo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o numero a ser testado : ");
        float num = ler.nextFloat();

        if(num>0)
            System.out.println("O numero "+num+" é POSITIVO");
        else if (num<0)
            System.out.println("O numero "+num+"é NEGATIVO");
        else if (num == 0)
            System.out.println("O numero é NULO ");
    }

}
