package aula20;
import aula20.exemplosAcesso.Pessoa;
public class TesteAcesso {
    public static void main(String[] args) {
        //funciona se o String nome for public
        Pessoa.p1 = new Pessoa();
        p1.nome = "Jonass";

    }
}
