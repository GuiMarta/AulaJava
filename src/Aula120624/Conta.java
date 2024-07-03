package Aula120624;
import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    float saldo;

    void geraIdentificador(){
        char letra = (char) new Random().nextInt(65,91);
        int valor = new Random().nextInt(1000,100000);
        identificador= letra+"_"+valor;
    }

    void depositar(float valor){
        this.saldo+=valor; //fazer referencia a classe
    }

    boolean sacar (float valor){
        if(valor<=saldo){
            saldo=valor;
            return true;
        }
        return false;
    }
    String verificaSaldo(){
        return "saldo atual R$"+String.format("%.2f",saldo);
    }
}