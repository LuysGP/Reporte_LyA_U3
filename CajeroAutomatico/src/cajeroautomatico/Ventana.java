/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Luis
 */
public class Ventana extends JFrame{
    public Ventana() {
        super("Primera Ventana");   //Mensaje que aparecera en la parte de arriba de la ventana
    }
    
    private void ejecuta(){
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        //No sea bloquea el hilo principal
        new Ventana().ejecuta();
        SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                new Ventana().ejecuta();
            }
        });
    }
}
