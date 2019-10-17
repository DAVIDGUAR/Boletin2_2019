/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin2_3_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int b100,b20,b5,m1,total;
       
       b100=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de billetes de 100€"));
        b20=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de billetes de 20€"));
        b5=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de billetes de 5€"));
        m1=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de monedas de 1€"));
        
        total=(b100*100)+(b20*20)+(b5*5)+(m1*1);
        
        System.out.println("El total en euros es "+total+"€");
        
       
    }
    
}
