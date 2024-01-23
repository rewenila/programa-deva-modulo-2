package br.com.ada.pooii.aula07.correcao_pt3_ocp;

public interface ContratoRepository {

    Pedido buscarPorId(long id);
    void atualizar(long id, Pedido pedido);

}
