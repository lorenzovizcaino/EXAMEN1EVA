import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador3 implements ActionListener {

    private VentanaImagenes ventanaImagenes;
    private int i;
    Color color=Color.decode("#8db600");

    public Manejador3(VentanaImagenes ventanaImagenes, int i) {
        this.ventanaImagenes = ventanaImagenes;
        this.i = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource ( ) instanceof  AnuladoBoton){
            AnuladoBoton boton=(AnuladoBoton) e.getSource();
            if(boton.getActionCommand()=="Anular"){
                boton.setText("Mostrar");
                boton.setBackground(Color.PINK);
                ventanaImagenes.imagenesPaneles[i].setBackground(ventanaImagenes.ruta+"anulado.png");
                ventanaImagenes.imagenesPaneles[i].setAnulado(false);
                ventanaImagenes.contadorFalses++;
            }else{
                boton.setText("Anular");

                boton.setBackground(color);
                ventanaImagenes.imagenesPaneles[i].setBackground(ventanaImagenes.ruta+i+".jpg");
                ventanaImagenes.imagenesPaneles[i].setAnulado(true);
                ventanaImagenes.contadorFalses--;
            }

        }
    }
}
