import javax.swing.*;
import java.awt.*;

public class MiPanel extends JPanel {

    int contadorFalses;
    int cuadros;

    public MiPanel() {
        contadorFalses=0;
        cuadros=0;
    }

    public void setContadorFalses(int contadorFalses) {
        this.contadorFalses = contadorFalses;
    }



    public void setCuadros(int cuadros) {
        this.cuadros = cuadros;
    }

    @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            setFont(new Font("Arial",Font.BOLD,20));
            g.setColor(Color.RED);
            g.drawString("Imagenes anuladas..." + contadorFalses,30,30);

            g.setColor(Color.ORANGE);
            g.drawString("Imagenes visibles..."+(cuadros-contadorFalses),30,70);



        }
    }

