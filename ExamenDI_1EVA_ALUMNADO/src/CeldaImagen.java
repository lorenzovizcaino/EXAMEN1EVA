import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class CeldaImagen extends JPanel{
    private ImagenPanel imagenPanel;
    private AnuladoBoton anuladoBoton;

    public CeldaImagen() {

        imagenPanel=new ImagenPanel ();
        anuladoBoton=new AnuladoBoton ("Anular");
        setBorder(javax.swing.BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        initComponents();
    }

    public CeldaImagen(ImagenPanel imagenPanel, AnuladoBoton anuladoBoton) {
        this.imagenPanel = imagenPanel;
        this.anuladoBoton = anuladoBoton;
        setBorder(javax.swing.BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        initComponents();
    }

    public ImagenPanel getImagenPanel() {
        return imagenPanel;
    }

    public void setImagenPanel(ImagenPanel imagenPanel) {
        this.imagenPanel = imagenPanel;
    }

    public AnuladoBoton getAnuladoBoton() {
        return anuladoBoton;
    }

    public void setAnuladoBoton(AnuladoBoton anuladoBoton) {
        this.anuladoBoton = anuladoBoton;
    }

   public void initComponents(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        add(imagenPanel,createConstraints(0,0,1,1,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(1,4,0,4)));
        add(anuladoBoton,createConstraints(0,1,1,1,1.0,1.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(1,4,0,4)));


   }
    private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight,
                                                        double weightx, double weighty, int fill, int anchor, Insets insets) {
        GridBagConstraints constraints = new GridBagConstraints();
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
