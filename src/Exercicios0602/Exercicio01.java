//1) Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o programa exibe o número correspondente a esse mesmo mês (ex: 1);

package Exercicios0602;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o mês : ");
        String mes = ler.next();

        switch (mes){
            case "Janeiro" -> System.out.println("Mês 1");
            case "Fevereiro" -> System.out.println("Mês 2");
            case "Março" -> System.out.println("Mês 3");
            case "Abril" -> System.out.println("Mês 4");
            case "Maio" -> System.out.println("Mês 5");
            case "Junho" -> System.out.println("Mês 6");
            case "Julho" -> System.out.println("Mês 7");
            case "Agosto" -> System.out.println("Mês 8");
            case "Setembro" -> System.out.println("Mês 9");
            case "Outubro" -> System.out.println("Mês 10");
            case "Novembro" -> System.out.println("Mês 11");
            case "Dezembro" -> System.out.println("Mês 12");
            default -> System.out.println("Algo deu errado...lembre-se das letras Maiusculas");

        }




    }

}
