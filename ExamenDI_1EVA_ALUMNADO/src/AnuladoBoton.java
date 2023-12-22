import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class AnuladoBoton extends JButton  {
    private int pos;
    private Color color;



    AnuladoBoton(){

        setBorder(javax.swing.BorderFactory.createBevelBorder(BevelBorder.RAISED));
        color=Color.decode("#8db600");
        setBackground(color);
        setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,16));
        setAlignmentX(CENTER_ALIGNMENT);
        setMinimumSize(new Dimension(20,20));
        setMaximumSize(new Dimension(150,60));
        setPreferredSize(new Dimension(120,30));

    }
    AnuladoBoton(String texto){
        super(texto);
        color=Color.decode("#8db600");
        setBorder(javax.swing.BorderFactory.createBevelBorder(BevelBorder.RAISED));
        setBackground(color);
        setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,16));
        setAlignmentX(CENTER_ALIGNMENT);
        setMinimumSize(new Dimension(20,20));
        setMaximumSize(new Dimension(150,60));
        setPreferredSize(new Dimension(120,30));


    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}



