package vista.cliente;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import control.comportamiento.ParaAltaCliente;
import control.comportamiento.ParaBajaCliente;
import control.comportamiento.ParaConsultaCliente;

public class PanelCliente extends JPanel {
	protected JTabbedPane tabCli;
	protected JButton btnInicioCli;
	
	protected JPanel altaCli = new ParaAltaCliente();
	protected JPanel consultaCli = new ParaConsultaCliente();
	protected JPanel bajaCli = new ParaBajaCliente();
	private JLabel lblIcono;
	protected JPanel panel;

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

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 21, -29, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 3.0, 3.0, 3.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 10.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		btnInicioCli = new JButton("Inicio");
		GridBagConstraints gbc_btnInicioArt = new GridBagConstraints();
		gbc_btnInicioArt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnInicioArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioArt.gridx = 1;
		gbc_btnInicioArt.gridy = 0;
		panel.add(btnInicioCli, gbc_btnInicioArt);

		JLabel lblSecCli = new JLabel("SECCION CLIENTES");
		GridBagConstraints gbc_lblSecCli = new GridBagConstraints();
		gbc_lblSecCli.anchor = GridBagConstraints.SOUTH;
		gbc_lblSecCli.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecCli.gridx = 2;
		gbc_lblSecCli.gridy = 0;
		panel.add(lblSecCli, gbc_lblSecCli);
		
		lblIcono = new JLabel("");
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.anchor = GridBagConstraints.SOUTH;
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 3;
		gbc_lblIcono.gridy = 0;
		panel.add(lblIcono, gbc_lblIcono);

		tabCli = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabCli = new GridBagConstraints();
		gbc_tabCli.fill = GridBagConstraints.BOTH;
		gbc_tabCli.gridwidth = 3;
		gbc_tabCli.insets = new Insets(0, 0, 5, 5);
		gbc_tabCli.gridx = 1;
		gbc_tabCli.gridy = 2;
		panel.add(tabCli, gbc_tabCli);

		tabCli.addTab("Alta", altaCli);
		tabCli.addTab("Consulta", consultaCli);
		tabCli.addTab("Baja", bajaCli);
		
		Icon iconoInicio = new ImageIcon(getClass().getResource("/iconos/inicio.png"));
		Icon iconoCliente = new ImageIcon(getClass().getResource("/iconos/clientes.png"));
		Icon iconoAlta = new ImageIcon(getClass().getResource("/iconos/altas.png"));
		Icon iconoConsulta = new ImageIcon(getClass().getResource("/iconos/consultas.png"));
		Icon iconoBaja = new ImageIcon(getClass().getResource("/iconos/bajas.png"));

		btnInicioCli.setIcon(iconoInicio);
		lblIcono.setIcon(iconoCliente);
		tabCli.setIconAt(0, iconoAlta);
		tabCli.setIconAt(1, iconoConsulta);
		tabCli.setIconAt(2, iconoBaja);

	}

}
