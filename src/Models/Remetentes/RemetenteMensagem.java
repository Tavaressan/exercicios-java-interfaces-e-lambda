package Models.Remetentes;

public interface RemetenteMensagem {

    void enviaMensagemSMS (String mensagem);

    void enviaMensagemEmail (String mensagem);

    void enviaMensagemRedesSociais (String mensagem);

    void enviaMensagemWhatsapp (String mensagem);

}
