package br.com.ada.pooii.aula07.correcao_pt2_dip;

import java.util.List;

public record Pedido(long id, List<Item> itens, String status) {
    public Pedido atualizarStatusParaConfirmado() {
        return new Pedido(id, itens, "confirmado");
    }
}
