package UniversidadeXTI.Aulas;

import Classes.Matematica;

public class CalculaMedaPoo_Aula_43{
    
    public static void main(String[] args){ //Metodos sobrecarregados (diferentes assinaturas)
        
        Matematica calc = new Matematica();
        
        double media1; //com Int
        double media2; //com Strings
        double media3; 
        double media4;
             
        media1 = calc.mediaValores(10, 15);
        media2 = calc.mediaValores("10","15");
        media3 = calc.mediaValores(1,2,3,4,5,6);
        media4 = calc.mediaValores("1","2","3","4","5","6");
        
        System.out.println(media1 + " - " + media2 + " - " + media3 + " - " + media4);        
    }    
}