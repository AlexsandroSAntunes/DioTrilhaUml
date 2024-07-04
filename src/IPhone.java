import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class IPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public IPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        // Testando o reprodutor musical
        meuIphone.getReprodutorMusical().selecionarMusica("Imagine - John Lennon");
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().pausar();

        // Testando o aparelho telefônico
        meuIphone.getAparelhoTelefonico().ligar("123-456-7890");
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().iniciarCorrerioVoz();

        // Testando o navegador de internet
        meuIphone.getNavegadorInternet().exibirPagina("https://www.google.com");
        meuIphone.getNavegadorInternet().adicionarNovaAba();
        meuIphone.getNavegadorInternet().atualizarPagina();
    }
}
