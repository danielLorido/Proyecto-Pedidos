package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class PanelCliente extends JPanel {
	public JPanel panel;
	private JButton btnInicioCli;
	private JButton btnIconoCli;
	private JTextField txtOpcionalesCli;
	private JTabbedPane tabCli;
	private JLabel lblEspacioCliIzq;
	private JLabel lblEspacioCliDer;
	private JLabel lblEspacioCliArri;

	/**
	 * Create the panel.
	 */
	public PanelCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{556, 0};
		gridBagLayout.rowHeights = new int[]{401, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblEspacioCliArri = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioCliArri = new GridBagConstraints();
		gbc_lblEspacioCliArri.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioCliArri.gridx = 2;
		gbc_lblEspacioCliArri.gridy = 0;
		panel.add(lblEspacioCliArri, gbc_lblEspacioCliArri);
		
		btnInicioCli = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioCli = new GridBagConstraints();
		gbc_btnInicioCli.gridheight = 2;
		gbc_btnInicioCli.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioCli.gridx = 1;
		gbc_btnInicioCli.gridy = 1;
		panel.add(btnInicioCli, gbc_btnInicioCli);
		
		JLabel lblSecCli = new JLabel("Secci\u00F3n Clientes");
		GridBagConstraints gbc_lblSecCli = new GridBagConstraints();
		gbc_lblSecCli.gridheight = 2;
		gbc_lblSecCli.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecCli.gridx = 2;
		gbc_lblSecCli.gridy = 1;
		panel.add(lblSecCli, gbc_lblSecCli);
		
		btnIconoCli = new JButton("Icono");
		GridBagConstraints gbc_btnIconoCli = new GridBagConstraints();
		gbc_btnIconoCli.gridheight = 2;
		gbc_btnIconoCli.insets = new Insets(0, 0, 5, 5);
		gbc_btnIconoCli.gridx = 3;
		gbc_btnIconoCli.gridy = 1;
		panel.add(btnIconoCli, gbc_btnIconoCli);
		
		lblEspacioCliIzq = new JLabel("        ");
		GridBagConstraints gbc_lblEspacioCliIzq = new GridBagConstraints();
		gbc_lblEspacioCliIzq.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioCliIzq.gridx = 0;
		gbc_lblEspacioCliIzq.gridy = 3;
		panel.add(lblEspacioCliIzq, gbc_lblEspacioCliIzq);
		
		tabCli = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabCli = new GridBagConstraints();
		gbc_tabCli.fill = GridBagConstraints.BOTH;
		gbc_tabCli.gridwidth = 3;
		gbc_tabCli.insets = new Insets(0, 0, 5, 5);
		gbc_tabCli.gridx = 1;
		gbc_tabCli.gridy = 3;
		panel.add(tabCli, gbc_tabCli);
		
		lblEspacioCliDer = new JLabel("        ");
		GridBagConstraints gbc_lblEspacioCliDer = new GridBagConstraints();
		gbc_lblEspacioCliDer.insets = new Insets(0, 0, 5, 0);
		gbc_lblEspacioCliDer.gridx = 4;
		gbc_lblEspacioCliDer.gridy = 3;
		panel.add(lblEspacioCliDer, gbc_lblEspacioCliDer);
		
		JLabel lblEspacioCliMed = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioCliMed = new GridBagConstraints();
		gbc_lblEspacioCliMed.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioCliMed.gridx = 2;
		gbc_lblEspacioCliMed.gridy = 4;
		panel.add(lblEspacioCliMed, gbc_lblEspacioCliMed);
		
		txtOpcionalesCli = new JTextField();
		txtOpcionalesCli.setEditable(false);
		txtOpcionalesCli.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesCli = new GridBagConstraints();
		gbc_txtOpcionalesCli.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesCli.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionalesCli.gridx = 2;
		gbc_txtOpcionalesCli.gridy = 5;
		panel.add(txtOpcionalesCli, gbc_txtOpcionalesCli);
		
		JLabel lblEspacioCliAbaj = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioCliAbaj = new GridBagConstraints();
		gbc_lblEspacioCliAbaj.insets = new Insets(0, 0, 0, 5);
		gbc_lblEspacioCliAbaj.gridx = 2;
		gbc_lblEspacioCliAbaj.gridy = 6;
		panel.add(lblEspacioCliAbaj, gbc_lblEspacioCliAbaj);

	}

}
