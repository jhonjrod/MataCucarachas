
package Hilos;

import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DibujarAplastada extends Thread{
    ImageIcon i;
    MouseEvent e;
    JFrame j;
    private boolean seejecuta = true;
    
    
    @Override
    public void run(){
        if(seejecuta){
            JLabel label = new JLabel();
            j.add(label);
            label.setIcon(i);
            label.setBounds(e.getX(),e.getY(),180,95);
            label.setLocation(e.getPoint());
            try {
                Thread.sleep(20000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DibujarAplastada.class.getName()).log(Level.SEVERE, null, ex);
            }
            label.setIcon(null);
            seejecuta = false;
        }
    }

    public DibujarAplastada(ImageIcon i, MouseEvent e, JFrame j) {
        this.i = i;
        this.e = e;
        this.j = j;
    }

    
    
    
}
