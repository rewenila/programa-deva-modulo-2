package br.com.ada.pooii.aula07.correcao_pt3_ocp;

public class Main {
    public static void main(String[] args) {

        // ContratoRepository repository = new PedidoRepository("https://", "123@abc");
        ContratoRepository repositoryPostgreSQL =
                new PedidoRepositoryPostgreSQL("postgre", "157", "pedidos", "jdbc");

        Confirmador emailService = new EmailService("ada-mail", "abc@123");
        Confirmador smsService = new SMSService("oi");
        Confirmador whatsappService = new WhatsappService();

        PedidoService pedidoService = new PedidoService(repositoryPostgreSQL, emailService);
        pedidoService.confirmarPedido(1);

    }
}
