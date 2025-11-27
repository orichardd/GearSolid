import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Creditos extends BaseFrame{
    public Creditos(){
        super("Créditos", 500, 200, Color.WHITE);
        JTextArea creditosLabel = new JTextArea(
                "Desenvolvido por Richard Almeida\n" + "novembro de 2025 \n" + "\n" + "Para a disciplina Projeto Integrador \n" + "IFRS - Campus Rolante"
        );
        creditosLabel.setEditable(false);
        creditosLabel.setFont(new Font("Arial", Font.BOLD, 15));

        URL img = getClass().getResource("/icon/credits100.png");
        ImageIcon icon = new ImageIcon(img);
        JLabel imgLabel = new JLabel(icon);
        add(imgLabel);
        imgLabel.setOpaque(true);
        imgLabel.setBackground(Color.BLACK);
        imgLabel.setBounds(30, 25, 100, 100);

        adicionarComponente(creditosLabel, 140, 25, 450, 300);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
