package aula22.exemploArquivos;

import java.io.*;

public class Lendo {
    public static void main(String[] args) {

        File caminho = new File ("C:/Users/Guilherme/Desktop/Cimol 2024/Programação/Aula2");
        File arquivo = new File(caminho,"dadosPessoa.db");
        Pessoa p1;
        try{
            ObjectInputStream objLeitura =
                    new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            p1 = (Pessoa) objLeitura.readObject();
            System.out.println(p1);
        }
        catch (FileNotFoundException e){
            System.out.println("Erro ao ler arquivo");
        }
        catch (ClassNotFoundException e){
            System.out.println("Erro ao ler arquivo");}
        catch (IOException e){
            System.out.println("Erro ao ler as informações");
        }

    }
}