import Navegador.Navegador;
import Navegador.NavegadorInternet;
import Telefone.AparelhoTelefonico;
import Telefone.Telefone;
import Reprodutor.Reprodutor;
import Reprodutor.ReprodutorMusical;

class iPhone  {
  
    AparelhoTelefonico telefone = new Telefone();
    NavegadorInternet navegador = new Navegador();
    ReprodutorMusical reprodutor = new Reprodutor();
    

    public static void main(String[] args) {

        iPhone iphone = new iPhone();

        // AparelhoTelefonico
        iphone.telefone.ligar();
        iphone.telefone.atender();
        iphone.telefone.iniciarCorreioVoz();

        // NavegadorInternet

        iphone.navegador.exibirPagina();
        iphone.navegador.adicionarNovaAba();
        iphone.navegador.atualizarPagina();

        // ReprodutorMusical

        iphone.reprodutor.tocar();
        iphone.reprodutor.pausar();
        iphone.reprodutor.selecionarMusica();

    }
}