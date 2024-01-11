package br.com.ada.pooii.aula02.parte2;

import br.com.ada.pooii.domain.Cliente;
import br.com.ada.pooii.domain.Vendedor;

public class Generics2 {
    public static void main(String[] args) {

        // Without generics
        VendedorRepositorio repositorio = new VendedorRepositorio();
        Vendedor vendedor = new Vendedor("Jorge", 1200);
        // repositorio.salvarVendedor(vendedor);

        ClienteRepositorio repositorioClientes = new ClienteRepositorio();
        Cliente cliente = new Cliente();
        // repositorioClientes.salvarCliente(cliente);

        // With generics
        RepositorioGenerico<Vendedor> repositorioGenericoVendedor = new RepositorioGenerico<>();
        repositorioGenericoVendedor.salvar(vendedor);
        repositorioGenericoVendedor.buscarPorNome("Jorge");

        RepositorioGenerico<Cliente> repositorioGenericoCliente = new RepositorioGenerico<>();
        repositorioGenericoCliente.salvar(cliente);
        repositorioGenericoCliente.buscarPorNome("Maria");

        VendedorRepositorio vRepo = new VendedorRepositorio();
        vRepo.salvar(vendedor);

        ClienteRepositorio cRepo = new ClienteRepositorio();
        cRepo.buscarPorCPF("123");

        salvarObj(cRepo, cliente);
    }

    public static void salvarObj(Repositorio repo, Cliente cliente) {
        repo.salvar(cliente);
    }

}
