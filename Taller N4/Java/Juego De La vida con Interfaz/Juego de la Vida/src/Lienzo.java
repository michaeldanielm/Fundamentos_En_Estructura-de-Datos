
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lienzo extends JPanel implements MouseListener {

    EspacioCel espacio;

    public Lienzo() {
        setPreferredSize(new Dimension(800, 400));
        addMouseListener(this);
        setVisible(true);
        espacio = new EspacioCel();
    }
//Casi todas las componentes y contenedores de Swing tienen un método paint(g) asociado que sirve para dibujarlos en pantalla.
//Java invoca este método automáticamente cuando tiene que mostrar, de forma estándar, 
//la componente o contenedor en cuestión (esto es, sus bordes, su título, si lo tiene, etc.)
//El método paint(g) se redefine cuando se quiere que estos elementos tengan un aspecto particular, por ejemplo, cuando se quiere dibujar algo específico sobre ellos.
//El método paint(g) es de la forma

    public void paintComponent(Graphics g) {

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 80; j++) {

                if (espacio.getCelula(i, j).getEstado() == Estado.EMBRION) {
                    g.setColor(Color.GREEN);
                    //g.setColor(new Color(48, 121, 216
                    //g.setColor(new Color(180,205,240));
                } else if (espacio.getCelula(i, j).getEstado() == Estado.VIVA) {
                    g.setColor(Color.yellow);
                   // g.setColor(new Color(45, 115, 220));
                } 
                else if (espacio.getCelula(i, j).getEstado() == Estado.MORIBUNDA) {
                    // g.setColor(new Color(20, 75, 140));
                    g.setColor(Color.RED);
                } else {
                    g.setColor(new Color(10, 30, 60));
                }

                g.fillRect(j * 10, i * 10, 10, 10);
                g.setColor(Color.black);
                g.fillRect(j * 10, i * 10, getWidth(), 1);
                g.fillRect(j * 10, i * 10, 1, getHeight());

            }
        }
    }

    public EspacioCel getEspacioCel() {
        return espacio;
    }
// El ratón es uno de los dispositivos estándares en un interfaz gráfico, que facilita la interacción del usuario con el programa.
// Las acciones de pulsar sobre un botón, seleccionar un elemento del menú, o una herramienta en una caja de herramientas, activar o desactivar 
// una casilla de verificación, dibujar una figura en el canvas del programa Paint de Windows, seleccionar una palabra en el procesador de textos, etc,
// se realizan frecuentemente cuando se trabaja con algún programa.

    public void mouseClicked(MouseEvent arg0) {
    }

    public void mouseEntered(MouseEvent arg0) {
    }

    public void mouseExited(MouseEvent arg0) {
    }
    public void mousePressed(MouseEvent e) {
        espacio.setVivaMuerta(Math.abs(e.getY() / 10), Math.abs(e.getX() / 10));
        repaint();
    }

    public void mouseReleased(MouseEvent arg0) {
    }

}
