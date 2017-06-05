package vista.articulo;

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

import control.comportamiento.ParaAltaArticulo;
import control.comportamiento.ParaConsultaArticulo;

public class PanelArticulo extends JPanel {
	protected JTabbedPane tabArt;
	protected JButton btnInicioArt;

	protected JPanel alta = new ParaAltaArticulo();
	protected JPanel consulta = new ParaConsultaArticulo();
	protected JPanel baja = new BajaArticulo();
	private JLabel lblIcono;
	// protected JPanel alta = new ParaAltaArticulo();

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

		btnInicioArt = new JButton("   Inicio");
		GridBagConstraints gbc_btnInicioArt = new GridBagConstraints();
		gbc_btnInicioArt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnInicioArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioArt.gridx = 1;
		gbc_btnInicioArt.gridy = 0;
		panel.add(btnInicioArt, gbc_btnInicioArt);

		JLabel lblSecArt = new JLabel("SECCI�N ART�CULOS");
		GridBagConstraints gbc_lblSecArt = new GridBagConstraints();
		gbc_lblSecArt.anchor = GridBagConstraints.SOUTH;
		gbc_lblSecArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecArt.gridx = 2;
		gbc_lblSecArt.gridy = 0;
		panel.add(lblSecArt, gbc_lblSecArt);
		
		lblIcono = new JLabel("");
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.anchor = GridBagConstraints.SOUTH;
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 3;
		gbc_lblIcono.gridy = 0;
		panel.add(lblIcono, gbc_lblIcono);

		tabArt = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabArt = new GridBagConstraints();
		gbc_tabArt.fill = GridBagConstraints.BOTH;
		gbc_tabArt.gridwidth = 3;
		gbc_tabArt.insets = new Insets(0, 0, 5, 5);
		gbc_tabArt.gridx = 1;
		gbc_tabArt.gridy = 2;
		panel.add(tabArt, gbc_tabArt);

		tabArt.addTab("Alta", alta);
		tabArt.addTab("Consulta", consulta);
		tabArt.add("Baja", baja);

		Icon iconoInicio = new ImageIcon(getClass().getResource("/iconos/inicio.png"));
		Icon iconoArticulo = new ImageIcon(getClass().getResource("/iconos/articulos.png"));
		Icon iconoAlta = new ImageIcon(getClass().getResource("/iconos/altas.png"));
		Icon iconoConsulta = new ImageIcon(getClass().getResource("/iconos/consultas.png"));
		Icon iconoBaja = new ImageIcon(getClass().getResource("/iconos/bajas.png"));

		btnInicioArt.setIcon(iconoInicio);
		lblIcono.setIcon(iconoArticulo);
		tabArt.setIconAt(0, iconoAlta);
		tabArt.setIconAt(1, iconoConsulta);
		tabArt.setIconAt(2, iconoBaja);

	}

}
