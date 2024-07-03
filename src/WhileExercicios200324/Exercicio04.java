package WhileExercicios200324;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        do {
            System.out.println("Insira a idade : ");
            idade = ler.nextInt();
        }
        while (idade < 0 || idade >=150);
        System.out.println("Idade Inserida válida : " + idade);
    }
}







