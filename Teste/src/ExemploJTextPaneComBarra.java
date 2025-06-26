import javax.swing.*;
import java.awt.*;

public class ExemploJTextPaneComBarra {

    public static void main(Striing[] args) {
        frame.setSize(300, 200);

        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/plain"); //defina o tipo de conteúdo
        String texto = "teste";
        textPane.setText(texto);

        JScrollPane scrollPane = new JScrollPane(textPane);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);


    }
}
