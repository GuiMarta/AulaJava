package Exercicios0602;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o primeiro dos três lados do Triãngulo : ");
        float a = ler.nextFloat();
        System.out.println("Insira o segundo dos três lados do Triãngulo : ");
        float b = ler.nextFloat();
        System.out.println("Insira o terceiro dos três lados do Triãngulo : ");
        float c = ler.nextFloat();

        if (a == 0 || b == 0 || c == 0 ) {
            System.out.println("ERROR: Nenhum dos lados pode ser igual a zero.");}
        else if (a + b < c || b + c < a || c + a < b )
            System.out.println("Error : Um lado não pode ser maior que a soma dos outros dois. ");
        else if (a == b && a == c)
            System.out.println("Triãngulo Equilátero : Três Lados Iguais.");
        else if (a == b || b == c || c == a)
            System.out.println("Triângulo Isósceles : Dois Lados Iguais.");
        else if (a != b && b != c && c != a)
            System.out.println("Triãngulo Escaleno : Todos os lados diferentes.");
    }
}
