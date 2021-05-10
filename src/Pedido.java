import java.util.ArrayList;
import java.util.List;

public class Pedido {

    protected List<Item> itens;
    protected double valorTotal;
    protected int numero;

    public Pedido(int numero) {
        itens = new ArrayList<>();
        this.valorTotal = 0;
        this.numero = numero;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List getItens() {
        return itens;
    }

    public double getValorTotal(){
        valorTotal = 0;

        for (Item item : itens){
            valorTotal += item.valor;
        }

        return valorTotal;
    }

    public int getNumero() {
        return numero;
    }

}
