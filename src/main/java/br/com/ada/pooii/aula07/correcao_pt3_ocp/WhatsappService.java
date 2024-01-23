package br.com.ada.pooii.aula07.correcao_pt3_ocp;

public class WhatsappService implements Confirmador {

    @Override
    public void enviarConfirmacao(String mensagem) {
        System.out.println("Enviando confirmação pelo Whatsapp: " + mensagem);
    }
}
