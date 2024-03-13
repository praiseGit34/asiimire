package Practice;

import javax.swing.JOptionPane;
public class Gui {
    public static void main (String args []){
        String name=JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null ,"hello"+name);
        JOptionPane.showInputDialog(null,"enter what you need  "+name);
        int age =Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        if(age>=18){
            JOptionPane.showMessageDialog(null,"you are eligible");
        }
        else{
            if(age<18){
                JOptionPane.showMessageDialog(null,"you are not eligible");   
            }
        }
        
    }
    
}
