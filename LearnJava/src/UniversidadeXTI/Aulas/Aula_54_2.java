package UniversidadeXTI.Aulas;

import Classes.Cachorro;
import Classes.Galinha;
import Classes.Animal;

public class Aula_54_2 {
    
    public static void main(String[] Args){ //Erros Comuns
        
        try{
            int a = 1/0;               
        } catch (Exception e){
            //java.lang.ArithmeticException: / by zero
            System.out.println(e.toString());
        } finally{            
            try {             
                
                int[] arrayNulo = new int[0];  
                //java.lang.ArrayIndexOutOfBoundsException: 1
                System.out.println(arrayNulo[1]); 
                
            } catch (Exception e){
                System.out.println(e.toString());
            } finally{
              
                try {
                    //java.lang.ClassCastException: Classes.Galinha cannot be cast to Classes.Cachorro
                    Animal g = new Galinha();
                    Cachorro c = (Cachorro) g;
                } catch (Exception e){
                    System.out.println(e.toString());                    
                } finally{
                    
                    try {
                        int[] arrayNulo = new int[1];

                        if (1+1 == 2) {
                            arrayNulo = null;
                        }
                        //java.lang.NullPointerException
                        System.out.println(arrayNulo[0]);                    
                    } catch (Exception e){
                        System.out.println(e.toString());
                    }
                }
            }
        }    
    }
}
