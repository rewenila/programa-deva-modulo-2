package br.com.ada.pooii.aula07.correcao_pt3_ocp;

public class EmailService implements Confirmador{

    public EmailService(String client, String senha) {
        System.out.println("Crianco envio de email com client " + client + "e senha " + senha);
    }

    public void enviarConfirmacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }

}
