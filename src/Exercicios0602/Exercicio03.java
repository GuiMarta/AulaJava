//3) Usando o comando de seleção condicional simples “IF”, faça um programa que leia uma senha de 8 caracteres inteiros e verifique se a senha informada equivale a senha predefinida no programa. Se for válida informe na tela "Acesso Autorizado. Caso a senha não estiver correta informe "Acesso negado".
// package Exercicios0602;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int password = 12345678;

        System.out.println("Insira a sua Senha : ");
        int tempPass = ler.nextInt();

        if(tempPass == password)
        System.out.println("Acesso concedido");
        else
            System.out.println("Acesso negado");
    }
}
