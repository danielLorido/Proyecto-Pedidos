package vista.articulo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;

public class AltaArticulo extends JPanel {

	protected JTextField txtNumRef;
	protected JTextField txtNombre;
	protected JTextField txtPrecio;
	protected JTextArea textDescripcion;
	protected JButton btnDarAlta;
	protected JButton btnCancelar;
	protected JTextField textAnomalia;

	/**
	 * Create the panel.
	 */
	public AltaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlAltaCli = new JPanel();
		pnlAltaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlAltaCli.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlAltaCli = new GridBagConstraints();
		gbc_pnlAltaCli.fill = GridBagConstraints.BOTH;
		gbc_pnlAltaCli.gridx = 0;
		gbc_pnlAltaCli.gridy = 0;
		add(pnlAltaCli, gbc_pnlAltaCli);
		GridBagLayout gbl_pnlAltaCli = new GridBagLayout();
		gbl_pnlAltaCli.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlAltaCli.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 27, 0};
		gbl_pnlAltaCli.columnWeights = new double[]{1.0, 1.0, 3.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlAltaCli.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlAltaCli.setLayout(gbl_pnlAltaCli);
		
		JLabel lblNumRef = new JLabel("N\u00FAmero de Referencia");
		GridBagConstraints gbc_lblNumRef = new GridBagConstraints();
		gbc_lblNumRef.anchor = GridBagConstraints.EAST;
		gbc_lblNumRef.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumRef.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumRef.gridx = 1;
		gbc_lblNumRef.gridy = 1;
		pnlAltaCli.add(lblNumRef, gbc_lblNumRef);
		
		txtNumRef = new JTextField();
		txtNumRef.setColumns(10);
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 1;
		pnlAltaCli.add(txtNumRef, gbc_txtDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		pnlAltaCli.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		pnlAltaCli.add(txtNombre, gbc_txtNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.fill = GridBagConstraints.VERTICAL;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		pnlAltaCli.add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridwidth = 2;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 3;
		pnlAltaCli.add(txtPrecio, gbc_txtApellido);
		
		JLabel lblDescripcion = new JLabel("Decripci\u00F3n");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.fill = GridBagConstraints.VERTICAL;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		pnlAltaCli.add(lblDescripcion, gbc_lblDescripcion);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 4;
		pnlAltaCli.add(scrollPane, gbc_scrollPane);
		
		textDescripcion = new JTextArea();
		scrollPane.setViewportView(textDescripcion);
		
		btnDarAlta = new JButton("Dar Alta");
		GridBagConstraints gbc_btnDarAlta = new GridBagConstraints();
		gbc_btnDarAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarAlta.gridx = 2;
		gbc_btnDarAlta.gridy = 5;
		pnlAltaCli.add(btnDarAlta, gbc_btnDarAlta);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 5;
		pnlAltaCli.add(btnCancelar, gbc_btnCancelar);
		
		textAnomalia = new JTextField();
		textAnomalia.setEditable(false);
		GridBagConstraints gbc_textAnomalia = new GridBagConstraints();
		gbc_textAnomalia.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAnomalia.gridwidth = 3;
		gbc_textAnomalia.insets = new Insets(0, 0, 0, 5);
		gbc_textAnomalia.gridx = 1;
		gbc_textAnomalia.gridy = 6;
		pnlAltaCli.add(textAnomalia, gbc_textAnomalia);
		textAnomalia.setColumns(10);

	}
}
