package AnonymousInnerClass;
import java.awt.*;
import java.awt.event.*;

public class AnonymousDemo5 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                for (int i=1 ; i<=10 ; i++){
                    System.out.println("I am closing window :"+ i);
                    System.exit(0);
                }
            }
        });
        f.add(new Label("I can create a executable jar file"));
        f.setBackground(Color.yellow);
        f.setSize(500,500);
        f.setVisible(true);

    }
}
