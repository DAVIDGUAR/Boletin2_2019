/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_2_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin_2_2_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       float conversor_Fahrenheit=32,conversor_Kelvin=273.15F,centígrados,fahrenheit,kelvin;
       
       // System.out.println("Introduce grados centigrados");
        centígrados=Float.parseFloat(JOptionPane.showInputDialog("Introduce grados celsius"));
        
        fahrenheit=(centígrados*9 / 5) + 32 ;
        kelvin=centígrados+conversor_Kelvin;
        
        
        
        
        System.out.println("EQUIVALENCIA\nCelsius= "+centígrados+ "\nFahrenheit= " +fahrenheit+ "\nKelvin= "+kelvin);
        
        
        
        
        
        
    }
    
}
