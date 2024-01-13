package br.com.ada.pooii.aula03;

//@Getter
//@Setter
//@ToString
//public class Pessoa {
//    private long id;
//    private String nome;
//}

import br.com.ada.pooii.aula03.exercicio.ObjetoComId;

public record Pessoa(long id, String nome) {
    // automatically create getters and setters
}
