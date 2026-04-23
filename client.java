import java.io.*;
import java.net.*;
public class client {
public static void main(String[] args) {
try
{
Socket socket = new Socket("localhost", 7011);
DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
dout.writeUTF("client call");
dout.flush();
dout.close();
socket.close();
}
catch(Exception e) {
System.out.println(e);
}
}
}
