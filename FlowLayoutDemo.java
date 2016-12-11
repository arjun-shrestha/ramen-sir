import javax.swing.*;
import java.awt.*;

class FlowLayoutDemo extends JFrame
{
 JButton b1,b2,b3,b4,b5,b6;
 FlowLayoutDemo()
 {
   setSize(500,200);
   setTitle("layout program");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new FlowLayout(FlowLayout.CENTER));

 //  b1=new JButton("Button1");
// b2=new JButton("Button2");
 //  b3=new JButton("Button3");
  // b4=new JButton("Button4");
   b5=new JButton("Button5");
  // b6=new JButton("Button6");
   //add(b1);
   //add(b2);
  // add(b3);
  // add(b4);
   add(b5);
  // add(b6);
   setVisible(true);
 }
 public static void main(String[] args)
 {
   new FlowLayoutDemo();
 }
}