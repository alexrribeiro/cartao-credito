import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito {
    Scanner sc = new Scanner(System.in);
    private double limite;
    private double limiteDisponivel;
    private List<Compra> compras;


    CartaoDeCredito(double limite) {
        this.limite = limite;
        limiteDisponivel = limite;
        this.compras = new ArrayList<>();
    }

    public boolean validaCompra(Compra compra) {
        if (limiteDisponivel >= compra.getValor()) {
            limiteDisponivel -= compra.getValor();
            compras.add(compra);
            return true;
        }

        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
