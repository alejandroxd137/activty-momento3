import java.util.concurrent.Semaphore;

public class Ascensor {
	
	private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private boolean enMovimiento;
    private String direccion;

    
    public Ascensor (int pisoMinimo, int pisoMaximo) {
    this.pisoMinimo = pisoMinimo;
    this.pisoMaximo = pisoMaximo;
    this.pisoActual = 0;  
    this.enMovimiento = false; 
    this.direccion = "detenido";

 }
    
      public int getpisoActual()   { return pisoActual; }
  
      public int getpisoMinimo()   { return pisoMinimo; }

     public  int getpisoMaximo()   { return pisoMaximo; } 
 
     public  boolean isEnMovimiento()  {return enMovimiento; }
  

    public boolean pisoValido(int piso) { 
     return  piso >= pisoMinimo && piso<= pisoMaximo ;  
     



    

    
        