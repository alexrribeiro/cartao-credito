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

    public double getLimite() {
        return limite;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public List<Compra> getCompras() {
        return compras;
    }



    //    private String registraCompra() {
//        System.out.println("Digite o local da compra: ");
//        sc.nextLine();
//        local = sc.nextLine();
//        System.out.println("Digite a descrição da compra: ");
//        descricao = sc.nextLine();
//        System.out.println("Digite o valor da compra: ");
//        valor = sc.nextDouble();
//
//        verificaLimite(valor);
//
//        registro = String.format("Local: %s \tDescrição: %s \t Valor: %.2f", local, descricao, valor);
//        return registro;
//    }
//
//    private void verificaLimite(double valor) {
//        if (valor > limiteDisponivel) {
//            System.out.println("Limite indisponível!");
//            exibeFatura();
//            System.exit(0);
//        }
//        else {
//            System.out.println("Compra realizada!");
//            limiteDisponivel -= valor;
//        }
//    }
//
//    private void abreFatura() {
//        System.out.println("Digite o limite: ");
//        limite = sc.nextDouble();
//        limiteDisponivel = limite;
//    }
//
//    private void exibeFatura() {
//        for (String compra:compras) {
//            System.out.println(compra);
//        }
//    }
//
//    public void executaFatura() {
//        abreFatura();
//        int opcao = 1;
//        while (opcao == 1) {
//            compras.add(registraCompra());
//
//            System.out.println("Digite [1] para lançar uma nova compra ou [0] para sair.");
//            opcao = sc.nextInt();
//
//            if (opcao == 0) {
//                exibeFatura();
//            }
//        }
//    }
}
