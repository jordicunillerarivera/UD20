package objetos;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AplicacionGrafica extends JFrame {

	// Atributos
		private JPanel contentPane;
		private JLabel etiqueta;
		private JTextField textField;
		private JButton btnPulsame;
		
		// Constructor
		public AplicacionGrafica() {
			
			// Añade un titulo, no es estrictamente necesario
			setTitle("UD20");
			
			/**
			 * Coordenadas x y de la aplicacion y su altura y longitud,
			 * si no lo indicamos aparecera una ventana muy pequeña
			 */
			setBounds(400, 200, 300, 250);
			
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
			
			// Indicamos su diseño
			contentPane.setLayout(null);
			
			// Asigno el panel a la ventana
			setContentPane(contentPane);
			
				// Creacion de componentes
			// Creo el componente etiqueta
			etiqueta = new JLabel("Escribe un nombre para saludar");
			
			// Colocamos el componente
			etiqueta.setBounds(47, 31, 200, 20);
			
			// Añadimos el elemento al panel, sino no se vera
			contentPane.add(etiqueta);
			
			// Crea el componentes entrada de  texto
			textField = new JTextField();
			textField.setBounds(42, 62, 200, 25);
			contentPane.add(textField);
			
			// Crea el componente de boton
			btnPulsame = new JButton("Pulsame");
			btnPulsame.setBounds(97, 110, 90, 25);
			contentPane.add(btnPulsame);
			btnPulsame.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Hola " + textField.getText());
				}
			});
		}

}
