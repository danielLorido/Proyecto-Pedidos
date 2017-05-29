package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class PanelPedidos extends JPanel {
	private JTextField txtOpcionalesPed;

	/**
	 * Create the panel.
	 */
	public PanelPedidos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{228, 0};
		gridBagLayout.rowHeights = new int[]{90, 0};
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
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEspacioPedArr = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioPedArr = new GridBagConstraints();
		gbc_lblEspacioPedArr.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioPedArr.gridx = 2;
		gbc_lblEspacioPedArr.gridy = 0;
		panel.add(lblEspacioPedArr, gbc_lblEspacioPedArr);
		
		JButton btnInicioPed = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioPed = new GridBagConstraints();
		gbc_btnInicioPed.gridheight = 2;
		gbc_btnInicioPed.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioPed.gridx = 1;
		gbc_btnInicioPed.gridy = 1;
		panel.add(btnInicioPed, gbc_btnInicioPed);
		
		JLabel lblSecPed = new JLabel("Secci\u00F3n Pedidos");
		GridBagConstraints gbc_lblSecPed = new GridBagConstraints();
		gbc_lblSecPed.gridheight = 2;
		gbc_lblSecPed.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecPed.gridx = 2;
		gbc_lblSecPed.gridy = 1;
		panel.add(lblSecPed, gbc_lblSecPed);
		
		JButton btnIconoPed = new JButton("Icono");
		GridBagConstraints gbc_btnIconoPed = new GridBagConstraints();
		gbc_btnIconoPed.gridheight = 2;
		gbc_btnIconoPed.insets = new Insets(0, 0, 5, 5);
		gbc_btnIconoPed.gridx = 3;
		gbc_btnIconoPed.gridy = 1;
		panel.add(btnIconoPed, gbc_btnIconoPed);
		
		JLabel lblEspacioPedIzq = new JLabel("        ");
		GridBagConstraints gbc_lblEspacioPedIzq = new GridBagConstraints();
		gbc_lblEspacioPedIzq.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioPedIzq.gridx = 0;
		gbc_lblEspacioPedIzq.gridy = 4;
		panel.add(lblEspacioPedIzq, gbc_lblEspacioPedIzq);
		
		JTabbedPane tabPed = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabPed = new GridBagConstraints();
		gbc_tabPed.fill = GridBagConstraints.BOTH;
		gbc_tabPed.gridwidth = 3;
		gbc_tabPed.insets = new Insets(0, 0, 5, 5);
		gbc_tabPed.gridx = 1;
		gbc_tabPed.gridy = 4;
		panel.add(tabPed, gbc_tabPed);
		
		JLabel lblEspacioPedDer = new JLabel("        ");
		GridBagConstraints gbc_lblEspacioPedDer = new GridBagConstraints();
		gbc_lblEspacioPedDer.insets = new Insets(0, 0, 5, 0);
		gbc_lblEspacioPedDer.gridx = 4;
		gbc_lblEspacioPedDer.gridy = 4;
		panel.add(lblEspacioPedDer, gbc_lblEspacioPedDer);
		
		JLabel lblEspacioPedMed = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioPedMed = new GridBagConstraints();
		gbc_lblEspacioPedMed.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioPedMed.gridx = 2;
		gbc_lblEspacioPedMed.gridy = 5;
		panel.add(lblEspacioPedMed, gbc_lblEspacioPedMed);
		
		txtOpcionalesPed = new JTextField();
		txtOpcionalesPed.setEditable(false);
		txtOpcionalesPed.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesPed = new GridBagConstraints();
		gbc_txtOpcionalesPed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesPed.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionalesPed.gridx = 2;
		gbc_txtOpcionalesPed.gridy = 6;
		panel.add(txtOpcionalesPed, gbc_txtOpcionalesPed);
		
		JLabel lblEspacioPedAbj = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioPedAbj = new GridBagConstraints();
		gbc_lblEspacioPedAbj.insets = new Insets(0, 0, 0, 5);
		gbc_lblEspacioPedAbj.gridx = 2;
		gbc_lblEspacioPedAbj.gridy = 7;
		panel.add(lblEspacioPedAbj, gbc_lblEspacioPedAbj);

	}

}
