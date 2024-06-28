package iphone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhoneConcreto();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Eric Clapton");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        meuIphone.exibirPagina("http://qualquerum.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
