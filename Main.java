import src.Entidade.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        //ReprodutorMusical
        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusicar("Don´t Dream it´s over");

        //AparelhoTelefonico
        iphone1.ligar("112458566985");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();

        //NavegadotInternet
        iphone1.exibirPagina("web.dio.me");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();


    }
}
