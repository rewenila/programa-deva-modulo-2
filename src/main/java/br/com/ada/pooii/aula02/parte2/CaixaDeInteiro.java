package br.com.ada.pooii.aula02.parte2;

public class CaixaDeInteiro {

    private Integer obj;

    public CaixaDeInteiro(Integer obj) {
        this.obj = obj;
    }

    public Integer getObj() {
        return obj;
    }

    public void imprimir() {
        System.out.println(obj);
    }
}
