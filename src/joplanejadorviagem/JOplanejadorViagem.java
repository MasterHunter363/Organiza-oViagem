package joplanejadorviagem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class JOplanejadorViagem {

    public static void main(String[] args) {
        planejador();

    }

    public static void planejador() {

        JOptionPane.showConfirmDialog(null, "Planejar viagem");

        JOptionPane.showInputDialog("Digite seu nome:");

        String data =JOptionPane.showInputDialog("digite data: ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        LocalDate localDate       = LocalDate.parse("2018-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        JOptionPane.showConfirmDialog(null, localDate);

//        LocalDate d = LocalDate.of(2026, 2, 25);
        
    }

}
