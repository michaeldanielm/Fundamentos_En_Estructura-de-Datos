import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import javax.swing.AbstractAction.*;
import javax.swing.JFrame;


/**
 *
 * @author MichaeL
 */
public class Fractals extends JApplet {

    private static final long serielVersionUID = 1;

   
    public void init() {
        setSize(400, 400);
        setBackground(Color.white);
    }
    
    public void paint(Graphics g) {
       
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int y = 0;
        int x = 0;
        Rule110 fractal = new Rule110();
        while (true) {
            
            int[][] matrix = fractal.Rules110;
            y = 0;
            for (int i = 0; i < 400; i++) {
                x = 0;
                for (int j = 0; j < 400; j++) {
                    if (matrix[i][j] == 0) {
                        g2.setPaint(Color.blue);
                    } else {
                        g2.setPaint(Color.yellow);

                    }
                    g2.fill(new Rectangle2D.Double(x, y, 2, 2));
                    x += 2;

                }
                y += 2;
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

// TODO overwrite start(), stop() and destroy() methods
    public static void main(String arg[]) {
        JFrame frame = new JFrame("Fractals");
        frame.addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JApplet applet = new Fractals();
        frame.getContentPane().add("Center", applet);
        applet.init();
        
        frame.pack();
        frame.setSize(new Dimension(400,400));
        frame.setVisible(true);
    }
}
