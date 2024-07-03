package WhileExercicios200324;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num;
        do {
            System.out.println("Insira um número : ");
            num = ler.nextFloat();
        }
        while(num < 0 || num >=10);
            System.out.println("O valor inserido é : "+num);
        }
    }

