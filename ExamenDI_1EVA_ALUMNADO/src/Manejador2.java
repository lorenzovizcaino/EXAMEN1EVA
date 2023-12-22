import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador2 implements ActionListener {
    private PanelSur panelSur;
    private VentanaImagenes ventanaImagenes;


    public Manejador2(PanelSur panelSur, VentanaImagenes ventanaImagenes) {
        this.panelSur = panelSur;
        this.ventanaImagenes = ventanaImagenes;

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==panelSur.getBotonAceptar()){
            panelSur.uno.setVisible(false);
            panelSur.dos.setVisible(true);
            panelSur.tres.setCuadros(ventanaImagenes.cuadros);
            panelSur.tres.setContadorFalses(ventanaImagenes.contadorFalses);
            panelSur.tres.repaint();
        }

        if(e.getSource()==panelSur.getBotonAceptar2()){
            panelSur.dos.setVisible(false);
            panelSur.uno.setVisible(true);
        }
    }
}
