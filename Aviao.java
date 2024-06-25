public class Aviao {
    private String modelo;
    private String numeroVoo;
    private Passageiro[] passageiros;
    private boolean[] assentosOcupados;
    private Categoria[] categorias;
    private int capacidade = 20;  // faço static? imutável?
    private int contadorPassageiros;

    public Aviao(String modelo, String numeroVoo) {
        this.modelo = modelo;
        this.numeroVoo = numeroVoo;
        this.passageiros = new Passageiro[capacidade];
        this.assentosOcupados = new boolean[capacidade];
        this.categorias = new Categoria[capacidade];
        this.contadorPassageiros = 0;
    }

    public boolean adicionarPassageiro(Categoria categoria, Passageiro passageiro) {
        int assento = categoria.getNumeroAssento();
        if (contadorPassageiros < capacidade && categoria.taValida() && !assentosOcupados[assento]) {
            passageiros[contadorPassageiros] = passageiro;
            categorias[contadorPassageiros] = categoria;
            assentosOcupados[assento] = true;
            contadorPassageiros++;
            return true;
        }
        return false;
    }

    public void exibirLugaresOcupados() {
        System.out.println("Lugares Ocupados no Voo " + numeroVoo + " (" + modelo + "):");
        for (int i = 0; i < contadorPassageiros; i++) {
            System.out.println(passageiros[i] + " - " + categorias[i]);
        }
    }

    @Override
    public String toString() {
        return "Avião [modelo=" + modelo + ", numeroVoo=" + numeroVoo + "]";
    }

    // Métodos Get e Set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Passageiro[] getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiro[] passageiros) {
        this.passageiros = passageiros;
    }

    public boolean[] getAssentosOcupados() {
        return assentosOcupados;
    }

    public void setAssentosOcupados(boolean[] assentosOcupados) {
        this.assentosOcupados = assentosOcupados;
    }

    public Categoria[] getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria[] categorias) {
        this.categorias = categorias;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getContadorPassageiros() {
        return contadorPassageiros;
    }

    public void setContadorPassageiros(int contadorPassageiros) {
        this.contadorPassageiros = contadorPassageiros;
    }
}
