import java.awt.*;
import java.awt.event.*;

class Lab7P1 {
    public static void main(String[] args) {
    final int[]a={1};
        Frame f = new Frame();
        FlowLayout fl =new FlowLayout();
        f.setLayout(fl);
        f.setSize(300, 200);
        TextField tf = new TextField(20);
        Button b = new Button("Click");
        b.setSize(20,50);
        Label l = new Label();
        l.setPreferredSize(new Dimension(20,50));
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setVisible(true);
         b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            System.out.println("Hello");
                tf.setText(tf.getText() +" "+a[0]);
                a[0]++;
            }
            });
            f.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent we) {
                f.dispose();
            }
        });
        }
        }
