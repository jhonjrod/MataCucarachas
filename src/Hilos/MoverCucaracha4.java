
package Hilos;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoverCucaracha4 extends Thread {
    private ImageIcon cucaracha = new ImageIcon(getClass().getResource("/imagenes/cucaracha.png"));
    private boolean hilosigue = true;
    JFrame j;
    //public static ArrayList<JLabel> cucarachas = new ArrayList<JLabel>();
    //private int y = 40;
    
    
    @Override
    public void run(){
        while(true){
            //System.out.println("movercucaracha4 inicio");
            /*try {//espera 100 segundos, como casi 2 minutos
                Thread.sleep(100000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverCucaracha.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            JLabel label = new JLabel();
            label.setIcon(cucaracha);
            //System.out.println(y);
            label.setBounds(-380, 250, 180, 95);
            //System.out.println(y);
            j.add(label);
            MoverCucaracha.cucarachas.add(label);
            for(int i=-380;i<=1700 && hilosigue;i+=16){try {
                //mueve la cucaracha hacia la derecha, poco a poco
                Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MoverCucaracha.class.getName()).log(Level.SEVERE, null, ex);
                }
                label.setBounds(i, 250, 180, 95);
                if(i==1700){
                    j.remove(label);
                    j.revalidate();
                    j.repaint();
                    System.out.println("Ultima ejecucion del for - fila cucaracha 4");
                    MoverCucaracha.cucarachas.remove(label);
                }
            }
            //y+=70;
            
        }
    }

    public MoverCucaracha4(JFrame j) {
        //System.out.println("constructor movercucaracha4 inicio");
        this.j = j;
    }

    public void setHilosigue(boolean hilosigue) {
        this.hilosigue = hilosigue;
    }
    
    public void eliminarCucaracha(Double distancia){
        
    }
    
}
