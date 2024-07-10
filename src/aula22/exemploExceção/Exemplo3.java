package aula22.exemploExceção;

public class Exemplo3 {

    public int divide (int n1, int n2)  throws ArithmeticException {
        if(n2==0)
            throw new ArithmeticException("Não é possivel dividir por zero");
        return n1/n2;
    }
}

