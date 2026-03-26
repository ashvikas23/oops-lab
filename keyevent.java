import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="keyevent" width="400" height="200">
</applet>
*/
public class keyevent extends Applet implements KeyListener {
String msg = "Typed:";
int x = 30, y = 50;
public void init() {
addKeyListener(this);
requestFocus();
}
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}
public void keyReleased(KeyEvent ke) {
showStatus("Key Up");
}
public void keyPressed(KeyEvent ke) {
showStatus("Key Down");
}
public void paint(Graphics g) {
g.drawString(msg, x, y);
}
}
