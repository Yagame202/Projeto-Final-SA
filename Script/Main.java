package S.A;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cadastrar novoArConcionado = new Cadastrar();

        System.out.println("| Digite a temperatura:");
        double temperatura = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("| tem pessoas no ambiente? :");
        String presenca = entrada.nextLine();
        
        if(temperatura <= 26 && presenca.equalsIgnoreCase("sim")) {
        	novoArConcionado.ligar();
        }else {
        	novoArConcionado.desligar();
        }
        entrada.close();
    }
}