public class Iphone {

    private ReprodutorMusical ipod;
    private Navegador safari;
    private Telefone telefone;

    public Iphone() {
        this.ipod = new ReprodutorMusical();
        this.safari = new Navegador();
        this.telefone = new Telefone();
    }

    public void reproduzirMusica() {
        this.ipod.reproduzirMusica();
    }

    public void navegarNaInternet() {
        this.safari.navegar();
    }

    public void ligarParaAlguem() {
        this.telefone.ligar();
    }
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        meuIphone.reproduzirMusica();
        meuIphone.navegarNaInternet();
        meuIphone.ligarParaAlguem();

    }
}
