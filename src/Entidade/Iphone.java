package src.Entidade;

import src.Interface.AparelhoTelefonico;
import src.Interface.NavegadorInternet;
import src.Interface.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {

    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada...");
    }

    @Override
    public void selecionarMusicar(String musica) {
        System.out.println("Selecionando Musica " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligacao...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamando Serviço Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo Pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo Nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Apertando o F5, atualizando a Página..");
    }
}


