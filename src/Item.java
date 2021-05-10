public class Item {

    public String descricao;
    public String categoria;
    public double valor;

    public Item(double valor, String descricao, String categoria) {
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Item(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

}
