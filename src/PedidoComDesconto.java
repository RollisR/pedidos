public class PedidoComDesconto extends Pedido {

    private double desconto;

    public PedidoComDesconto(int numero, double desconto){
        super(numero);
        this.desconto = desconto;
    }

    @Override
    public double getValorTotal() {
        this.valorTotal = 0;

        for (Item item : itens){
            this.valorTotal += item.valor;
        }

        valorTotal -= (valorTotal * desconto);
        return this.valorTotal;
    }
}
