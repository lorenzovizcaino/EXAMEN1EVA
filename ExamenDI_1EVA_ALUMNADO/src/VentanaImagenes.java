import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class VentanaImagenes extends Dialog {

    private JPanel panelCentral;
    private PanelSur panelSur;
    protected String ruta="";
    private CeldaImagen celdaImagen;

    protected AnuladoBoton[] anularBotones;

    protected ImagenPanel[] imagenesPaneles;

    private  GridBagConstraints gbc=new GridBagConstraints();
    protected int contadorFalses=0;
    protected int cuadros=0;
    Color color=Color.decode("#8db600");
    Manejador3 manejador3;
    private String filas;
    private String columnas;
    private String genero;

    public ImagenPanel[] getImagenesPaneles() {
        return imagenesPaneles;
    }

    public AnuladoBoton[] getAnularBotones() {
        return anularBotones;
    }

    public VentanaImagenes(Frame owner) {
        super (owner);

        initComponents ();

    }

    public VentanaImagenes(VentanaInicial owner, String genero, String filas, String columnas) {
        super(owner);
        this.genero=genero;
        this.filas=filas;
        this.columnas=columnas;

        initComponents ();




    }


    //Metodo para construir la ventana de imagenes
    public void initComponents() {



        panelCentral=new JPanel();

        panelCentral.setLayout(new GridLayout(Integer.parseInt(filas),Integer.parseInt(columnas)));
        cuadros=Integer.parseInt(filas)*Integer.parseInt(columnas);
        anularBotones=new AnuladoBoton[cuadros];
        imagenesPaneles=new ImagenPanel[cuadros];



        if(genero.equals("T")){


            ruta="images"+File.separator+"terror"+File.separator;


        }else{
            ruta="images"+File.separator+"infantil"+File.separator;


        }

        for(int i=0;i<cuadros;i++){
            anularBotones[i]=new AnuladoBoton("Anular");
            imagenesPaneles[i]=new ImagenPanel();
            imagenesPaneles[i].setBackground(ruta+i+".jpg");
            imagenesPaneles[i].setAnulado(true);

            celdaImagen=new CeldaImagen(imagenesPaneles[i],anularBotones[i]);
            panelCentral.add(celdaImagen);


            manejador3=new Manejador3(this,i);


            anularBotones[i].addActionListener(manejador3);




        }
        add(panelCentral,BorderLayout.CENTER);


        panelSur=new PanelSur(this);

        add(panelSur,BorderLayout.SOUTH);


        setSize (800, 800);
        setPreferredSize (new Dimension (800, 1000));
        setVisible (true);


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