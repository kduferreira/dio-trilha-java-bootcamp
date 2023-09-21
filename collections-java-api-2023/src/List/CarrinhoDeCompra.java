package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> items;


    public CarrinhoDeCompra() {
        this.items = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade) {
    items.add(new Item(nome,preco,quantidade));
    }


    public void removerItem(String nome){
        List<Item> itemsparaRemover = new ArrayList<>();
        for( Item i : items) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsparaRemover.add(i);
            }
        }
        items.removeAll(itemsparaRemover);
    }


    public Double calcularValorTotal(){
        double valorTotal = 0.00;
        if(this.items.isEmpty()){
           throw new RuntimeException("Essa lista esta vazia");
        } else {
            double valorItem;

            for (Iterator iter = this.items.iterator(); iter.hasNext(); valorTotal = valorTotal + valorItem) {
                Item item = (Item) iter.next();
                valorItem = item.getPreco() + (double) item.getQuantidade();
            }
            return valorTotal;
        }
    }


    public void exibirItens(){
        if (!this.items.isEmpty()){
            System.out.println(this.items);
        } else {
            System.out.println("Esta lista esta vazia");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();


        carrinhoDeCompra.adicionarItem("carne", 20.0, 2);
        carrinhoDeCompra.adicionarItem("carne", 20.0, 2);
        carrinhoDeCompra.adicionarItem("carne", 20.0, 2);
        carrinhoDeCompra.adicionarItem("Frango", 50.0, 7);
        carrinhoDeCompra.exibirItens();

        carrinhoDeCompra.removerItem("Frango");
        carrinhoDeCompra.exibirItens();
    }
}
