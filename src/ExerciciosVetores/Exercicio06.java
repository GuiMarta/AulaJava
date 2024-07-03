package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*Ler um vetor C de 10 nomes de pessoas, após pedir que o usuário digite um nome
        qualquer de pessoa. Escrever a mensagem ACHEI, se o nome estiver armazenado no vetor
        C ou NÃO ACHEI caso contrário.*/

        String[] nomes = new String[10];

        for(int i=0; i < nomes.length; i++){
            System.out.println("Digite o "+ (i + 1)+ "º nome");
            nomes[i]=ler.nextLine();
        }

        System.out.println("Digite um nome");
        String nome = ler.nextLine();

        boolean encontrado = false;
        for (String nomeEcontrado: nomes){
            if(nomeEcontrado.equalsIgnoreCase(nome)){
                encontrado=true;
                break;
            }
        }

        if(encontrado){
            System.out.println("O nome " +nome+ " está na lista");
        }
        else{
            System.out.println("O nome "+nome+ " não esta na lista");
        }









    }



}
