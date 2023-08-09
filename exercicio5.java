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
public class exercicio5 {
    public static void main(String[] args) {
        double saluser, quantsalmin, salmin=1000;
        saluser = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário: "));
        quantsalmin = saluser/salmin;
        JOptionPane.showMessageDialog(null, "Seu salário é correspondende a "+quantsalmin+" vezes o salário minímo");
        
    }
}
