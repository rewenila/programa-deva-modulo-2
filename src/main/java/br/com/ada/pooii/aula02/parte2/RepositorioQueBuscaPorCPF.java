package br.com.ada.pooii.aula02.parte2;

public interface RepositorioQueBuscaPorCPF<T> extends Repositorio<T> {

    T buscarPorCPF(String cpf);

}
