package br.com.ada.pooii.aula06.exercicio1.withsolid;

import java.util.List;

public class Pedido {

    private long id;
    private List<Item> itens;

    // getters and setters

    // Todo: ask if this sould be in another class/interface
    public double calcularTotalPedido() {
        return 0;
    }
    public List<Item> getItens() {
        return null;
    }
    public long getQtdItens() {
        return 0;
    }
    public void addItem(Item item) {}
    public void deletarItem(Item item) {}
}

class Item {
    // item details
}

class PedidoRepository {

    public void buscarPedido(long id) {}
    public void salvar(Pedido pedido) {}
    public void atualizar(long id, Pedido pedido) {}
    public void deletar(long id) {}

}

class ImprimirService {
    public void imprimirPedido(Pedido pedido) {}
    public void imprimirItens(Item item) {}
}

class EmailService {
    public void enviarEmailConfirmacao(String mensagem) {}
}

class TransporteService {
    public void enviarParaTransporte() {}
}