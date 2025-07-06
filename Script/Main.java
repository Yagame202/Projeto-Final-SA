package S.A;

import java.util.*;

public class Main {
	  
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[33m";

    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_WHITE = "\u001B[47m";

    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Monitorar monitorar = new Monitorar();

        while (true) {
            System.out.println(BG_BLUE + BLACK +"| SISTEMA DE MONITORAMENTO DE ENERGIA |" + RESET);

            System.out.print(YELLOW + BOLD +"| Digite a temperatura atual (°C): " + RESET);
            double temperatura = entrada.nextDouble();
            entrada.nextLine();

            System.out.print(YELLOW + BOLD + "| O consumo de energia esta alto para o horário? (sim ou nao) " + RESET);
            String energiaAlta = entrada.nextLine();

            
            if (temperatura <= 18) {
                monitorar.ajustarTemperatura();
            } else {
                monitorar.ligar();
            }

         
            if (energiaAlta.equalsIgnoreCase("sim")) {
                monitorar.ativarModoVentilacao();
            }

            monitorar.atualizarSistema();
            System.out.println(BG_WHITE + BLACK +"\n|⚙️ Aguardando 10 minutos... |" + RESET);  
        }
    }
}
