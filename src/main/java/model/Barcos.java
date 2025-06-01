package model;

/**
 *
 * @author mario
 */
public class Barcos {
    private int peso;
    private int velocidade;
    private String cor;

    public Barcos() {
    }

    public Barcos(int peso, int velocidade, String cor) {
        this.peso = peso;
        this.velocidade = velocidade;
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    
}
