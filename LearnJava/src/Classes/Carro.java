package Classes;

public class Carro{
    
    public String nome;
    public String cor;
    public int velocidadeMaxima;    
    public Motor motor;
    
    public Carro() {};
    
    public Carro(String pNome, String pCor, int pVelocidadeMaxima){
        this(pNome,pCor,pVelocidadeMaxima,new Motor(99999, "PRUPLE"));
    }
    
    public Carro(String pNome, String pCor, int pVelocidadeMaxima, Motor pMotor){
        this.nome = pNome;
        this.cor = pCor;
        this.velocidadeMaxima = pVelocidadeMaxima;
        this.motor = pMotor;
    }
}