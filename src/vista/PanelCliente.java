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

	protected JTextField txtOpcionalesCli;
	protected JTabbedPane tabCli;
	protected JButton btnIconoCli;
	protected JButton btnInicioCli;
	protected JPanel altaCli = new AltaCliente();

	/**
	 * Create the panel.
	 */
	public PanelCliente() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 556, 0 };
		gridBagLayout.rowHeights = new int[] { 401, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 21, -29, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 3.0, 3.0, 3.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 10.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		btnInicioCli = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioArt = new GridBagConstraints();
		gbc_btnInicioArt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnInicioArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioArt.gridx = 1;
		gbc_btnInicioArt.gridy = 0;
		panel.add(btnInicioCli, gbc_btnInicioArt);

		JLabel lblSecCli = new JLabel("SECCI\u00D3N CLIENTES");
		GridBagConstraints gbc_lblSecCli = new GridBagConstraints();
		gbc_lblSecCli.anchor = GridBagConstraints.SOUTH;
		gbc_lblSecCli.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecCli.gridx = 2;
		gbc_lblSecCli.gridy = 0;
		panel.add(lblSecCli, gbc_lblSecCli);

		btnIconoCli = new JButton("Icono");
		GridBagConstraints gbc_btnIconoArt = new GridBagConstraints();
		gbc_btnIconoArt.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnIconoArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnIconoArt.gridx = 3;
		gbc_btnIconoArt.gridy = 0;
		panel.add(btnIconoCli, gbc_btnIconoArt);

		tabCli = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabArt = new GridBagConstraints();
		gbc_tabArt.fill = GridBagConstraints.BOTH;
		gbc_tabArt.gridwidth = 3;
		gbc_tabArt.insets = new Insets(0, 0, 5, 5);
		gbc_tabArt.gridx = 1;
		gbc_tabArt.gridy = 2;
		panel.add(tabCli, gbc_tabArt);

		tabCli.addTab("Alta", altaCli);

		txtOpcionalesCli = new JTextField();
		txtOpcionalesCli.setEditable(false);
		txtOpcionalesCli.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesArt = new GridBagConstraints();
		gbc_txtOpcionalesArt.anchor = GridBagConstraints.NORTH;
		gbc_txtOpcionalesArt.gridwidth = 3;
		gbc_txtOpcionalesArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesArt.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionalesArt.gridx = 1;
		gbc_txtOpcionalesArt.gridy = 4;
		panel.add(txtOpcionalesCli, gbc_txtOpcionalesArt);

	}

}
