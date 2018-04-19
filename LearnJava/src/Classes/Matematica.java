package Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matematica{
    
    public Scanner s = new Scanner(System.in);
    
    
    public double somaMultimosArgumentos(double ... pNumeros){        
        double soma = 0;        
        
        for(double n : pNumeros){
            soma += n;
        }        
        return soma;        
    }
    //Que é a mesma coisa que fazer dessa maneira:
    
    public double somaMultimosArgumentosV2(double[] pNumeros){
        double soma = 0;        
        
        for(double n : pNumeros){
            soma += n;
        }        
        return soma;                
    }
    
    public int dividePorZero(int pNumerador, int pDenominador){ 
        try {
            pNumerador = s.nextInt();
            pDenominador = s.nextInt();
            return pNumerador / pDenominador;    
        } catch (ArithmeticException ex){
            throw new ArithmeticException("Deu merda no dividePorZero: " + ex.getMessage());
        }
    }
    
    ///////
    
    //Métodos sobrecarregados (assinaturas diferentes)
    
    public double mediaValores(double pValor1, double pValor2){
        
        double media;        
        media = (pValor1 + pValor2) / 2;        
        return media;        
        
    }
    
    public double mediaValores(String pValor1, String pValor2){
        
        double media;
        media = (Double.parseDouble(pValor1) + Double.parseDouble(pValor2)) / 2;
        return media;        
    }
    
    public double mediaValores(double ... numeros){
        
        double soma = 0;
        int contador = 0;
        
        for (double n : numeros){            
            soma += n;
            contador++;
        }
        
        return soma / contador;
    }
    
    public double mediaValores(String ... numeros){
        
        double soma = 0;
        int contador = 0;
        
        for(String s : numeros){
            soma += Double.parseDouble(s);
            contador++;
        }
        
        return soma/contador;        
    }
    
}

