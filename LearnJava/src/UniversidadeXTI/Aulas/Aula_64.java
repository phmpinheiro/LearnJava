package UniversidadeXTI.Aulas;

import java.util.ArrayList;
import Classes.Conta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula_64 { //Desafio
    
    
    public static void main(String[] Args)throws IOException{

        Path caminho = Paths.get("C:/Users/pedro.pinheiro/Google Drive/LearnJava/Files/contas.txt");        
        ArrayList<Conta> contas = new ArrayList<Conta>();
        ArrayList<Conta> contasImportadas = new ArrayList<Conta>();
        contas.add(new Conta("Pedro", 12500.02));
        contas.add(new Conta("Andreia", 13215.01));
        contas.add(new Conta("Raquel", 25001.02));
        contas.add(new Conta("Lilica", 15.01));
        
        exportaContaParaAquivo(contas); 
        contasImportadas = importaContaDoArquivo(caminho);
        
        for (Conta c : contasImportadas){
            System.out.println("Cliente: " + c.Cliente + " Saldo: " + c.Saldo);
        }
        
        
    }
    
    public static ArrayList<Conta> importaContaDoArquivo(Path pCaminho) throws IOException{
        
        String line = new String();
        BufferedReader reader = Files.newBufferedReader(pCaminho);
        ArrayList<Conta> contas = new ArrayList<Conta>();
        
        String[] linha;
        String cliente = "";
        double saldo = 0;
        
        while ((line = reader.readLine()) != null){
            
            linha = line.split(";");
            
            for (String s : linha) {
                if (s.matches("^Cliente.*")) {
                    cliente = (s.substring(s.indexOf(":")+1, s.length()));
                } else {
                    if (s.matches("^Saldo.*")) {
                        saldo =  Double.parseDouble(s.substring(s.indexOf(":")+1, s.length()));
                    }                     
                }

                if ( (!cliente.isEmpty()) && (saldo > 0)) {
                      contas.add(new Conta(cliente,saldo));
                      cliente = "";
                      saldo = 0;
                }                
            }
            
        } 
        return contas;                
    }
    
    public static void exportaContaParaAquivo(ArrayList<Conta> pContas) throws IOException{
        
        Path caminho = Paths.get("C:/Users/pedro.pinheiro/Google Drive/LearnJava/Files/contas.txt");        
        Files.createFile(caminho);
        Charset utf8 = StandardCharsets.UTF_8;        
        
        try(BufferedWriter bf = Files.newBufferedWriter(caminho, utf8)){
        
            for (Conta c : pContas) {
                bf.write("Cliente:" + c.Cliente + ";");
                bf.write("Saldo:" + c.Saldo + ";");
                bf.write("\n");
                bf.flush();
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }    
}
