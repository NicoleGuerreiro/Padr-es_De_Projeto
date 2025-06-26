import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPokemon extends JFrame implements ActionListener {
    JPanel painel;
    JTextPane texto;
    JButton botao1;
    JButton botao2;
    JButton botao3;
    scroll_pane = new JScrollPane(texto);

    JanelaPokemon() {
        painel = new JPanel();
        texto = new JTextPane();
        botao1 = new JButton("Equipe");
        botao2 = new JButton("Curar Equipe");
        botao3 = new JButton("PC");
        scroll_pane();

        painel.setLayout(new FlowLayout());
        painel.add(texto);
        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);

        this.add(painel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaPokemon();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
