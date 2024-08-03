package pd;

public class Produto {
    protected String nome;
    protected double preço;

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preço=" + getPreço() +
                '}';
    }
}
