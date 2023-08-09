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
public class exercicio6 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("informe um número para saber seu antecessor e seu sucessor"));
        JOptionPane.showMessageDialog(null, "o antecessor é: "+(numero-1));
        JOptionPane.showMessageDialog(null, "o Sucessor é: "+(numero+1));
    }
}
