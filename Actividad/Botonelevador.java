 public class Botonelevador extends Ascensor {
    
   private boolean presionado;

   public   Botonelevador(int capacidad) {

       super(capacidad);
       this.presionado = false;

   }

   public void presionarBoton(int piso) {
      this.presionado = true;
   System.out.println("Boton presionado piso" + piso);
      irApiso (piso);
     this.presionado = false;

   }

   public boolean isPresionado(){
      return presionado;

   }

}


