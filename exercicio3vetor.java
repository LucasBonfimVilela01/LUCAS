
import javax.swing.JOptionPane;


public class exercicio3 {
    public static void main(String[] args) {
        String[] nomes = new String[8];
        double[] meds = new double[8];
        double n1, n2;
        for (int i = 0; i < 8; i++) {
             nomes[i] = JOptionPane.showInputDialog("Digite o "+(i+1)+"° nome:");
        }
        for (int i = 0; i < 8; i++) {
             n1 =  Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota de: "+nomes[i]));
             n2 =  Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota de: "+nomes[i]));
             meds[i] = (n1+n2)/2;
        }
        for (int i = 0; i < 8; i++){        
            System.out.println("Aluno: "+nomes[i]+" média: "+meds[i]);
            
        }
    }
}
