package br.com.ada.pooii.aula07.correcao_pt2_dip;

public class EmailService {

    public EmailService(String client, String senha) {
        System.out.println("Criando envio de email com client: " + client + " com senha: " + senha);
    }

    public void enviarEmailConfirmacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}