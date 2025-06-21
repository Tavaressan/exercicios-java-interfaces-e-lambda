package Models.Remetentes;

public class Computador implements RemetenteMensagem {

    @Override
    public void enviaMensagemSMS(String mensagem) {
        System.out.println("Enviado por SMS: " + mensagem);
    }

    @Override
    public void enviaMensagemEmail(String mensagem) {
        System.out.println("Enviado por Email: " + mensagem);
    }

    @Override
    public void enviaMensagemRedesSociais(String mensagem) {
        System.out.println("Enviado por Redes Sociais: " + mensagem);
    }

    @Override
    public void enviaMensagemWhatsapp(String mensagem) {
        System.out.println("Enviado por Whatsapp: " + mensagem);
    }
}
