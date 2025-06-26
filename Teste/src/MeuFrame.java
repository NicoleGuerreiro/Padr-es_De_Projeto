import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MeuFrame extends JFrame implements ActionListener {

        JButton botao;
        JButton botao2;
        JTextPane bloco_texto;
        JLabel texto;
        int contador;

        MeuFrame(){
            this.contador = 0;
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            //this.setBounds(500,200,300,300);
            this.setSize(400,300);
            this.setTitle("Programa do sucesso!");

            this.setLayout(new FlowLayout());

            this.botao = new JButton("Incrementar");
            this.botao2 = new JButton("Sair");
            this.texto = new JLabel("Vamos viver essa loucura!");
            this.bloco_texto = new JTextPane();
            this.bloco_texto.setSize(200, 500);
            bloco_texto.setEditable(false);

            botao.addActionListener(this);
            botao2.addActionListener(this);

            this.add(bloco_texto);
            this.add(botao);
            this.add(botao2);
            this.add(texto);

            bloco_texto.setLocation(100,50);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getActionCommand() == botao.getActionCommand()){
                this.contador++;
                this.texto.setText("Contagem: "+this.contador);
                return;
            }

            if(e.getActionCommand() == botao2.getActionCommand())
                this.bloco_texto.setText("Sucesso, "+botao.getActionCommand());




    }
}

