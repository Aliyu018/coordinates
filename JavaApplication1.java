
package javaapplication1;

import javax.swing.JOptionPane;


public class JavaApplication1 {

    
    public static void main(String[] args) {
       Point P1 =new Point(2,3);
       Point P2 =new Point(-3,1);
       Point P3 =new Point(-1.5,-2.5);
       Point P4 =new Point(0,0);
       P4.Location();
       
       //JOptionPane.showMessageDialog(null,"P3----> " + P3.DisToOrigin()); 
       JOptionPane.showMessageDialog(null,"P2----> " + P2.DisToOrigin()); 
       //JOptionPane.showMessageDialog(null,"Distance between P2 and P3 is" + P2.Distance(P3));
       
       // P3.Display();
        //P2.Sety(20);
        //JOptionPane.showMessageDialog(null,"x of P3 is " + P3.Getx());
    }
    
}
