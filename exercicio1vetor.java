
import javax.swing.JOptionPane;


public class exercicio1 {
    public static void main(String[] args) {
        int[] num = new int[15];
        for (int i = 0; i < 15; i++) {
             num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"° numero:"));
        }
        for (int i = 0; i < 15; i++) {
            if((i%2)==0){
             JOptionPane.showMessageDialog(null, "o "+i+"° nome é: "+num[i]);
            }
        }
    }
}
