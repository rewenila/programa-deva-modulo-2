package br.com.ada.pooii.aula05.revisao;

public class Revisao {
}

interface Animal {
    void comer();

    // We can have concrete and abstract methods inside an interface
    // Every method inside an interface is automatically public and abstract
    void reproduzir();

    default void executaReproduzirDefault() {

    }

    // Static mehods: do not belong to the implementation, but to the interface
    static void executarReproduzirStatic() {

    }

    // Default methods
    private void executaReproduzir() {
        System.out.println("Executando reproduzir");
    }


}

// An interface can extend another interface, but cannot implement another interface
// An interface can extend more than one interface
interface Ave extends Animal {
    void voar();
}
