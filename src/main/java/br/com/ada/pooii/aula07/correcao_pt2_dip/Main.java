package br.com.ada.pooii.aula07.correcao_pt2_dip;

public class Main {
    public static void main(String[] args) {

        PedidoRepository respository = new PedidoRepository("https://", "123@abc");
        EmailService emailService = new EmailService("ada-mail","abc@123");

        PedidoService pedidoService = new PedidoService(respository, emailService);
        pedidoService.confirmarPedido(1);

    }
}
