package UniversidadeXTI.Aulas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula_62_2 {
    
    public static void main(String[] args) throws IOException{
        
        String stringTeste = new String("um teste dahora");
        System.out.println(stringTeste.toString());
        
        Path caminho = Paths.get("C:/TesteArquivo/Teste.txt");
        System.out.println("Root: " + caminho.getRoot());
        System.out.println("Pasta acima: " + caminho.getParent());
        System.out.println("File name: " + caminho.getFileName());
        
        /* Cria dir*/
        Files.createDirectories(caminho.getParent());
        
        // Escreve arquivo
        byte[] bytes = "Meu texto".getBytes();
        Files.write(caminho,bytes); 
        
        /*
        Escrever aquivos dessa manerira somente é válido quando é bem pontual, se houverem
        muitas concatenacoes, vale a pena usar o Buffered, conforme proxima aula.
        */
        
        //Le o arquivo
        byte[] retorno = Files.readAllBytes(caminho);
        System.out.println(new String(retorno));
    }
    
}
