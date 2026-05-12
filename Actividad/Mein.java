import java.util .Scanner;

public class Mein {
    
public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Puerta puerta = new Puerta();
        Botonelevador boton = new Botonelevador(5);

        for (int i = 0; i < 3; i++) {
            System.out.println("Persona " + (i + 1) + " esperando para subir al ascensor...");
            puerta.abierto();
            boton.subir();
            puerta.cerrar();

            System.out.print("Ingrese el piso al que quiere ir: ");
            int piso = sc.nextInt();

            boton.presionarBoton(piso);
            Thread.sleep(1000);
        }

        sc.close();
    }

}