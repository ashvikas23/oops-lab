import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class largest extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3,t4;
JButton b1;

public largest()
{
setLayout(new FlowLayout());

l1=new JLabel("First no.");
l2=new JLabel("Second no.");
l3=new JLabel("Third no.");
l4=new JLabel("Largest no.");

t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);
t4=new JTextField(10);

b1=new JButton("Compare");

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(b1);

b1.addActionListener(this);

setSize(200,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
int large;
int x=Integer.parseInt(t1.getText());
int y=Integer.parseInt(t2.getText());
int z=Integer.parseInt(t3.getText());

if((x>y)&&(x>z))
{
large=x;
}
else if((y>x)&&(y>z))
{
large=y;
}
else
{
large=z;
}

t4.setText(String.valueOf(large));
}

public static void main(String args[])
{
new largest();
}
}
