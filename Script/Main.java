package S.A;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Monitorar monitorar = new Monitorar();

        System.out.println("| Digite a temperatura:");
        double temperatura = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("|Consumo de energia alto para o Horário? :");
        String energia = entrada.nextLine();
        
        if(temperatura <= 18){
        	monitorar.temperatura();
        }else{
        	monitorar.ligar();
        }
        entrada.close();
    }
}
