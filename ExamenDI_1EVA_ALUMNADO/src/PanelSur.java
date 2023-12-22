import javax.swing.*;
import java.awt.*;

class PanelMostrar extends JPanel{

    public PanelMostrar() {
        setMinimumSize(new Dimension(100,100));
        setMaximumSize(new Dimension(300,200));
        setPreferredSize(new Dimension(300,200));
    }


}
public class PanelSur extends JPanel {

    private BotonAceptar botonAceptar;
    private PanelMostrar panelMostrar;
    protected JPanel uno,dos;
    protected MiPanel tres;
    private JLabel LImagenAnulada, LImagenVisible;
    private JTextField TImagenAnulada, TImagenVisible;
    private JButton botonAceptar2;
    private VentanaImagenes ventanaImagenes;
    private Manejador1 manejador1;
    private Manejador2 manejador2;

    public BotonAceptar getBotonAceptar() {
        return botonAceptar;
    }

    public JButton getBotonAceptar2() {
        return botonAceptar2;
    }

    //Constructor
    public PanelSur(VentanaImagenes ventanaImagenes) {
        setMinimumSize(new Dimension(200,100));
        setMaximumSize(new Dimension(400,200));
        setPreferredSize(new Dimension(400,200));
        this.ventanaImagenes=ventanaImagenes;
        setLayout(new GridBagLayout());
        uno=new JPanel(new GridBagLayout());
        botonAceptar=new BotonAceptar("Aceptar");
        uno.add(botonAceptar,createConstraints(0,0,1,1,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(uno,createConstraints(0,0,1,1,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));


        dos=new JPanel(new GridBagLayout());
        tres=new MiPanel();
        botonAceptar2=new BotonAceptar("Aceptar");

       dos.add(tres,createConstraints(0,0,3,2,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        dos.add(botonAceptar2,createConstraints(4,0,1,2,1.0,1.0,GridBagConstraints.VERTICAL,GridBagConstraints.EAST,new Insets(5,5,5,5)));
        add(dos,createConstraints(0,0,1,1,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        dos.setVisible(false);

        manejador2=new Manejador2(this,ventanaImagenes);

        botonAceptar.addActionListener(manejador2);
        botonAceptar2.addActionListener(manejador2);






    }



    //Método para colocar los componentes utilizando el GridBagLayout
    private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
                                                        double weightx, double weighty, int fill, int anchor, Insets insets) {
        GridBagConstraints constraints = new GridBagConstraints ( );
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = fill;
        constraints.anchor = anchor;
        constraints.insets = insets;
        return constraints;
    }



}
