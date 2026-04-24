package joplanejadorviagem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;

public class JOplanejadorViagem {

    private static String entrada;

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        
        JOptionPane.showConfirmDialog(null, "===MENU===");      
        
        String opcao = JOptionPane.showInputDialog("1 - Planejar viagem \n2 - Sair");

        if (opcao.equals("1")) {
            

        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        String data = JOptionPane.showInputDialog("Digite a data (dd/mm/yyyy)");

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate entrada = LocalDate.parse(data, formato);

            //JOptionPane.showMessageDialog(null, "Data digitada: " + entrada);
            
            } else if (opcao.equals("2")) {
                JOptionPane.showConfirmDialog(null,"saiu do programa");           
        } else {
            
            }
        
        JOptionPane.showMessageDialog(null, "Data digitada: " + entrada);
    }
}
