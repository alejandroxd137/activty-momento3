public class Puerta {
    

    private boolean isOpen;

    public Puerta() {
        this.isOpen = false;
    }

    public void abierto() {
        if (!isOpen) { // CONDICIONAL: si NO está abierta
            isOpen = true;
            System.out.println("  🚪 Puertas abriéndose...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("  🚪 Puertas abiertas");
        }
    }

    public void cerrar() {
        if (isOpen) { // CONDICIONAL: si está abierta
            isOpen = false;
            System.out.println("  🚪 Puertas cerrándose...");
            try {
                Thread.sleep (500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("  🚪 Puertas cerradas");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}


