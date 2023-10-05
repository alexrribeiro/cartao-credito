public class Compra {
    private String local, descricao;
    private double valor;

    public Compra(String local, String descricao, double valor) {
        this.local = local;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getLocal() {
        return local;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: \nLocal: " + local + "\t" +
                "Descrição: " + descricao + "\t" +
                "Valor: " + valor;
    }
}
