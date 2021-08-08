package objetos;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AplicacionGrafica extends JFrame {

	// Atributos
	private JPanel contentPane;
	private JLabel etiqueta;
	private JLabel etiqueta2;
	private JTextField textField;
	private JButton btnAñadir;
	private JComboBox<Object> comboBox;
	
	// Constructor
	public AplicacionGrafica() {
		
		// AÃ±ade un titulo, no es estrictamente necesario
		setTitle("UD20");
		
		/**
		 * Coordenadas x y de la aplicacion y su altura y longitud,
		 * si no lo indicamos aparecera una ventana muy pequeÃ±a
		 */
		setBounds(400, 200, 523, 425);
		
		/**
		 * Indica que cuando se cierre la ventana se acaba la aplicacion,
		 * si no lo indicamos cuando cerremos la ventana la aplicacion seguira abierta
		 */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana, si no lo hacemos no veremos la aplicacion
		setVisible(true);
		
			// Creacion del panel
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos su diseÃ±o
		contentPane.setLayout(null);
		
		// Asigno el panel a la ventana
		setContentPane(contentPane);
		
			// Creacion de componentes
		// Creo el componente etiqueta
		etiqueta = new JLabel("Escribe el titulo de una pelicula");
		
		// Colocamos el componente
		etiqueta.setBounds(63, 31, 200, 20);
		
		// AÃ±adimos el elemento al panel, sino no se vera
		contentPane.add(etiqueta);
		
		// Crea el componentes entrada de  texto
		textField = new JTextField();
		textField.setBounds(42, 62, 200, 25);
		contentPane.add(textField);
			
		// Crea una etiqueta
		etiqueta2 = new JLabel("Pelicula");		
		etiqueta2.setBounds(320, 31, 61, 20);
		contentPane.add(etiqueta2);
		
		// Crea una comboBox
		comboBox = new JComboBox<>();
		comboBox.setBounds(277, 65, 119, 20);
		contentPane.add(comboBox);
		
		// Crea el componente de boton
		btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(97, 110, 90, 25);
		contentPane.add(btnAñadir);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
		
	}

}
