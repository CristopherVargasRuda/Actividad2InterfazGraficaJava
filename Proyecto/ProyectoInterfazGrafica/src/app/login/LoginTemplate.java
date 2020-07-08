
package app.login;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginTemplate extends JFrame{


    private JPanel pInferior, pSuperior;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario; 
    private JPasswordField tClaveUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkRecuerdame;
    private Color colorFondo, colorSpotify, colorVerde, colorAmarillo, colorRojo;
    
    public LoginTemplate() {
        super("Login Usuario");//Titulo de la app
        
        
        colorFondo = new Color(24, 26, 27);
        colorSpotify = new Color(25, 158, 72);
        colorVerde = new Color(0, 190, 92);
        colorAmarillo = new Color(255, 187, 49);
        colorRojo = new Color(255, 112, 87);
        
        //JPanel

        
        pSuperior=new JPanel();//Ejemplificación
        pSuperior.setBounds(0, 0, 1000, 79);//posición y tamaño a través del setBounds
        pSuperior.setBackground(colorFondo);//Color del fondo
        pSuperior.setLayout(null);//Anular el Layout: Diseño por defecto
        this.add(pSuperior);//Añadir a la clase / al JFrame
        
        pInferior=new JPanel();
        pInferior.setBounds(0, 80, 1000, 520);
        pInferior.setBackground(colorFondo);
        pInferior.setLayout(null);
        this.add(pInferior);
        
       //JLabel
       

       
        lTituloApp = new JLabel("Spotify");
        lTituloApp.setBounds(445, 10, 100, 50);
        lTituloApp.setForeground(Color.WHITE);//Color de la letra
        lTituloApp.setHorizontalAlignment(SwingConstants.CENTER);//Centrar Texto
        pSuperior.add(lTituloApp);//Añadir sobre el panel
        
        lEslogan = new JLabel("Música para todos");
        lEslogan.setSize(130, 20);//Tamaño
        lEslogan.setLocation((pInferior.getWidth() - lEslogan.getWidth()) / 2, 30);//ubicación
        lEslogan.setForeground(Color.WHITE);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lEslogan);

        lTituloLogin = new JLabel("Para continuar, incia sesión en spotify");
        lTituloLogin.setSize(250, 30);
        lTituloLogin.setLocation((pInferior.getWidth() - lTituloLogin.getWidth()) / 2, 70);
        lTituloLogin.setForeground(Color.WHITE);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Se te ha olvidado la contraseña?");
        lNotificaciones.setSize(250, 20);
        lNotificaciones.setLocation((pInferior.getWidth() - lNotificaciones.getWidth()) / 2, 365);
        lNotificaciones.setForeground(colorSpotify);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lNotificaciones);
        
        //jTextField
        

        tNombreUsuario = new JTextField("Dirección De Correo Nombre De Usuario");
        tNombreUsuario.setSize(400, 40);
        tNombreUsuario.setLocation((pInferior.getWidth() - tNombreUsuario.getWidth()) / 2, 130);
        tNombreUsuario.setForeground(Color.white);
        tNombreUsuario.setBackground(Color.DARK_GRAY);
        tNombreUsuario.setCaretColor(colorSpotify);//Color del caret(la linea que parpadea indicando la posición de texto para escribir)
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(tNombreUsuario);   
        
        //JPasswordField
        

        tClaveUsuario = new JPasswordField("clave Usuario");
        tClaveUsuario.setSize(400, 40);
        tClaveUsuario.setLocation((pInferior.getWidth() - tClaveUsuario.getWidth()) / 2, 195);
        tClaveUsuario.setForeground(Color.white);
        tClaveUsuario.setBackground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(colorSpotify);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(tClaveUsuario);
        
     

        //JButton
        

        
        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pInferior.getWidth() - bEntrar.getWidth()) / 2, 265);
        bEntrar.setBackground(colorSpotify);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setFocusable(false);//Quita el cuadro que bordea el texto del botón
        pInferior.add(bEntrar);
        
        bCerrar = new JButton();
        bCerrar.setSize(15, 15);
        bCerrar.setLocation(10, 10);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(colorRojo);
        bCerrar.setForeground(Color.WHITE);
        pSuperior.add(bCerrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(230, 420, 145, 35);
        bRegistrarse.setSize(145, 35);
        bRegistrarse.setLocation((pInferior.getWidth() - bRegistrarse.getWidth()) / 2, 410);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(colorSpotify);
        bRegistrarse.setForeground(Color.WHITE);
        pInferior.add(bRegistrarse);

        bOpcion1 = new JButton();
        bOpcion1.setBounds(10, 220, 30, 20);
        pSuperior.add(bOpcion1);

        bOpcion2 = new JButton();
        bOpcion2.setBounds(10, 250, 30, 20);
        pSuperior.add(bOpcion2);

        bOpcion3 = new JButton();
        bOpcion3.setBounds(10, 280, 30, 20);
        pSuperior.add(bOpcion3);
        
        //JCheckButton
        


        checkRecuerdame = new JCheckBox("Recuérdame");
        checkRecuerdame.setSize(200, 25);
        checkRecuerdame.setFocusable(false);
        checkRecuerdame.setBackground(colorFondo);
        checkRecuerdame.setForeground(colorSpotify);
        checkRecuerdame.setLocation((pInferior.getWidth() - checkRecuerdame.getWidth()) / 2+50, 315);
        pInferior.add(checkRecuerdame);

        //JFrame
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }
    
    
    
}
