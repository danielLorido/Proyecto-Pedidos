package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class PanelArticulo extends JPanel {

	protected JTextField txtOpcionalesArt;
	protected JTabbedPane tabArt;
	protected JButton btnIconoArt;
	protected JButton btnInicioArt;
	protected JPanel altaArt = new AltaArticulo();

	/**
	 * Create the panel.
	 */
	public PanelArticulo() {
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

		btnInicioArt = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioArt = new GridBagConstraints();
		gbc_btnInicioArt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnInicioArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioArt.gridx = 1;
		gbc_btnInicioArt.gridy = 0;
		panel.add(btnInicioArt, gbc_btnInicioArt);

		JLabel lblSecArt = new JLabel("SECCI\u00D3N ART\u00CDCULOS");
		GridBagConstraints gbc_lblSecArt = new GridBagConstraints();
		gbc_lblSecArt.anchor = GridBagConstraints.SOUTH;
		gbc_lblSecArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecArt.gridx = 2;
		gbc_lblSecArt.gridy = 0;
		panel.add(lblSecArt, gbc_lblSecArt);

		btnIconoArt = new JButton("Icono");
		GridBagConstraints gbc_btnIconoArt = new GridBagConstraints();
		gbc_btnIconoArt.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnIconoArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnIconoArt.gridx = 3;
		gbc_btnIconoArt.gridy = 0;
		panel.add(btnIconoArt, gbc_btnIconoArt);

		tabArt = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabArt = new GridBagConstraints();
		gbc_tabArt.fill = GridBagConstraints.BOTH;
		gbc_tabArt.gridwidth = 3;
		gbc_tabArt.insets = new Insets(0, 0, 5, 5);
		gbc_tabArt.gridx = 1;
		gbc_tabArt.gridy = 2;
		panel.add(tabArt, gbc_tabArt);
		tabArt.addTab("Alta", altaArt);

		txtOpcionalesArt = new JTextField();
		txtOpcionalesArt.setEditable(false);
		txtOpcionalesArt.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesArt = new GridBagConstraints();
		gbc_txtOpcionalesArt.anchor = GridBagConstraints.NORTH;
		gbc_txtOpcionalesArt.gridwidth = 3;
		gbc_txtOpcionalesArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesArt.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionalesArt.gridx = 1;
		gbc_txtOpcionalesArt.gridy = 4;
		panel.add(txtOpcionalesArt, gbc_txtOpcionalesArt);

	}

}
