package S.A;

public class Monitorar {

    private boolean estaLigado = false;

    public void ligar() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("\n O ar condicionado entrara em modo ventilação.");
        }
    }
    public void desligar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("\n O ar condicionado esta desligado.");
        }
    }
    public void temperatura() {
    	if(estaLigado) {
    		estaLigado = true;
            System.out.println("\n O ar condicionado aumentar a temperatura.");
    	}
    }
}
