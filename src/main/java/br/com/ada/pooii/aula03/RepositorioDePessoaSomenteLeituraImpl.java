package br.com.ada.pooii.aula03;

import java.util.List;

public class RepositorioDePessoaSomenteLeituraImpl implements RepositorioSomenteLeitura<Pessoa, Long>{
    @Override
    public List<Pessoa> buscarTodos() {
        Pessoa pessoa = new Pessoa(1, "Jorge");
        String nome = pessoa.nome();
        String string = pessoa.toString();
        return null;
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        return null;
    }
}
