package br.com.ada.pooii.aula07.correcao_pt1_srp;

import java.util.List;

public class PedidoService {
    public void confirmarPedido(long id) {
        // valida id
        // busca pedido no banco de dados
        PedidoRepository repository = new PedidoRepository();
        Pedido pedidoEncontrato = repository.buscarPedido(id);
        var pedidoAtualizado = pedidoEncontrato.atualizarStatusParaConfirmado();

        // atualiza pedido no banco de dados
        repository.atualizar(id, pedidoAtualizado);

        // envia email de confirmacao
        EmailService emailService = new EmailService();
        emailService.enviarEmailConfirmacao("Pedido confirmado: " + pedidoAtualizado);
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