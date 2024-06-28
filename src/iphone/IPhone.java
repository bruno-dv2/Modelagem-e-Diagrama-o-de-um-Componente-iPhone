package iphone;

import java.util.ArrayList;
import java.util.List;

public abstract class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    protected List<String> armazenar;
    protected List<String> abas;

    public IPhone() {
        this.armazenar = new ArrayList<>();
        this.abas = new ArrayList<>();
    }

    // Métodos de ReprodutorMusical
    @Override
    public abstract void tocar();

    @Override
    public abstract void pausar();

    @Override
    public abstract void selecionarMusica(String musica);

    // Métodos de AparelhoTelefonico
    @Override
    public abstract void ligar(String numero);

    @Override
    public abstract void atender();

    @Override
    public abstract void iniciarCorreioVoz();

    // Métodos de NavegadorInternet
    @Override
    public abstract void exibirPagina(String url);

    @Override
    public abstract void adicionarNovaAba();

    @Override
    public abstract void atualizarPagina();
}
