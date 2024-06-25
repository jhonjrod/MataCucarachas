
package Hilos;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoverCucaracha extends Thread {
    private ImageIcon cucaracha = new ImageIcon(getClass().getResource("/imagenes/cucaracha.png"));
    private boolean hilosigue = true;
    JFrame j;
    public static ArrayList<JLabel> cucarachas = new ArrayList<JLabel>();
    //private int y = 40;
    
    
    @Override
    public void run(){
        while(true){
            /*try {//espera 100 segundos, como casi 2 minutos
                Thread.sleep(100000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverCucaracha.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            JLabel label = new JLabel();
            label.setIcon(cucaracha);
            //System.out.println(y);
            label.setBounds(-360, 40, 180, 95);
            //System.out.println(y);
            j.add(label);
            cucarachas.add(label);
            for(int i=-360;i<=1700 && hilosigue;i+=16){try {
                //mueve la cucaracha hacia la derecha, poco a poco
                Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MoverCucaracha.class.getName()).log(Level.SEVERE, null, ex);
                }
                label.setBounds(i, 40, 180, 95);
                if(i==1368){//aqui NO ultima ejecucion del for, eso para que, sino un i tal que se pase el limite y validar lo de null, y decir que perdi si es distinto de null.
                    if(label.getIcon() != null){
                        System.out.println("----PERDISTE!");//Funciona!, sigue: Con los otros MoverCucaracha hacer lo mismo, con un system.out.println ver dentro del for sus X y Y conforme se mueven a la derecha, tomar un valor de i tal que pasen el limite && que su icono sea != null y entonces PERDISTE.
                    }
                    j.remove(label);
                    j.revalidate();
                    j.repaint();
                    System.out.println("Ultima ejecucion del for - fila cucaracha 1");
                    cucarachas.remove(label);
                }
                System.out.println("X = "+i+", Y = 40");
                //en X = 1368 la cucaracha ya ha pasado sin que logres matarla, PERDISTE.
            }
            //y+=70;
            
        }
    }

    public MoverCucaracha(JFrame j) {
        this.j = j;
    }

    public void setHilosigue(boolean hilosigue) {
        this.hilosigue = hilosigue;
    }
    
    public void eliminarCucaracha(Double distancia){
        
    }
    
}
