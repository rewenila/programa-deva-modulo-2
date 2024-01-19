package br.com.ada.pooii.aula05.solid;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        AveVoadora gaviao = new Gaviao();
        Ave pinguim = new Pinguim();

        List<AveVoadora> voadoras = new ArrayList<>();
        voadoras.add(gaviao);

        colocarAvesParaVoar(voadoras);
    }

    public static void colocarAvesParaVoar(List<AveVoadora> voadoras) {
        for (AveVoadora ave : voadoras) {
            ave.voar();
        }
    }
}

interface Ave {
    void comer();

}

interface AveVoadora {
    void voar();
}

class Pinguim implements Ave {

    /*@Override
    public void voar() {
        throw new RuntimeException("Metodo nao faz sentido aqui.");
    }*/

    @Override
    public void comer() {
        System.out.println("Pinguim comendo.");
    }
}

class Gaviao implements Ave, AveVoadora {

    @Override
    public void voar() {
        System.out.println("Gavião voando.");
    }

    @Override
    public void comer() {
        System.out.println("Gavião comendo.");
    }
}
