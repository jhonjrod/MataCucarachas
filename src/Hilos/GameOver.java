
package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class GameOver extends Thread{

    
    @Override
    public void run(){//Podria eliminar este Hilo. Ahi miro
        /*while(true){
            for(JLabel lab : MoverCucaracha.cucarachas){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GameOver.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(lab.getLocation().getX() >= 1368){
                    System.out.println("----PERDISTE!");
                    return;
                }
            }
        }*/
    }
    
}
