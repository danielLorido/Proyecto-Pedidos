package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import control.comportamiento.ParaAltaPedido;

public class PanelPedidos extends JPanel {
	
	protected JTextField txtOpcionalesPed;
	protected JTabbedPane tabPed;
	protected JButton btnInicioPed;
	protected JPanel AltaPedido = new ParaAltaPedido();
	protected JPanel ConsultaPedido = new ParaConsultaPedido();
	private JLabel lblIcono;

	/**
	 * Create the panel.
	 */
	public PanelPedidos() {
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

		btnInicioPed = new JButton("Inicio");
		GridBagConstraints gbc_btnInicioArt = new GridBagConstraints();
		gbc_btnInicioArt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnInicioArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioArt.gridx = 1;
		gbc_btnInicioArt.gridy = 0;
		panel.add(btnInicioPed, gbc_btnInicioArt);

		JLabel lblSecPed = new JLabel("SECCION PEDIDOS");
		GridBagConstraints gbc_lblSecPed = new GridBagConstraints();
		gbc_lblSecPed.anchor = GridBagConstraints.SOUTH;
		gbc_lblSecPed.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecPed.gridx = 2;
		gbc_lblSecPed.gridy = 0;
		panel.add(lblSecPed, gbc_lblSecPed);
		
		lblIcono = new JLabel("");
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 3;
		gbc_lblIcono.gridy = 0;
		panel.add(lblIcono, gbc_lblIcono);

		tabPed = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabArt = new GridBagConstraints();
		gbc_tabArt.fill = GridBagConstraints.BOTH;
		gbc_tabArt.gridwidth = 3;
		gbc_tabArt.insets = new Insets(0, 0, 5, 5);
		gbc_tabArt.gridx = 1;
		gbc_tabArt.gridy = 2;
		panel.add(tabPed, gbc_tabArt);
		
		Icon iconoInicio = new ImageIcon(getClass().getResource("/iconos/inicio.png"));
		Icon iconoPedido = new ImageIcon(getClass().getResource("/iconos/pedidos.png"));
		Icon iconoAlta = new ImageIcon(getClass().getResource("/iconos/altas.png"));
		Icon iconoConsulta = new ImageIcon(getClass().getResource("/iconos/consultas.png"));

		
		btnInicioPed.setIcon(iconoInicio);
		lblIcono.setIcon(iconoPedido);
		tabPed.addTab("Alta",AltaPedido);
		tabPed.setIconAt(0,iconoAlta);
		tabPed.addTab("Consulta",ConsultaPedido);
		tabPed.setIconAt(1, iconoConsulta);

		txtOpcionalesPed = new JTextField();
		txtOpcionalesPed.setEditable(false);
		txtOpcionalesPed.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesArt = new GridBagConstraints();
		gbc_txtOpcionalesArt.anchor = GridBagConstraints.NORTH;
		gbc_txtOpcionalesArt.gridwidth = 3;
		gbc_txtOpcionalesArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesArt.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionalesArt.gridx = 1;
		gbc_txtOpcionalesArt.gridy = 4;
		panel.add(txtOpcionalesPed, gbc_txtOpcionalesArt);

	}

}
