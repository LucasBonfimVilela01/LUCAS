
import javax.swing.JOptionPane;


public class exercicio2 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String[] itens = new String[10];
        String[] itens2 = new String[10];
        
        for (int i = 0; i < 10; i++) {
             itens[i] = JOptionPane.showInputDialog("Digite o "+(i+1)+"° item:");
        }
        int b=0;
        for (int i = 9; i >= 0; i--) {   
             itens2[i] = itens[b];
             b++;
    }
        for (int i = 0; i < 10; i++){        
            System.out.println("o "+(i+1)+"° item da sequência 1 é: "+itens[i]);
        }
        for (int i = 0; i < 10; i++){        
            System.out.println("o "+(i+1)+"° item da sequência 2 é: "+itens2[i]);
        }
    }
}