package br.com.ada.pooii.aula01;

import br.com.ada.pooii.domain.Autentica;
import br.com.ada.pooii.domain.Gerente;
import br.com.ada.pooii.domain.Vendedor;

public class Main1 {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Jorge", 1000);
        Gerente gerente = new Gerente("Maria", 2000);

        System.out.println("Imprimindo o bonus do Jorge: " + vendedor.getBonus());
        System.out.println("Imprimindo o bonus da Maria: " + gerente.getBonus());

        autentica(vendedor, vendedor.getSenha());
    }

    public static void autentica(Autentica a, String senha) {

        a.autenticaDefault(senha);

        if (a.autentica(senha)) {
            System.out.println("Autenticado");
        } else {
            System.out.println("Não autenticado");
        }
    }

}







