package area;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        System.out.print("Introduce el radio del círculo: ");
	        double radio = entrada.nextDouble();
	        double area = Math.PI * Math.pow(radio, 2);
	        System.out.println("El área del círculo es: " + area);
	        entrada.close();

	}

}
