package br.com.ada.pooii.aula02.parte2;

import br.com.ada.pooii.domain.Cliente;
import br.com.ada.pooii.domain.Vendedor;

public class ClienteRepositorio implements RepositorioQueBuscaPorCPF<Cliente> {

    @Override
    public void salvar(Cliente entidade) {
    }

    @Override
    public Cliente buscarPorNome(String nome) {
        return null;
    }

    @Override
    public Boolean deletar(Cliente entidade) {
        return null;
    }

    @Override
    public Cliente atualizar(Cliente entidade) {
        return null;
    }

    @Override
    public Cliente buscarPorCPF(String cpf) {
        return null;
    }
}
