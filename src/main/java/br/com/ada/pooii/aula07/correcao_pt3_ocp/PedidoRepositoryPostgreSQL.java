package br.com.ada.pooii.aula07.correcao_pt3_ocp;

public class PedidoRepositoryPostgreSQL implements ContratoRepository{
    public PedidoRepositoryPostgreSQL(String url, String senha, String database, String protocolo) {
        System.out.println("Conectando no db");
        System.out.println("url: " + url);
        System.out.println("senha: " + senha);
        System.out.println("database: " + database);
        System.out.println("protocolo: " + protocolo);
    }

    @Override
    public Pedido buscarPorId(long id) {
        System.out.println("(PostgreSQL) Buscando pedido pelo id: " + id);
        return new Pedido(1, null, "pendente");
    }

    public void salvar(Pedido pedido) {
        System.out.println("(PostgreSQL) Salvando pedido no db: " + pedido);
    }

    @Override
    public void atualizar(long id, Pedido pedido) {
        System.out.println("(PostgreSQL) Atualizando pedido " + id + " no db, pedido atualizado: " + pedido);
    }
    public void deletar(long id) {
        System.out.println("(PostgreSQL) Deletando pedido no banco de dados, id: " + id);
    }
}
