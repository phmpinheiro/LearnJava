package UniversidadeXTI.Aulas;

import Classes.Carro;
import Classes.Motor;

public class Aula_45{
    
    public static void main(String[] args){
        
        Motor motorGol = new Motor();
        motorGol.potencia = 120;
        motorGol.tipo = "1.0";
        
        Carro gol = new Carro();
        gol.nome = "Golzinho";
        gol.cor = "Branco";
        gol.velocidadeMaxima = 100;
        gol.motor = motorGol;
        
        System.out.println("Motor do gol: " + gol.motor.tipo);
        
        Carro ferrari = new Carro("California","Vermelha",300, new Motor(666, "Devil"));
        System.out.println("Motor da ferrar: " + ferrari.motor.tipo + " : " + ferrari.motor.potencia);
        
        Carro ferrariAmarela = new Carro("F250","Amarela",1000);
        System.out.println("Motor da ferrari Amarela: " + ferrariAmarela.motor.tipo + " : " + ferrariAmarela.motor.potencia);
        
    }
    
}