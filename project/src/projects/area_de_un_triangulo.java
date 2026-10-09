package projects;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;

public class area_de_un_triangulo {

	JFrame jfrFormularioPrincipal = null;
	JPanel jpnPrincipal = null;
	JLabel jblTitulo = null;
	JLabel jblBase = null;
	JLabel jblAltura = null;
	JLabel jblArea = null;
	JLabel jblResultado = null;
	JTextField jtfBase = null;
	JTextField jtfAltura = null;
	JButton jbnCalcular = null;

	public area_de_un_triangulo() {

		jfrFormularioPrincipal = new JFrame();
		jfrFormularioPrincipal.setTitle("Area de un triángulo");
		jfrFormularioPrincipal.setSize(400, 260);
		jfrFormularioPrincipal.setLayout(null);
		jfrFormularioPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jpnPrincipal = new JPanel();
		jpnPrincipal.setSize(400, 260);
		jpnPrincipal.setLayout(null);
		jpnPrincipal.setVisible(true);
		jfrFormularioPrincipal.add(jpnPrincipal);

		jblTitulo = new JLabel("<html><b><u>Calcula el área de un triángulo</u></b></html>");
		jblTitulo.setBounds(new Rectangle(30, 15, 340, 25));
		jblTitulo.setFont(new Font("Serif", Font.PLAIN, 16));
		jblTitulo.setForeground(new Color(0, 128, 128));
		jpnPrincipal.add(jblTitulo);

		jblBase = new JLabel("<html><b>Base</b></html>");
		jblBase.setBounds(new Rectangle(50, 80, 65, 22));
		jblBase.setFont(new Font("Serif", Font.PLAIN, 14));
		jblBase.setForeground(new Color(0, 0, 128));
		jblBase.setBackground(new Color(170, 170, 200));
		jblBase.setOpaque(true);
		jpnPrincipal.add(jblBase);

		jtfBase = new JTextField();
		jtfBase.setBounds(new Rectangle(125, 80, 70, 22));
		jpnPrincipal.add(jtfBase);

		jblAltura = new JLabel("<html><b>Altura</b></html>");
		jblAltura.setBounds(new Rectangle(50, 120, 65, 22));
		jblAltura.setFont(new Font("Serif", Font.PLAIN, 14));
		jblAltura.setForeground(new Color(0, 0, 128));
		jblAltura.setBackground(new Color(170, 170, 200));
		jblAltura.setOpaque(true);
		jpnPrincipal.add(jblAltura);

		jtfAltura = new JTextField();
		jtfAltura.setBounds(new Rectangle(125, 120, 70, 22));
		jpnPrincipal.add(jtfAltura);

		jblArea = new JLabel("<html><b>Area</b></html>");
		jblArea.setBounds(new Rectangle(50, 160, 65, 22));
		jblArea.setFont(new Font("Serif", Font.PLAIN, 14));
		jblArea.setForeground(new Color(0, 0, 128));
		jblArea.setBackground(new Color(170, 170, 200));
		jblArea.setOpaque(true);
		jpnPrincipal.add(jblArea);

		jblResultado = new JLabel("");
		jblResultado.setBounds(new Rectangle(125, 160, 150, 22));
		jblResultado.setFont(new Font("Serif", Font.PLAIN, 14));
		jpnPrincipal.add(jblResultado);

		jbnCalcular = new JButton();
		jbnCalcular.setBounds(new Rectangle(240, 100, 110, 30));
		jbnCalcular.setText("Calcular");
		jpnPrincipal.add(jbnCalcular);

		jbnCalcular.addActionListener(e -> accionBotonCalcular());

		jfrFormularioPrincipal.setVisible(true);
	}

	public void accionBotonCalcular() {
		int base, altura;
		double area;

		try {
			base = Integer.parseInt(jtfBase.getText().trim());
			altura = Integer.parseInt(jtfAltura.getText().trim());
		} catch (NumberFormatException ex) {
			jblResultado.setText("Datos no válidos");
			return;
		}

		area = base * altura / 2.0;

		jblResultado.setText(String.format("%.2f", area));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(area_de_un_triangulo::new);
	}

}