package projetotelefone;

public class Telefone {
    
    private String cor;
    private Double peso;
    private String modelo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Telefone() {
        this.cor = null;
        this.peso = 0.0;
        this.modelo = null;
    }
    
    public String resumo()
    {
        return "Modelo: " + this.modelo + "\nCor: " + this.cor + "\nPeso: " + peso;
    }
}
