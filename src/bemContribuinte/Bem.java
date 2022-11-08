package bemContribuinte;

public class Bem {

    private String tipo;
    private double preco;

    public Bem(String tipo, double preco) {
        setTipo(tipo);
        setPreco(preco);
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("%s - Preço: R$ %.2f", getTipo(), getPreco());
    }
}