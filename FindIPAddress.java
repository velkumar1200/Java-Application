import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindIPAddress extends Frame implements ActionListener {
TextField tf; Label l; Button b;
    Label l1 = new Label();
private Toolkit t;
private Dimension s;
    FindIPAddress(){
        Frame f = new Frame("Find IP Address");
        t = getToolkit();
        s = t.getScreenSize();
        l=new Label("Enter Host");
        l.setBounds(50,50, 250,20);
        l1.setBounds(50,100, 250,20);
        tf=new TextField();
        tf.setBounds(50,75, 150,20);
        b=new Button("Find IP");
        b.setBounds(50,150,60,30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.add(l);
        f.add(l1);
        f.setSize(400,400);
        f.setLocation(s.width/2-getWidth()/2,s.height/2-getHeight()/2);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try{
            String host=tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            l1.setText("IP of "+host+" is: "+ip);
        }catch(Exception ex){System.out.println(ex);}
    }
    public static void main(String[] args) {
        new FindIPAddress();
    }
}