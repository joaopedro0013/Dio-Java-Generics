import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhocompraList; // Declaração da lista

    public CarrinhoDeCompras() {
        this.carrinhocompraList = new ArrayList<>(); // Inicialização da lista
    }

    // Adicionar itens no carrinho de compras
    public void adicionarItens(String nome, double preco, int quantidade) {
        carrinhocompraList.add(new Item(nome, preco, quantidade));
    }

    // Remover itens do carrinho
    public void removerIten(String nome) {
        for (int i = 0; i < carrinhocompraList.size(); i++) {
            if (carrinhocompraList.get(i).getNome().equals(nome)) {
                carrinhocompraList.remove(carrinhocompraList.get(i));
            }
        }
    }

    // Calcular o valor total da compra
    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < carrinhocompraList.size(); i++) {
            total += carrinhocompraList.get(i).getPreco();
        }
        return total; // Mova o return para fora do loop
    }

    // Exibir os itens da lista
    public void exibirItens() {
        if (carrinhocompraList.isEmpty()) {
            System.out.println("Não tem nada no carrinho");
        } else {
            for (Item item : carrinhocompraList) {
                System.out.println(item.getNome() + " - Preço: R$" + item.getPreco());
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItens("leite", 8.50, 3);
        carrinhoDeCompras.adicionarItens("Suco", 5.50, 5);
        carrinhoDeCompras.adicionarItens("biscoito", 4.50, 8);

        System.out.println("Produtos no carrinho:");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerIten("leite");

        double valorTotal = carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total da compra: R$" + valorTotal);
    }
}

