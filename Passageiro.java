public class Passageiro {
    private String nome;
    private Cartao cartao;

    public Passageiro(String nome, Cartao cartao) {
        this.nome = nome;
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Passageiro [nome=" + nome + ", cartao=" + cartao + "]";
    }
}
