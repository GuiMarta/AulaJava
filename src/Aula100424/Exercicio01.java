//Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes de uma equação do segundo grau e retorne o valor do delta, que é dado por 'b² - 4ac' função que verifica se existem raízes reais.
//Criar outra função calculaX, para calcular os resultados da equação
//Usando as 2 funções acima, crie um aplicativo que calcula as raízes de uma equação do 2o grau: ax² + bx + c=0
//Para ela existir, o coeficiente 'a' deve ser diferente de zero.
//Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas, apenas informe que não existem raízes racionais

package Aula100424;
import java.util.Scanner;
public class Exercicio01 {


    static float A=0;
    static float B=0;
    static float C=0;
   static float delta = 0 ;

   static float baskaraX1 = 0;
    static void receberValores(){

    Scanner ler = new Scanner(System.in);

        System.out.println("Para Calcular a equação de segundo grau, informe os valores de : /n/n");
        System.out.println("Valor de A : ");
         A = ler.nextInt();
        System.out.println("Valor de B : ");
         B = ler.nextInt();
        System.out.println("Valor de C : ");
         C = ler.nextInt();
    }
    static void calcularDelta(){
        delta = ((B * B) -4 ) * A * C;
    }
    static void calcularEquação(){

        if ( delta >0){
            if (A>0){
            baskaraX1 = delta;
            }
            else{
                System.out.println("A menor que 0 : Equação de Primeiro Grau.");
            }
                    

        }
        else if (delta<0){
            System.out.println("O delta é invalido, não exite raizes racionais");
        }

    }
}
