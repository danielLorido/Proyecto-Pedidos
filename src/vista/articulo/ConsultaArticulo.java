package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ConsultaArticulo extends JPanel {
	protected JTextField txtNumRef;
	protected JTextField txtNombreArt;
	protected JTextField txtPrecioArt;
	protected JComboBox comboArt;
	protected JTextArea txtDescripcionArt;

	/**
	 * Create the panel.
	 */
	public ConsultaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlConsultaArt = new JPanel();
		pnlConsultaArt.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlConsultaArt.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlConsultaArt = new GridBagConstraints();
		gbc_pnlConsultaArt.fill = GridBagConstraints.BOTH;
		gbc_pnlConsultaArt.gridx = 0;
		gbc_pnlConsultaArt.gridy = 0;
		add(pnlConsultaArt, gbc_pnlConsultaArt);
		GridBagLayout gbl_pnlConsultaArt = new GridBagLayout();
		gbl_pnlConsultaArt.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlConsultaArt.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlConsultaArt.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlConsultaArt.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlConsultaArt.setLayout(gbl_pnlConsultaArt);
		
		JLabel lblConsultaArt = new JLabel("Consulta Art\u00EDculo");
		GridBagConstraints gbc_lblConsultaArt = new GridBagConstraints();
		gbc_lblConsultaArt.gridwidth = 6;
		gbc_lblConsultaArt.insets = new Insets(0, 0, 5, 0);
		gbc_lblConsultaArt.gridx = 0;
		gbc_lblConsultaArt.gridy = 0;
		pnlConsultaArt.add(lblConsultaArt, gbc_lblConsultaArt);
		
		JLabel lblSeleccioneArt = new JLabel("Seleccione Art\u00EDculo");
		GridBagConstraints gbc_lblSeleccioneArt = new GridBagConstraints();
		gbc_lblSeleccioneArt.gridwidth = 2;
		gbc_lblSeleccioneArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneArt.gridx = 1;
		gbc_lblSeleccioneArt.gridy = 1;
		pnlConsultaArt.add(lblSeleccioneArt, gbc_lblSeleccioneArt);
		
		comboArt = new JComboBox();
		GridBagConstraints gbc_comboBoxArt = new GridBagConstraints();
		gbc_comboBoxArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxArt.gridwidth = 2;
		gbc_comboBoxArt.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxArt.gridx = 3;
		gbc_comboBoxArt.gridy = 1;
		pnlConsultaArt.add(comboArt, gbc_comboBoxArt);
		
		JLabel lblNumRefeArt = new JLabel("Numero Referencia");
		lblNumRefeArt.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNumRefeArt = new GridBagConstraints();
		gbc_lblNumRefeArt.gridwidth = 2;
		gbc_lblNumRefeArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumRefeArt.gridx = 1;
		gbc_lblNumRefeArt.gridy = 3;
		pnlConsultaArt.add(lblNumRefeArt, gbc_lblNumRefeArt);
		
		txtNumRef = new JTextField();
		txtNumRef.setEditable(false);
		txtNumRef.setColumns(10);
		GridBagConstraints gbc_txtNumRef = new GridBagConstraints();
		gbc_txtNumRef.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumRef.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumRef.gridx = 4;
		gbc_txtNumRef.gridy = 3;
		pnlConsultaArt.add(txtNumRef, gbc_txtNumRef);
		
		JLabel lblNombreArt = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreArt = new GridBagConstraints();
		gbc_lblNombreArt.anchor = GridBagConstraints.EAST;
		gbc_lblNombreArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArt.gridx = 2;
		gbc_lblNombreArt.gridy = 4;
		pnlConsultaArt.add(lblNombreArt, gbc_lblNombreArt);
		
		txtNombreArt = new JTextField();
		txtNombreArt.setEditable(false);
		txtNombreArt.setColumns(10);
		GridBagConstraints gbc_txtNombreArt = new GridBagConstraints();
		gbc_txtNombreArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreArt.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreArt.gridx = 4;
		gbc_txtNombreArt.gridy = 4;
		pnlConsultaArt.add(txtNombreArt, gbc_txtNombreArt);
		
		JLabel lblPrecioArt = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecioArt = new GridBagConstraints();
		gbc_lblPrecioArt.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioArt.gridx = 2;
		gbc_lblPrecioArt.gridy = 5;
		pnlConsultaArt.add(lblPrecioArt, gbc_lblPrecioArt);
		
		txtPrecioArt = new JTextField();
		txtPrecioArt.setEditable(false);
		txtPrecioArt.setColumns(10);
		GridBagConstraints gbc_txtPrecioArt = new GridBagConstraints();
		gbc_txtPrecioArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioArt.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioArt.gridx = 4;
		gbc_txtPrecioArt.gridy = 5;
		pnlConsultaArt.add(txtPrecioArt, gbc_txtPrecioArt);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 2;
		gbc_lblDescripcin.gridy = 6;
		pnlConsultaArt.add(lblDescripcin, gbc_lblDescripcin);
		
		JScrollPane scrollPaneArt = new JScrollPane();
		GridBagConstraints gbc_scrollPaneArt = new GridBagConstraints();
		gbc_scrollPaneArt.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneArt.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneArt.gridx = 4;
		gbc_scrollPaneArt.gridy = 6;
		pnlConsultaArt.add(scrollPaneArt, gbc_scrollPaneArt);
		
		txtDescripcionArt = new JTextArea();
		txtDescripcionArt.setEditable(false);
		scrollPaneArt.setViewportView(txtDescripcionArt);

	}

}
