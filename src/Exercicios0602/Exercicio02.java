//2) Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria a qual este nadador pertence. A categoria dos nadadores é dada pela seguinte tabela:

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o seu Nome : ");
        String nome = ler.next();
        System.out.println("Insira a sua idade : ");
        int idade = ler.nextInt();

        if(idade >= 5 && idade <= 7)
            System.out.println("O nadador "+nome+" está na Categoria Infatil A ");

        else if(idade >= 8 && idade <= 10)
            System.out.println("O nadador "+nome+" está na Categoria Infatil B ");

        else if(idade >= 11 && idade <= 13)
            System.out.println("O nadador "+nome+" está na Categoria Juvenil A ");

        else if(idade >= 14 && idade <= 17)
            System.out.println("O nadador "+nome+" está na Categoria Juvenil B ");

        else if (idade >= 18)
            System.out.println("O nadador "+nome+" está na Categoria Adulto ");

    }
}
