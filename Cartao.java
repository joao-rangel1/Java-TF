public class Cartao {
    private String numero;

    public Cartao(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cartao [numero=" + numero + "]";
    }
}
