package br.com.ada.pooii.aula07.correcao_pt2_dip;

public class PedidoRepository {

    public PedidoRepository(String url, String senha) {
        System.out.println("Conectando no db");
        System.out.println("utl: " + url);
        System.out.println("senha: " + senha);
    }

    public Pedido buscarPedido(long id) {
        System.out.println("Buscando pedido pelo id: " + id);
        return new Pedido(1, null, "pendente");
    }

    public void salvar(Pedido pedido) {
        System.out.println("Salvando pedido no db: " + pedido);
    }

    public void atualizar(long id, Pedido pedido) {
        System.out.println("Atualizando pedido " + id + " no db, pedido atualizado: " + pedido);
    }

    public void deletar(long id) {
        System.out.println("Deletando pedido no banco de dados: " + id);
    }

}
