import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Manejador1 implements ActionListener, FocusListener {

    VentanaInicial ventanaInicial;
    VentanaImagenes ventanaImagenes;
    PanelSur panelSur;
    Boolean filas=false;
    Boolean columnas=false;
    int i=0;
    Color color=Color.decode("#8db600");

    public void setI(int i) {
        this.i = i;
    }

    public void setVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    public void setVentanaImagenes(VentanaImagenes ventanaImagenes) {
        this.ventanaImagenes = ventanaImagenes;
    }

    public void setPanelSur(PanelSur panelSur) {
        this.panelSur = panelSur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ventanaInicial.getBotonSalir()){
            System.exit(0);
        }

        if(e.getSource()==ventanaInicial.getBotonMostrar()){
            VentanaImagenes ventanaImagenes=new VentanaImagenes (ventanaInicial,ventanaInicial.getCuadroTipo().getSelectedItem().toString(),ventanaInicial.getCuadroFilas().getText(),ventanaInicial.getCuadroCol().getText());

        }




    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

        if(e.getSource()==ventanaInicial.getCuadroCol()){

            try{
                if(Integer.parseInt(ventanaInicial.getCuadroCol().getText())>3 || Integer.parseInt(ventanaInicial.getCuadroCol().getText())<1){
                    JOptionPane.showMessageDialog(ventanaInicial.getCuadroCol(),"El numero de Columnas solo  puede ser 1,2,3","Error de Columnas",JOptionPane.ERROR_MESSAGE);
                    ventanaInicial.getCuadroCol().setText("");
                    ventanaInicial.getCuadroCol().requestFocus();

                }else{
                    columnas=true;
                    if(filas && columnas) ventanaInicial.getBotonMostrar().setEnabled(true);

                }
            }catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(ventanaInicial.getCuadroCol(),"Solo son validos numeros","Error de Columnas",JOptionPane.ERROR_MESSAGE);
                ventanaInicial.getCuadroCol().setText("");
                ventanaInicial.getCuadroCol().requestFocus();

            }
        }

        if(e.getSource()==ventanaInicial.getCuadroFilas()){
            try{
                if(Integer.parseInt(ventanaInicial.getCuadroFilas().getText())>3 || Integer.parseInt(ventanaInicial.getCuadroFilas().getText())<1){
                    JOptionPane.showMessageDialog(ventanaInicial.getCuadroFilas(),"El numero de filas solo  puede ser 1,2,3","Error de Filas",JOptionPane.ERROR_MESSAGE);
                    ventanaInicial.getCuadroFilas().setText("");
                    ventanaInicial.getCuadroFilas().requestFocus();
                }else{
                    filas=true;
                    if(filas && columnas) ventanaInicial.getBotonMostrar().setEnabled(true);

                }
            }catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(ventanaInicial.getCuadroFilas(),"Solo son validos numeros","Error de Filas",JOptionPane.ERROR_MESSAGE);
                ventanaInicial.getCuadroFilas().setText("");
                ventanaInicial.getCuadroFilas().requestFocus();

            }
        }



    }
}
