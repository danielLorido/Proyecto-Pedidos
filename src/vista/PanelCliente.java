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
	private JTextField txtOpcionalesCli;

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
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnInicioCli = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioCli = new GridBagConstraints();
		gbc_btnInicioCli.gridheight = 2;
		gbc_btnInicioCli.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioCli.gridx = 0;
		gbc_btnInicioCli.gridy = 0;
		panel.add(btnInicioCli, gbc_btnInicioCli);
		
		JLabel lblSecCli = new JLabel("Secci\u00F3n Clientes");
		GridBagConstraints gbc_lblSecCli = new GridBagConstraints();
		gbc_lblSecCli.gridheight = 2;
		gbc_lblSecCli.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecCli.gridx = 1;
		gbc_lblSecCli.gridy = 0;
		panel.add(lblSecCli, gbc_lblSecCli);
		
		JButton btnIconoCli = new JButton("Icono");
		GridBagConstraints gbc_btnIconoCli = new GridBagConstraints();
		gbc_btnIconoCli.gridheight = 2;
		gbc_btnIconoCli.insets = new Insets(0, 0, 5, 0);
		gbc_btnIconoCli.gridx = 2;
		gbc_btnIconoCli.gridy = 0;
		panel.add(btnIconoCli, gbc_btnIconoCli);
		
		JTabbedPane tabCli = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabCli = new GridBagConstraints();
		gbc_tabCli.fill = GridBagConstraints.BOTH;
		gbc_tabCli.gridwidth = 3;
		gbc_tabCli.insets = new Insets(0, 0, 5, 0);
		gbc_tabCli.gridx = 0;
		gbc_tabCli.gridy = 2;
		panel.add(tabCli, gbc_tabCli);
		
		JLabel lblEspacio01 = new JLabel(" ");
		GridBagConstraints gbc_lblEspacio01 = new GridBagConstraints();
		gbc_lblEspacio01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacio01.gridx = 1;
		gbc_lblEspacio01.gridy = 3;
		panel.add(lblEspacio01, gbc_lblEspacio01);
		
		txtOpcionalesCli = new JTextField();
		txtOpcionalesCli.setEditable(false);
		txtOpcionalesCli.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesCli = new GridBagConstraints();
		gbc_txtOpcionalesCli.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesCli.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionalesCli.gridx = 1;
		gbc_txtOpcionalesCli.gridy = 4;
		panel.add(txtOpcionalesCli, gbc_txtOpcionalesCli);
		
		JLabel lblEspacio02 = new JLabel(" ");
		GridBagConstraints gbc_lblEspacio02 = new GridBagConstraints();
		gbc_lblEspacio02.insets = new Insets(0, 0, 0, 5);
		gbc_lblEspacio02.gridx = 1;
		gbc_lblEspacio02.gridy = 5;
		panel.add(lblEspacio02, gbc_lblEspacio02);

	}

}
