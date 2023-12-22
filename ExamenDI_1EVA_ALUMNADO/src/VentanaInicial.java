import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaInicial extends JFrame  {
    private JLabel tipo;
    private JLabel numFilas;
    private JLabel numCol;
    private JButton botonSalir;
    private JButton botonMostrar;
    private JComboBox<Character> cuadroTipo;
    private JTextField cuadroFilas;
    private JTextField cuadroCol;
    private Boolean filas=false;
    private Boolean columnas=false;
    private Manejador1 manejador1;


    public JLabel getTipo() {
        return tipo;
    }

    public void setTipo(JLabel tipo) {
        this.tipo = tipo;
    }

    public JLabel getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(JLabel numFilas) {
        this.numFilas = numFilas;
    }

    public JLabel getNumCol() {
        return numCol;
    }

    public void setNumCol(JLabel numCol) {
        this.numCol = numCol;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        this.botonSalir = botonSalir;
    }

    public JButton getBotonMostrar() {
        return botonMostrar;
    }

    public void setBotonMostrar(JButton botonMostrar) {
        this.botonMostrar = botonMostrar;
    }

    public JComboBox<Character> getCuadroTipo() {
        return cuadroTipo;
    }

    public void setCuadroTipo(JComboBox<Character> cuadroTipo) {
        this.cuadroTipo = cuadroTipo;
    }


    public JTextField getCuadroFilas() {
        return cuadroFilas;
    }

    public void setCuadroFilas(JTextField cuadroFilas) {
        this.cuadroFilas = cuadroFilas;
    }

    public JTextField getCuadroCol() {
        return cuadroCol;
    }

    public void setCuadroCol(JTextField cuadroCol) {
        this.cuadroCol = cuadroCol;
    }

    public VentanaInicial() throws HeadlessException {
        initComponents ( );
    }

    public VentanaInicial(String title) throws HeadlessException {
        super (title);
        initComponents ( );
    }

    private void initComponents() {
        //Declaracion componentes de la ventana principal
        tipo = new JLabel ("Tipo");
        numFilas = new JLabel ("Filas");
        numCol = new JLabel ("Columnas");
        cuadroTipo=new JComboBox<Character> (  );
        botonSalir = new JButton ("Salir");
        botonMostrar = new JButton ("Mostrar");
        botonMostrar.setEnabled(false);

        //Inicializar la lista desplegable con los valores
        cuadroTipo.addItem ('T');
        cuadroTipo.addItem ('I');

        cuadroFilas = new JTextField (2);
        cuadroCol = new JTextField (2);




        //Añadir los componentes utilizando el layout más idóneo

        this.setLayout (new GridBagLayout ( ));
        GridBagConstraints gbc = new GridBagConstraints ( );
        add (tipo, createConstraints (0, 0, 1, 1, 0.2, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST, new Insets (0, 20, 5, 4)));
        add (cuadroTipo, createConstraints (1, 0, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, new Insets (0, 10, 5, 4)));
        add (numFilas, createConstraints (0, 1, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST, new Insets (0, 20, 5, 4)));
        add (cuadroFilas, createConstraints (1, 1, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, new Insets (0, 10, 5, 4)));
        add (numCol, createConstraints (0, 2, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST, new Insets (0, 10, 5, 4)));
        add (cuadroCol, createConstraints (1, 2, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, new Insets (0, 10, 5, 4)));

        add (botonSalir, createConstraints (0, 3, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, new Insets (0, 10, 5, 4)));
        add (botonMostrar, createConstraints (1, 3, 1, 1, 1.0, 1.0,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, new Insets (0, 10, 5, 4)));


        cuadroFilas.setToolTipText ("No puede ser mayor que 3");
        cuadroCol.setToolTipText ("No puede ser mayor que 3");



        manejador1=new Manejador1();
        manejador1.setVentanaInicial(this);

        botonSalir.addActionListener(manejador1);
        botonMostrar.addActionListener(manejador1);
        cuadroFilas.addFocusListener(manejador1);
        cuadroCol.addFocusListener(manejador1);







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
