import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*
<applet code="bcd" width="400" height="250"></applet>
*/
public class bcd extends Applet implements MouseListener, MouseMotionListener
{
int mx=0;
int my=0;
String msg="";

public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me)
{
mx=200;
my=40;
msg="Mouse Clicked";
repaint();
}

public void mousePressed(MouseEvent me)
{
mx=30;
my=30;
msg="Mouse Pressed";
repaint();
}

public void mouseReleased(MouseEvent me)
{
mx=50;
my=60;
msg="Mouse Released";
repaint();
}

public void mouseEntered(MouseEvent me)
{
mx=0;
my=40;
msg="Mouse Entered";
repaint();
}

public void mouseExited(MouseEvent me)
{
mx=60;
my=80;
msg="Mouse Exited";
repaint();
}

public void mouseDragged(MouseEvent me)
{
mx=me.getX();
my=me.getY();
msg="";
repaint();
}

public void mouseMoved(MouseEvent me)
{
mx=me.getX();
my=me.getY();
showStatus("currently mouse at "+mx+" and "+my);
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,60,40);
g.drawString("Mouse Events",30,20);
}
}
