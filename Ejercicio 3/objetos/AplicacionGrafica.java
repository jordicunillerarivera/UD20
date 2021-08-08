package objetos;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AplicacionGrafica extends JFrame {

	// Atributos
	private JLabel etiqueta;
	private JPanel contentPane;
	private JRadioButton rdbtnOpcion1; 	// Windows
	private JRadioButton rdbtnOpcion2; 	// Linux
	private JRadioButton rdbtnOpcion3;	// Apple
	private JLabel etiqueta2;
	private JRadioButton rdbtnOpcion21;	// Programación
	private JRadioButton rdbtnOpcion22;	// Diseño grafico
	private JRadioButton rdbtnOpcion23;	// Administracion
	
	// Constructor
	public AplicacionGrafica() {
		
		// AÃ±ade un titulo, no es estrictamente necesario
		setTitle("Encuesta");
		
		/**
		 * Coordenadas x y de la aplicacion y su altura y longitud,
		 * si no lo indicamos aparecera una ventana muy pequeÃ±a
		 */
		setBounds(400, 200, 434, 319);
		
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
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
			// Creacion de componentes
		// Creo el componente etiqueta
		etiqueta = new JLabel("Sistema Operativo");
		etiqueta.setBounds(41, 31, 109, 20);
		contentPane.add(etiqueta);
		
		// Radio button para elegir el SO
		rdbtnOpcion1 = new JRadioButton("Windows", true);
		rdbtnOpcion1.setBounds(41, 58, 109, 23);
		contentPane.add(rdbtnOpcion1);
		
		rdbtnOpcion2 = new JRadioButton("Linux", false);
		rdbtnOpcion2.setBounds(41, 84, 109, 23);
		contentPane.add(rdbtnOpcion2);
		
		rdbtnOpcion3 = new JRadioButton("Apple", false);
		rdbtnOpcion3.setBounds(41, 110, 109, 23);
		contentPane.add(rdbtnOpcion3);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnOpcion1);
		bgroup.add(rdbtnOpcion2);
		bgroup.add(rdbtnOpcion3);
		
		// Creo el componente etiqueta
		etiqueta2 = new JLabel("Especialidad");
		etiqueta2.setBounds(41, 153, 109, 20);
		contentPane.add(etiqueta2);
		
		// Radio button para elegir el SO
		rdbtnOpcion21 = new JRadioButton("Programación", true);
		rdbtnOpcion21.setBounds(41, 180, 109, 23);
		contentPane.add(rdbtnOpcion21);
		
		rdbtnOpcion22 = new JRadioButton("Diseño gráfico", false);
		rdbtnOpcion22.setBounds(41, 206, 109, 23);
		contentPane.add(rdbtnOpcion22);
		
		rdbtnOpcion23 = new JRadioButton("Administración", false);
		rdbtnOpcion23.setBounds(41, 232, 109, 23);
		contentPane.add(rdbtnOpcion23);
		
		ButtonGroup bgroup2 = new ButtonGroup();
		bgroup2.add(rdbtnOpcion21);
		bgroup2.add(rdbtnOpcion22);
		bgroup2.add(rdbtnOpcion23);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setValue(5);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setBounds(194, 62, 200, 36);
		contentPane.add(slider);
		
		JLabel lblHorasDiariasEn = new JLabel("Horas diarias en el pc");
		lblHorasDiariasEn.setBounds(238, 31, 141, 20);
		contentPane.add(lblHorasDiariasEn);
		
		JButton btnNewButton = new JButton("Enviar formulario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnOpcion1.isSelected()) {
					if (rdbtnOpcion21.isSelected()) {
						JOptionPane.showMessageDialog(null, "Windows, Programacion, " + slider.getValue());
					} else if (rdbtnOpcion22.isSelected()) {
						JOptionPane.showMessageDialog(null, "Windows, Diseño grafico, " + slider.getValue());
					} else {
						JOptionPane.showMessageDialog(null, "Windows, Administracion, " + slider.getValue());
					}
				} else if (rdbtnOpcion2.isSelected()) {
					if (rdbtnOpcion21.isSelected()) {
						JOptionPane.showMessageDialog(null, "Linux, Programacion, " + slider.getValue());
					} else if (rdbtnOpcion22.isSelected()) {
						JOptionPane.showMessageDialog(null, "Linux, Diseño grafico, " + slider.getValue());
					} else {
						JOptionPane.showMessageDialog(null, "Linux, Administracion, " + slider.getValue());
					}
				} else {
					if (rdbtnOpcion21.isSelected()) {
						JOptionPane.showMessageDialog(null, "Apple, Programacion, " + slider.getValue());
					} else if (rdbtnOpcion22.isSelected()) {
						JOptionPane.showMessageDialog(null, "Apple, Diseño grafico, " + slider.getValue());
					} else {
						JOptionPane.showMessageDialog(null, "Apple, Administracion, " + slider.getValue());
					}
				}
			}
		});
		btnNewButton.setBounds(217, 206, 152, 23);
		contentPane.add(btnNewButton);
		
	}
}
