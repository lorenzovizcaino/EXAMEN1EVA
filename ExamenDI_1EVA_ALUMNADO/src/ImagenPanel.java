import javax.swing.*;
import java.awt.*;
//import java.awt.image.BaseMultiResolutionImage;

public class ImagenPanel extends JPanel {
    private Image imagen;
    private boolean anulado;

    public ImagenPanel() {
        this.anulado=false;
    }

    public ImagenPanel(Image imagen) {
        this.imagen = imagen;
        this.anulado=false;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;

    }
    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public void paintComponent(Graphics g) {
		/* Obtenemos el tamaño del panel para hacer que se ajuste a este
		cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
        int width = this.getSize().width;
        int height = this.getSize().height;

        // Mandamos que pinte la imagen en el panel
        if (this.getImagen () != null) {

            g.drawImage(this.imagen, 0, 0, width, height, null);

        }

    }

    public void setBackground(String imagePath) {

        this.setOpaque(false);
        this.imagen = new ImageIcon(imagePath).getImage();
        repaint();
    }
}
