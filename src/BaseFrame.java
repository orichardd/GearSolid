import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class BaseFrame extends JFrame {
    public BaseFrame(String title, int width, int height, Color bgColor) {
        super(title);

        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(bgColor);

        //adicionar ícone
        URL url = getClass().getResource("/icon/gearIcon.png");
        if (url == null) {
            System.err.println("ERRO: Ícone não encontrado no .jar!");
        } else {
            ImageIcon icon = new ImageIcon(url);
            setIconImage(icon.getImage());
        }
    }

    public void adicionarComponente(JComponent componente, int x, int y, int largura, int altura) {
        componente.setBounds(x, y, largura, altura);


        if (componente instanceof JButton) {
            JButton botao = (JButton) componente;
            botao.setBackground(Color.BLACK);
            botao.setOpaque(true);
            botao.setCursor(new Cursor(Cursor.HAND_CURSOR));

            botao.setFont(new Font("Arial", Font.BOLD, 15));
            botao.setForeground(Color.WHITE);
            botao.setBorderPainted(false);

            botao.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 1, false));
        }
        else if (componente instanceof JSlider) {
            JSlider slider = (JSlider) componente;
            slider.setPaintTicks(false);       // nao desenha as marcas
            slider.setPaintLabels(false);      // nao mostra os números
            slider.setMajorTickSpacing(100);   // marca maior a cada 100
            slider.setMinorTickSpacing(10);    // marca menor a cada 10
            slider.setOpaque(false);
        }
        else if(componente instanceof JLabel){
            Font infoFont = new Font("Arial", Font.BOLD, 14);
            ((JLabel) componente).setFont(infoFont);
        }

        add(componente);
    }
}
