package br.com.ada.pooii.aula07.correcao_pt3_ocp;

public class SMSService implements Confirmador {

    public SMSService(String operadora) {
        System.out.println("Crianco envio de SMS com client: " + operadora);
    }

    @Override
    public void enviarConfirmacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
