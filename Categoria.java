public class Categoria {
    private String nome;
    private int numeroAssento;
    private String[] categoriasValidas = {"Economica", "Executiva"};

    public Categoria(String nome, int numeroAssento) {
        this.nome = nome;
        this.numeroAssento = numeroAssento;
    }

    public boolean taValida() {
        for (String categoria : categoriasValidas) {
            if (categoria.equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria [nome=" + nome + ", numeroAssento=" + numeroAssento + "]";
    }
}
