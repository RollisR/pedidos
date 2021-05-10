import java.util.List;

public class Driver {

    public static void main(String[] args) {
        Item item1 = new Item(1, "Coxinha", "Salgado");
        Item item2 = new Item(.5, "Pretinho", "Bebida");
        Item item3 = new Item(2, "Trident");
        Item item4 = new Item(1, "Pão de Queijo", "Salgado");
        Item item5 = new Item(2, "Cockinha");

        //PEDIDO SEM DESCONTO
        Pedido pedido1 = new Pedido(1);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item5);
        //PEGA OS ITENS DO PEDIDO E COLOCA EM UMA LISTA PARA MANIPULAR
        List<Item> itensPedido1 = pedido1.getItens();

        System.out.println("* Pedido número: " + pedido1.getNumero());
        for(Item item : itensPedido1) {
            System.out.println("   * Item: " + item.descricao + " Valor: R$ " + item.valor);
        }
        System.out.println("* Total do pedido: R$ " + pedido1.getValorTotal() + "\n");

        //PEDIDO COM DESCONTO
        PedidoComDesconto pedido2 = new PedidoComDesconto(2, 0.1);
        pedido2.adicionarItem(item1);
        pedido2.adicionarItem(item5);

        List<Item> itensPedido2 = pedido2.getItens();

        System.out.println("* Pedido número: " + pedido2.getNumero());
        for(Item item : itensPedido2) {
            System.out.println("   * Item: " + item.descricao + " Valor: R$ " + item.valor);
        }
        //OBTEM O VALOR DO PEDIDO COM O DESCONTO
        System.out.println("* Total do pedido: R$ " + pedido2.getValorTotal() + "\n");
    }

}
