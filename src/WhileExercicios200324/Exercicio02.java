package WhileExercicios200324;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        int k = 0;
        while(i<=10){
            System.out.println("Insira um número : ");
            float num = ler.nextFloat();
            if(num>=10 && num<=20){
                 k++;
            }
            i++;
        }
        System.out.println("A quantidade de números entre 10 e 20 inseridos foi de : "+k);


    }
}
