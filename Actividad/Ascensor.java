import java.util.concurrent.Semaphore;

public class Ascensor {

    protected int pisoActual;
    protected int capacidadMaxima;
    protected Semaphore semaforo;

    //constructor//

    public  Ascensor  (int capacidad) {
        this.pisoActual = 0;
        this.capacidadMaxima = capacidad;
        this.semaforo = new Semaphore(capacidad);
     
    }
            
       public void subir() throws InterruptedException  {
        semaforo.acquire();
        System.out.println("Persona  subió al ascensor");
       
 }

     
      public void  irApiso(int piso) {
        this.pisoActual = piso;
        System.out.println("Ascensor en piso: " + piso );

      }

 }








    
    