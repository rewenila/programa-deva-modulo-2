package br.com.ada.pooii.aula07.correcao_pt2_dip;

import java.util.List;

public class PedidoService {

    // dependance inversion principle
    private final PedidoRepository repository;
    private final EmailService emailService;

    public PedidoService(PedidoRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }
    public void confirmarPedido(long id) {
        // valida id
        // busca pedido no banco de dados
        Pedido pedidoEncontrato = repository.buscarPedido(id);
        Pedido pedidoAtualizado = pedidoEncontrato.atualizarStatusParaConfirmado();

        // atualiza pedido no banco de dados
        repository.atualizar(id, pedidoAtualizado);

        // envia email de confirmacao
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