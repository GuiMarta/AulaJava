//package aula22.exemploExceção.ao;
//
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//public class Exemplo1 {
//    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//
//        int num;
//        boolean valido;
//
//        do {
//            try {
//                System.out.println("digite um número: ");
//                int num = ler.nextInt();
//                valido = true;
//
//            } catch (InputMismatchException erro) {
//                System.out.println("Os valores devem ser números");
//                ler.nextInt();
//                valido = false;
//
//        }while(!valido);
//    }
//}
