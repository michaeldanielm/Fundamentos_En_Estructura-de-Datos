import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener,ChangeListener{
	
	private JToolBar tool;
	@SuppressWarnings("unused")
	private JPanel panel;
	private JButton inicio;
	private JButton aleatorias;
	private JButton lineal;
	private JButton pistola;
	private JButton Michael;
        private JButton limpiar;
	private BorderLayout border;
	private Lienzo lienzo;
	private JSlider slider;
	private JLabel velocidad;
	Thread t = new Thread();
	int vel;
	private final int MAXVEL = 180;
	
	public Ventana(){
		tool = new JToolBar();
		panel = new JPanel();
		aleatorias = new JButton("Aleatorio");
		lineal = new JButton("Lineal");
		pistola = new JButton("Gosper Gun");
                Michael = new JButton("MDML");
		inicio = new JButton("Inicio");
		limpiar = new JButton("Limpiar");
		velocidad= new JLabel("Velocidad");
		border = new BorderLayout();
		lienzo = new Lienzo();
		slider =new JSlider(JSlider.HORIZONTAL,1,MAXVEL, 50);
		vel = MAXVEL - slider.getValue();
		setTitle("Juego de la Vida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(border);
		menu();
		add(lienzo, BorderLayout.CENTER);
		
		slider.addChangeListener(this);
		setResizable(false);
		pack();
		setVisible(true);
		t = null;
		
	}
	public static void main(String [] args){
		@SuppressWarnings("unused")
		Ventana ventana = new Ventana();
	}
	public void menu(){// asigna la interfaz del programa
		add(tool, BorderLayout.NORTH);
		tool.add(aleatorias);
                tool.add(lineal);
		tool.add(pistola);
                tool.add(Michael);
		tool.add(inicio);
		tool.add(limpiar);
                tool.add(velocidad);
		tool.add(slider);// asignar el boton de la velocidad de ejecusion 
		tool.setFloatable(false);
		limpiar.addActionListener(this);
		aleatorias.addActionListener(this);
		lineal.addActionListener(this);
		pistola.addActionListener(this);
                Michael.addActionListener(this);
		inicio.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {// asigna la accion de cada boton
		if(e.getSource()==inicio){
			if(inicio.getText()=="Inicio"){
				inicio.setText("Pausa");
				if (t == null){
					t = new Thread(new Runnable() {
						public void run() {
							Thread aux = Thread.currentThread();
							while (t == aux) {
								lienzo.getEspacioCel().generacion();
								repaint();
								try { Thread.sleep(vel); } catch (InterruptedException e1) {}
								lienzo.getEspacioCel().generacionSig();
								repaint();
								try { Thread.sleep(vel); } catch (InterruptedException e1) {}
							}
						}
					});
					t.start();
				}
			}
			else{
				inicio.setText("Inicio");
				t = null;
			}
		}
		else if(e.getSource()==limpiar){
			lienzo.getEspacioCel().limpiar();
			t = null;
			inicio.setText("Inicio");
			repaint();
		}
		else if(e.getSource()==aleatorias){
			lienzo.getEspacioCel().aleatorias();
			repaint();
		}
		
		else if(e.getSource()==lineal){
			lienzo.getEspacioCel().lineal();
			repaint();
		}
		
		else if(e.getSource()==pistola){
			lienzo.getEspacioCel().pistola();
			repaint();
		}
                else if(e.getSource()==Michael){
			lienzo.getEspacioCel().Michael();
			repaint();
		}
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source=(JSlider)e.getSource();
		vel=MAXVEL - source.getValue();
	}
}