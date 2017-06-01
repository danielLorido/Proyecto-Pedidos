package vista.cliente;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class BajaCliente extends JPanel {
	protected JTextField txtDni;
	protected JTextField txtNombre;
	protected JTextField txtApellido;
	protected JTextField txtDireccion;

	/**
	 * Create the panel.
	 */
	public BajaCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel pnlBajaCli = new JPanel();
		pnlBajaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlBajaCli.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlBajaCli = new GridBagConstraints();
		gbc_pnlBajaCli.fill = GridBagConstraints.BOTH;
		gbc_pnlBajaCli.gridx = 0;
		gbc_pnlBajaCli.gridy = 0;
		add(pnlBajaCli, gbc_pnlBajaCli);
		GridBagLayout gbl_pnlBajaCli = new GridBagLayout();
		gbl_pnlBajaCli.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlBajaCli.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlBajaCli.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlBajaCli.rowWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlBajaCli.setLayout(gbl_pnlBajaCli);

		JLabel lblBaja = new JLabel("Baja Cliente");
		GridBagConstraints gbc_lblBaja = new GridBagConstraints();
		gbc_lblBaja.gridwidth = 6;
		gbc_lblBaja.insets = new Insets(0, 0, 5, 0);
		gbc_lblBaja.gridx = 0;
		gbc_lblBaja.gridy = 0;
		pnlBajaCli.add(lblBaja, gbc_lblBaja);

		JLabel lblSeleccion = new JLabel("Seleccione Cliente");
		GridBagConstraints gbc_lblSeleccion = new GridBagConstraints();
		gbc_lblSeleccion.gridwidth = 2;
		gbc_lblSeleccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccion.gridx = 1;
		gbc_lblSeleccion.gridy = 1;
		pnlBajaCli.add(lblSeleccion, gbc_lblSeleccion);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 1;
		pnlBajaCli.add(comboBox, gbc_comboBox);

		JLabel lblDni = new JLabel("Dni");
		lblDni.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 2;
		gbc_lblDni.gridy = 3;
		pnlBajaCli.add(lblDni, gbc_lblDni);

		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setColumns(10);
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.gridx = 4;
		gbc_txtDni.gridy = 3;
		pnlBajaCli.add(txtDni, gbc_txtDni);

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 4;
		pnlBajaCli.add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 4;
		pnlBajaCli.add(txtNombre, gbc_txtNombre);

		JLabel lblApellido = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 2;
		gbc_lblApellido.gridy = 5;
		pnlBajaCli.add(lblApellido, gbc_lblApellido);

		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.gridx = 4;
		gbc_txtApellido.gridy = 5;
		pnlBajaCli.add(txtApellido, gbc_txtApellido);

		JLabel lblDireccion = new JLabel("Dirección");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 2;
		gbc_lblDireccion.gridy = 6;
		pnlBajaCli.add(lblDireccion, gbc_lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.gridx = 4;
		gbc_txtDireccion.gridy = 6;
		pnlBajaCli.add(txtDireccion, gbc_txtDireccion);
		
		JButton btnBaja = new JButton("Dar de baja");
		btnBaja.setBackground(Color.RED);
		GridBagConstraints gbc_btnBaja = new GridBagConstraints();
		gbc_btnBaja.anchor = GridBagConstraints.WEST;
		gbc_btnBaja.insets = new Insets(0, 0, 0, 5);
		gbc_btnBaja.gridx = 4;
		gbc_btnBaja.gridy = 7;
		pnlBajaCli.add(btnBaja, gbc_btnBaja);
	}
}
