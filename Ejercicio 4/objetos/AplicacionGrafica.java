package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AplicacionGrafica extends JFrame {
	
	// Atributos
	private JPanel contentPane;
	private JTextField tfOperador2;
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem about;
	private JMenuItem salir;
	private JButton btnResta;
	private JButton btnMultiplicacion;
	private JButton btnSuma;
	private JButton btnDivision;
	private JTextField tfOperador1;
	private JTextField tfResultado;
	private double calculo;

	// Constructor
	public AplicacionGrafica() {
		
		// Creacion de la ventana
		setTitle("Encuesta");
		setBounds(400, 200, 300, 273);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creamos el menu
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		menu = new JMenu("Menu");
		barraMenu.add(menu);
		
		about = new JMenuItem("About");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Version: 1.0\nCreador: Jordi Cunillera");
			}
		});
		menu.add(about);
		
		salir = new JMenuItem("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(salir);
		
		// Creamos el panel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
			// Componentes
		// TextFields
		tfOperador1 = new JTextField();
		tfOperador1.setColumns(10);
		tfOperador1.setBounds(28, 32, 89, 31);
		tfOperador1.setText("1");
		contentPane.add(tfOperador1);
		
		tfOperador2 = new JTextField();
		tfOperador2.setColumns(10);
		tfOperador2.setBounds(150, 32, 89, 31);
		tfOperador2.setText("2");
		contentPane.add(tfOperador2);
		
		tfResultado = new JTextField();
		tfResultado.setHorizontalAlignment(SwingConstants.CENTER);
		tfResultado.setColumns(10);
		tfResultado.setBounds(73, 142, 130, 31);
		tfResultado.setText("Resultado");
		contentPane.add(tfResultado);
		
		// Botones
		btnSuma = new JButton("Suma");
		btnSuma.setBounds(28, 74, 89, 23);
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					calculo = Double.parseDouble(tfOperador1.getText()) + Double.parseDouble(tfOperador2.getText());
					tfResultado.setText(String.valueOf(calculo));
					
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Introduzca un valor valido");
				}
			}
		});
		contentPane.add(btnSuma);
		
		btnResta = new JButton("Resta");
		btnResta.setBounds(150, 74, 89, 23);
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					calculo = Double.parseDouble(tfOperador1.getText()) - Double.parseDouble(tfOperador2.getText());
					tfResultado.setText(String.valueOf(calculo));
					
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Introduzca un valor valido");
				}
			}
		});
		contentPane.add(btnResta);
		
		btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.setBounds(28, 108, 89, 23);
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					calculo = Double.parseDouble(tfOperador1.getText()) * Double.parseDouble(tfOperador2.getText());
					tfResultado.setText(String.valueOf(calculo));
					
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Introduzca un valor valido");
				}
			}
		});
		contentPane.add(btnMultiplicacion);
		
		btnDivision = new JButton("Division");
		btnDivision.setBounds(150, 108, 89, 23);
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					calculo = Double.parseDouble(tfOperador1.getText()) / Double.parseDouble(tfOperador2.getText());
					tfResultado.setText(String.valueOf(calculo));
					
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Introduzca un valor valido");
				}
			}
		});
		contentPane.add(btnDivision);
		
	}
}
