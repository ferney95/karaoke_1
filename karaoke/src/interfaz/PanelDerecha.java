package interfaz;


public class PanelDerecha()extends JPanel{
  
    private JLabel  jlAnimacion, jlDescripcion;
    
    
    public PanelDerech(){
    
    jlAnimacion = new JLabel();
    jlAnimacion.setSize(450,700);
    add(jlAnimacion);
    
    jlDescripcion = new JLabel();
    jlDescripcion.setSize(150,700);
    add(jlDescripcion);
    }



}
