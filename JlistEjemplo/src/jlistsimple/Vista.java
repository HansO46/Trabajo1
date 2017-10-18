
package jlistsimple;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Vista extends JFrame{
    JList Vehiculo;
    JLabel rs;
    
    
    public Vista(){
        this.setTitle("Simple");
        this.setSize(300,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        Object[] x=new Object[3];
        x[0]="Carro";
        x[1]="Avion";
        x[2]="Tren";
        
        
        Vehiculo=new JList(x);
        this.getContentPane().add(Vehiculo,new AbsoluteConstraints(20,20,50,70));
        rs=new JLabel();
        this.getContentPane().add(rs,new AbsoluteConstraints(20,100,300,300));
        
        
        
        
        
        
    }
  
    
    
    
}
