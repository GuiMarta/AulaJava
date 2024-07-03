package Exemplos;

import java.util.Scanner;


public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 : ");

        int dia = ler.nextInt();

        switch (dia){
            case 7:
            case 1:
                System.out.println("É fim de semana");
                break;
            case 2,3,4,5,6 :
                System.out.println("É dia útil");
                break;
            /* case 2,3,4,5,6 ->{ System.out.println("É dia útil");}   também poderia ser utilizado - nao precisa de break- diferentes tipos de cases nao podem se misturar */
            default:
                System.out.println("Número inválido");



        }

    }
}
