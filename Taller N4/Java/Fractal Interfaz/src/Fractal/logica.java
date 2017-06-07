
package Fractal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import java.time.Duration;

public class logica extends JApplet {

    //serial por defecto 
  

    private int ca_lenght = 400; //Longitud de los autómatas celulares
    private int screen_size = 800; //Tamaño del marco en la pantalla
    private int Duration= 50; //Tiempo de retardo de cada cambio de pantalla

    /**
     * Este método define la configuración del Applet
     */
    public void init() {
        setSize(screen_size, screen_size); //Definir el tamaño de la pantalla del applet
        setBackground(Color.white); //Definir el color de fondo
    }

    /**
     * Este método representa el proceso de pintura de los autómatas celulares
     */
    public void paint(Graphics g) {
        //Cree el objeto que dibujará todos los cuadrados
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Coordenadas del cuadrado inicial de los autómatas celulares
        int x = 0;
        int y = 0;

        //Tamaño de cada cuadrado
        int square_size = screen_size / ca_lenght;

        //Crear el objeto que genera la matriz
        Fractal automata = new Fractal();

        //Mientras se abrió la aplicación
        while (true) {
            int[][] M = automata.fractal(ca_lenght); //Generar una nueva matriz de autómatas celulares

            y = 0; //Comienza en el origen del lado superior

            for (int i = 0; i < ca_lenght; i++) {  //Mueva todos los autómatas celulares              
                x = 0;//Se inicia en el origen del lado izquierdo
                for (int j = 0; j < ca_lenght; j++) {
                    if (M[i][j] == 0) {
                        g2.setPaint(Color.red);//Si la posición en la matriz es cero, pinte el cuadrado de color 
                    } else {
                        g2.setPaint(Color.BLUE);//La posición en la matriz es una, pintar el cuadrado de color
                    }

                    //Pinte el cuadrado en cada coordenada de posición
                    g2.fill(new Rectangle2D.Double(x, y, square_size, square_size));

                    x += square_size; //Mover a la siguiente coordenada en sentido horizontal
                }

                y += square_size; //Mover a la siguiente coordenada en sentido vertical
            }

            //Retardo de cada tiempo de cambio en cada pantalla dibujada
            try {
                Thread.sleep(Duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
