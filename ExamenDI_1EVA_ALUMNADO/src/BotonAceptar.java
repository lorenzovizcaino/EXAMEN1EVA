import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class BotonAceptar extends JButton {




    BotonAceptar(){

            setBorder(javax.swing.BorderFactory.createBevelBorder(BevelBorder.RAISED));

            setBackground(Color.decode("#8db600"));

            setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,24));
            setAlignmentX(CENTER_ALIGNMENT);
            setMinimumSize(new Dimension(20,20));
            setMaximumSize(new Dimension(150,60));
            setPreferredSize(new Dimension(120,30));

        }
    BotonAceptar(String texto){
            super(texto);
            setBorder(javax.swing.BorderFactory.createBevelBorder(BevelBorder.RAISED));
            setBackground(Color.decode("#3B83BD"));
            setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,24));
            setAlignmentX(CENTER_ALIGNMENT);
            setMinimumSize(new Dimension(20,20));
            setMaximumSize(new Dimension(150,60));
            setPreferredSize(new Dimension(120,30));


        }

}
