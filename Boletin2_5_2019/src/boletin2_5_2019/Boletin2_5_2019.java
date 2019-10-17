/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin2_5_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double sueldo, kilometraje, ventas, dietas, sueldoBruto, sueldoLiquidoDescuento, sueldoLiquido;

        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce sueldo"));

        ventas = Double.parseDouble(JOptionPane.showInputDialog("Introduce ventas"));

        kilometraje = Double.parseDouble(JOptionPane.showInputDialog("Introduce kilometros "));

        dietas = Double.parseDouble(JOptionPane.showInputDialog("Introduce dietas"));

        sueldoBruto = sueldo + ((ventas * 5) / 100) + (kilometraje * 2) + (dietas * 30);

        sueldoLiquidoDescuento = ((sueldoBruto * 0.18) + 36);

        sueldoLiquido = sueldoBruto - sueldoLiquidoDescuento;

        System.out.println("Sueldo Bruto = " + sueldoBruto + "\nSueldo Liquido Descuento = " + sueldoLiquidoDescuento + "\nSueldo Liquido = " + sueldoLiquido);

    }

}
