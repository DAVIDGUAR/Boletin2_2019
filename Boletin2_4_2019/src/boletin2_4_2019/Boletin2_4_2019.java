/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin2_4_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int b100, b20 = 0, b5 = 0, m1 = 0, total, resto;

        total = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de €"));

        b100 = total / 100;
        resto = total % 100;
        if (resto != 0) {

            b20 = resto / 20;
            resto = resto % 20;

        }
        if (resto != 0) {

            b5 = resto / 5;
            resto = resto % 5;

        }
        if (resto != 0) {

            m1 = resto / 1;

        }

        System.out.println("El cambio seria :\nBilletes de 100= " + b100 + "\nBilletes de 20= " + b20 + "\nBilletes de 5= " + b5 + "\nMonedas de euro= " + m1);

    }
}
