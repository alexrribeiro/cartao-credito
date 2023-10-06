import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o limite do cartão?");
        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao = 1;
        while (opcao == 1) {
            System.out.println("Digite o local da compra: ");
            sc.nextLine();
            String local = sc.nextLine();
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.nextLine();
            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(local, descricao, valor);
            boolean compraRealizada = cartao.validaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso.");
                System.out.println("Digite [1] para lançar uma nova compra ou [0] para sair.");
                opcao = sc.nextInt();
            } else {
                System.out.println("Seu limite disponível é insuficiente!");
                opcao = 0;
            }
        }

        System.out.println("COMPRAS REALIZADAS");
        Collections.sort(cartao.getCompras());
        for (Compra c: cartao.getCompras()) {
            System.out.println(c.getLocal() + "\t" + c.getDescricao() + "\t" + c.getValor());
        }
        System.out.println("\n\nLimite disponível: " + cartao.getLimiteDisponivel());
    }
}
