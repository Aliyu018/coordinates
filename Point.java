
package javaapplication1;

import javax.swing.JOptionPane;

public class Point {
    private double x;
    private double y;
    public Point(){x=0;y=0;}
    public Point(double a,double b){x=a;y=b;}
    public Point (int useless)
    {   
        x=Double.parseDouble(JOptionPane.showInputDialog("Enter x"));
        y=Double.parseDouble(JOptionPane.showInputDialog("Enter y"));
        
    }
    public void Display()
    {
    JOptionPane.showMessageDialog(null,"x = " +x+"y="+y);
 
    }
    public void Setx(double a){x=a;}
    public void Sety(double a){y=a;}
    public double Getx(){return x;}
    public double Gety(){return y;}
    public double DisToOrigin()
    {
     return Math.sqrt(x*x+y*y);
    }
    public double Distance(Point SecondObj)
    {
       return Math.sqrt(Math.pow(x-SecondObj.x,2) + Math.pow(y - SecondObj.y,2));
    }
     public void Location()
     {
         if (x>0 && y >0)JOptionPane.showMessageDialog(null, "quadrant 1");
         else if (x<0 && y >0)JOptionPane.showMessageDialog(null, "quadrant 2");
         else if (x<0 && y <0)JOptionPane.showMessageDialog(null, "quadrant 3");
         else if (x>0 && y <0)JOptionPane.showMessageDialog(null, "quadrant 4");
         else if (x==0 && y >0)JOptionPane.showMessageDialog(null, "on y+");
         else if (x==0 && y <0)JOptionPane.showMessageDialog(null, "on y-");
         else if (x>0 && y == 0)JOptionPane.showMessageDialog(null, "on x+");
         else if (x<0 && y == 0)JOptionPane.showMessageDialog(null, "on x-");
         else JOptionPane.showMessageDialog(null, "they are at origin");
     
     }
    }

