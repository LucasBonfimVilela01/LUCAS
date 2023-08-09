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
public class exercicio1 {
    public static void main(String[] args) {
        int ano = 0, mes = 0, dia = 0, idadedia = 0;
        ano = Integer.parseInt(JOptionPane.showInputDialog("quantos anos você tem?"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("quantos meses se passaram desde o seu último aniversário?"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("quantos dias desde o último mês"));
        idadedia = (ano * 365) + (mes * 30) + dia;
        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " +idadedia+"dias");
        
    }
}
