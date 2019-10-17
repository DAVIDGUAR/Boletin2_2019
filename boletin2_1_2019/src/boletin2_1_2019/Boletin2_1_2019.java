/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin2_1_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        float precio,pagado,descuento;
        
        
        System.out.println("Introduce el precio");
        
        Scanner a = new Scanner(System.in);
        
        precio=a.nextFloat();
        
        System.out.println("Introduce lo que pagaste");
        
        Scanner b = new Scanner(System.in);
        
        pagado=b.nextFloat();
        
        descuento=100-((pagado/precio)*100);
        
        
        System.out.println("El portentaje descontado del producto es : "+descuento+"%.");
        
        
        
        
    }
    
}
