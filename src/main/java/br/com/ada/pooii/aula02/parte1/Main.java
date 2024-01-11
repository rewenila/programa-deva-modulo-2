package br.com.ada.pooii.aula02.parte1;

import br.com.ada.pooii.domain.Vendedor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Jorge", 1200);

        Integer ano = null;

        if (vendedor.getNome().equals("Jorge")) {
            ano = 1994;
        } else if (vendedor.getNome().equals("Roberto")) {
            ano = 1997;
        }

        // unchecked exception
        if (ano != null) {
            System.out.println("Ano de nascimento: " + ano.toString());
        }

        // checked exception
        try {
            Files.readAllBytes(Path.of(""));
        } catch (IOException e) {
            // create the file
            e.printStackTrace();
        }
    }
}
