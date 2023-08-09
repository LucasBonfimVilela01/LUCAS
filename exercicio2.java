/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joption_09_08;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane; 
public class exercicio2 {
    public static void main(String[] args) {
       int med1, med2, somamed, Medmed; 
       med1 = (8 + 9 + 7)/3;
       med2 = (4 + 5 + 6)/3;
       somamed = med1 + med2;
       Medmed = (med1 + med2)/2;
       JOptionPane.showMessageDialog(null, "A média dos números 9, 8 e 7 é: "+med1);
       JOptionPane.showMessageDialog(null, "A média dos números 6, 5 e 4 é: "+med2);
       JOptionPane.showMessageDialog(null, "A soma das médias é: "+somamed);
       JOptionPane.showMessageDialog(null, "A média das médias é: "+Medmed);
    }
}
