package UniversidadeXTI.Aulas;

import java.util.ArrayList;

public class Arrays_Aula22{
    
    public static void main (String[] args){//ArrayList
        
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add(0,"Vermelho"); //Primeiro param passa a posição
        cores.add("Azul"); 
        cores.add("Amarelo"); 
        cores.add("Preto");
        cores.add("Laranja");
        
        System.out.println("Cores: " + cores.toString());
        System.out.println("Tamanho do array: " + cores.size());
        System.out.println("Elemento na posição 2: " + cores.get(2));
        System.out.println("ìndice da cor Amarelo: " + cores.indexOf("Amarelo"));                
        
        cores.remove(cores.indexOf("Amarelo"));
        cores.remove("Azul");
         
        System.out.println("Cores: " + cores.toString());
        
    }
    
    
}