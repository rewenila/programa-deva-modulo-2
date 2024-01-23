package br.com.ada.pooii.aula07;

public class Main {
    public static void main(String[] args) {

        // Liskov substitution principle

        Pardal pardal = new Pardal();
        fazerAveVoar(pardal);

        Galinha galinha = new Galinha();
        // fazerAveVoar(galinha);
    }

    public static void fazerAveVoar(AveVoadora ave) {
        ave.comer();
        ave.voar();
    }
}

interface Ave {
    void comer();
}

interface AveVoadora extends Ave {
    void voar();
}

class Pardal implements AveVoadora {

    @Override
    public void voar() {
        System.out.println("Pardal voando.");
    }

    @Override
    public void comer() {
        System.out.println("Pardal comendo");
    }
}

class Galinha implements Ave {

    @Override
    public void comer() {
        System.out.println("Galinha comendo.");
    }
}