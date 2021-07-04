package triangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class app extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	triangulo t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app frame = new app();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public app() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("GENERADOR DE TRIANGULOS");
		titulo.setForeground(new Color(0, 51, 255));
		titulo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(10, 11, 493, 36);
		contentPane.add(titulo);
		
		JLabel l1 = new JLabel("Lado 1:");
		l1.setBounds(72, 58, 49, 14);
		contentPane.add(l1);
		
		num1 = new JTextField();
		num1.setBounds(145, 58, 96, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		JLabel l2 = new JLabel("Lado 2:");
		l2.setBounds(72, 95, 49, 14);
		contentPane.add(l2);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(145, 95, 96, 20);
		contentPane.add(num2);
		
		JLabel l3 = new JLabel("Lado 3:");
		l3.setBounds(72, 130, 49, 14);
		contentPane.add(l3);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(145, 130, 96, 20);
		contentPane.add(num3);
		
		JButton gen = new JButton("Generar");
		gen.setBounds(359, 91, 89, 23);
		contentPane.add(gen);
		
		gen.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(num1.getText());
		int b = Integer.parseInt(num2.getText());
		int c = Integer.parseInt(num3.getText());
		String tipo;
		t1 = new triangulo();
		t1.setl1(a);
		t1.setl2(b);
		t1.setl3(c);
		
		if(t1.esEquilatero()) {
			tipo = "equilátero";
			JOptionPane.showMessageDialog(null, ("El triángulo es : "+tipo));
		}
		else if(t1.esEscaleno()) {
			tipo = "escaleno";
			JOptionPane.showMessageDialog(null, ("El triángulo es : "+tipo));
		} else {
			tipo = "isósceles";
			if(t1.tieneAnguloRecto()) {
				JOptionPane.showMessageDialog(null, ("El triángulo es : "+tipo+"\n Y su ángulo es recto"));
			}
			else {
				JOptionPane.showMessageDialog(null, ("El triángulo es : "+tipo));
			}
			}
		
		
	}
}
