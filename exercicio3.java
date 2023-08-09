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

public class exercicio3 {
    public static void main(String[] args) {
        double saldo, Resaldo;
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu saldo: "));
        Resaldo = (saldo * 0.01) + saldo;
        JOptionPane.showMessageDialog(null, "Seu saldo com reajuste de 1% é: R$"+Resaldo);
    }
}
