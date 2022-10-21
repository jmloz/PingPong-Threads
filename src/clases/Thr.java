package clases;

public class Thr extends Thread {   //Clase para implementar los hilos.
    Game pantalla;
    public Thr(Game pantalla){
        this.pantalla = pantalla;

    }
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pantalla.repaint();


        }
    }

}
