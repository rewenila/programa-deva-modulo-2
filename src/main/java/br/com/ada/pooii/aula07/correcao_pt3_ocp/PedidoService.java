package br.com.ada.pooii.aula07.correcao_pt3_ocp;

import java.util.List;

public class PedidoService {

    // dependance inversion principle
    private final ContratoRepository contratoRepository;
    private final Confirmador confirmador;

    public PedidoService(ContratoRepository contratoRepository, Confirmador confirmador) {
        this.contratoRepository = contratoRepository;
        this.confirmador = confirmador;
    }
    public void confirmarPedido(long id) {
        // valida id
        // busca pedido no banco de dados
        Pedido pedidoEncontrato = contratoRepository.buscarPorId(id);
        Pedido pedidoAtualizado = pedidoEncontrato.atualizarStatusParaConfirmado();

        // atualiza pedido no banco de dados
        contratoRepository.atualizar(id, pedidoAtualizado);

        // envia email de confirmacao
        confirmador.enviarConfirmacao("Pedido confirmado: " + pedidoAtualizado);
    }

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