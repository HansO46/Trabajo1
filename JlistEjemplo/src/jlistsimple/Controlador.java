
package jlistsimple;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador implements ListSelectionListener{
Vista v;
    public Controlador(){
        v=new Vista();
        v.setVisible(true);
        v.Vehiculo.addListSelectionListener(this);
        
        
    }
    
    
    @Override
    public void valueChanged(ListSelectionEvent lse) {
        
        String ruta;
        ruta=" La ruta mas eficas para viajar a europa es:"+v.Vehiculo.getSelectedValue().toString();
        v.rs.setText(ruta);
        
        
        
        
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
}
