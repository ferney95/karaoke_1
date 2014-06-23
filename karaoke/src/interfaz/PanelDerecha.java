package interfaz;


public class PanelDerecha()extends JPanel{
  
    private JLabel  jlAnimacion, jlDescripcion;
    
    
    public PanelDerecha(){
      setSize(600,700);
    
    jlAnimacion = new JLabel();
    jlAnimacion.setSize(450,700);
    setBackground(Color.RED);
    add(jlAnimacion);
    
    jlDescripcion = new JLabel();
    jlDescripcion.setSize(150,700);
    setBackground(Color.BLUE);
    add(jlDescripcion);
    }



}
