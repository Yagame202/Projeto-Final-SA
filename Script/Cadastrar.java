package S.A;

public class Cadastrar {

    private boolean estaLigado = false;

    public void ligar() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("\n O ar condicionado esta ligado.");
        }
    }
    public void desligar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("\n O ar condicionado esta desligado.");
        }
    }
}