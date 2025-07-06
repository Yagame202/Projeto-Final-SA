package S.A;

public class Monitorar {
	
	public static final String BG_RED = "\u001B[41m";
	public static final String BG_YELLOW = "\u001B[43m";
	public static final String BG_WHITE = "\u001B[47m";
	 
	public static final String BLACK = "\u001B[30m";
	
	public static final String RESET = "\u001B[0m";

	public static final String BOLD = "\u001B[1m";

    private boolean estaLigado = false;

    public void ligar() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("\n| Ar-condicionado ligado normalmente. |");
        } else {
            System.out.println("\n| Ar-condicionado ja esta ligado. |");
        }
    }
    public void desligar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("\n| Ar-condicionado desligado. |");
        }
    }
    public void ajustarTemperatura() {
        System.out.println(BG_RED + BLACK + BOLD +"\n| Temperatura muito baixa! Aumentando automaticamente para reduzir o consumo |" + RESET);
    }

    public void ativarModoVentilacao() {
        System.out.println(BG_YELLOW + BLACK + "\n| Consumo de energia alto! Ativando modo ventilação |" + RESET);
    }

    public void atualizarSistema() {
        System.out.println(BG_WHITE + BLACK + "\n| Sistema atualizado com as novas configurações  |");
    }
}

