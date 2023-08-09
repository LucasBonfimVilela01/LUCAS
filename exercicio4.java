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
public class exercicio4 {
    public static void main(String[] args) {
        double IPI, valor1, valor2, result;
        int cod1=1, cod2=2, quant1, quant2;
        IPI = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do IPI a ser acresentado: "));
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto de código "+cod1+":"));
        quant1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto de código "+cod1+":"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto de código "+cod2+":"));
        quant2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto de código "+cod1+":"));
        result = (valor1*quant1 + valor2*quant2)*(IPI/100+1);
        JOptionPane.showMessageDialog(null, "O valor total a ser pago é: R$"+result);
        
    }
}
