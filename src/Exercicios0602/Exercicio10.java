package Exercicios0602;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a primeira nota : ");
        float nota1 = ler.nextFloat();
        System.out.println("Insira a segunda nota : ");
        float nota2 = ler.nextFloat();
        System.out.println("Insira a terceira nota : ");
        float nota3 = ler.nextFloat();

        float media = nota1 + nota2 + nota3;

        if(media  >= 7.0 )
            System.out.println("Aluno aprovado.");
        else if (media >= 5.0 && media < 7.0)
            System.out.println("Aluno em recuperação.");
        else if (media < 5.0)
            System.out.println("Aluno aprovado.");



    }
}
