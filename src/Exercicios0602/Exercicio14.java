package Exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas MENSAL : ");
        int horas = ler.nextInt();
        System.out.println("Digite o salario por hora");
        float salarioPorHora = ler.nextFloat();


        if (horas > 160){

            float salario = 160 * salarioPorHora;
            float salarioTotal =  (float) ((horas - 160) * (salarioPorHora * 1.5)  + (salario));
            System.out.println(" "+salarioTotal);
        }
        else {
            float salario = horas * salarioPorHora;
            System.out.println("O salário é" + salario);
        }




}

}