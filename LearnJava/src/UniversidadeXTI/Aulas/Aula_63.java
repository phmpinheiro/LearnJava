package UniversidadeXTI.Aulas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula_63 {

    public static void main(String[] args) throws IOException{
        
        Path caminho = Paths.get("C:/TesteArquivo/texto.txt");       
        
        Charset  csUTF8 = StandardCharsets.UTF_8;
       
        try (BufferedWriter w = Files.newBufferedWriter(caminho, csUTF8)){            
            w.write("Meu texto ");
            w.write("Meu texto 2 ");
            w.write("Meu texto 3 ");
            w.flush();
        } catch(IOException e) {
            System.out.println("Problema ao salvar arquivo.");            
        } finally{

        }
        
        try (BufferedReader reader = Files.newBufferedReader(caminho)) {
            
            String line = new String();

            while ((line = reader.readLine()) != null) {                
                System.out.println(line);
            }            
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    
}
