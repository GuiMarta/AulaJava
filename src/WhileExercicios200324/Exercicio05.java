package WhileExercicios200324;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1 = 0;
        float nota2 = 0;
        for (; nota1 <= 0.0 || nota1 > 10;){
            System.out.println("Insira a primeira Nota válida : ");
            nota1 = ler.nextFloat();
        }
        for (; nota2 <= 0.0 || nota2 > 10;){
            System.out.println("Insira a segunda Nota válida : ");
            nota2 = ler.nextFloat();
        }
        float media = ((nota1 + nota2) /2);
        System.out.println("a média é "+media);
    }
}
