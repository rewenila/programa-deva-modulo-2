/*
package br.com.ada.pooii.aula05.solid;

public class Main3 {
    public static void main(String[] args) {

        // Defining repositoru
        RepositoryMySQL mySQL = new RepositoryMySQL("Jorge", "http");

        // New payment received
        Pagamento novoPagamento = new Pagamento(5432, "oracle_queries");

        // Asking service to do the payment
        PagamentoService service = new PagamentoService(mySQL);
        service.efetuarPagamento(novoPagamento);

    }
}

class PagamentoService {

    public final RepositoryMySQL repository;
    public final RepositoryOracle repositoryOracle;

    public PagamentoService(RepositoryMySQL repository) {
        this.repository = repository;
    }

    public void efetuarPagamento(Pagamento pagamento) {
        repository.salvar(pagamento);
    }
}

class RepositoryOracle implements Repositorio {

    public RepositoryOracle(int porta, String conexao) {

    }

    public void salvar(Pagamento pagamento) {
        System.out.println("Salvou o pagamento no Oracle.");
    }
}

class RepositoryMySQL implements Repositorio{

    public RepositoryMySQL(String login, String url) {
        System.out.println();
    }
    public void salvar(Pagamento pagamento) {
        System.out.println("Salvou o pagamento no MySQL.");
    }
}

interface Repositorio {
    public void salvar(Pagamento pagamento);

}

class Pagamento {

}
*/
