package br.com.ada.pooii.aula03.exercicio;

public record Pessoa(long id, String nome) implements ObjetoComId<Long> {

    @Override
    public Long getId() {
        return id;
    }
}
