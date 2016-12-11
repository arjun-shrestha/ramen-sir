import javax.swing.*;
import java.awt.*;

class BagLayoutDemo extends JFrame
{
 JButton b1,b2,b3,b4,b5;
BagLayoutDemo()
 {
   setSize(500,400);
   setTitle("borderlayout program");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new GridBagLayout());
   GridBagConstraints gbc=new  GridBagConstraints();
   gbc.ipadx=gbc.ipady=0;
   gbc.gridwidth=gbc.gridheight=1;
   gbc.fill=GridBagConstraints.BOTH;
   gbc.weightx=0;
   gbc.weighty=0;
   gbc.anchor=GridBagConstraints.CENTER;
   
   b1=new JButton("Button1");
   gbc.gridx=gbc.gridy=0;
   add(b1,gbc);
   b2=new JButton("Button2");
   gbc.gridx=1;
   gbc.gridy=0;
   add(b2,gbc);
   b3=new JButton("Button3");
   gbc.gridx=2;
   gbc.gridy=0;
   add(b3,gbc);   
   b4=new JButton("Button4");
   gbc.gridx=0;
   gbc.gridy=1;
   gbc.gridwidth=3;
   gbc.ipady=40;
   add(b4,gbc);
   b5=new JButton("Button5");
   gbc.gridx=0;
   gbc.gridy=2;
   gbc.gridwidth=3;
   gbc.ipady=40;
   add(b5,gbc);
   
   setVisible(true);
 }
 public static void main(String a[])
 {
   new BagLayoutDemo();
 }
}