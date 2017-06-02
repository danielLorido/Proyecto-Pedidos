package vista.cliente;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AltaCliente extends JPanel {
	
	protected JTextField txtDni;
	protected JTextField txtNombre;
	protected JTextField txtApellido;
	protected JTextField txtDireccion;
	protected JButton btnDarAlta;
	protected JButton btnCancelar;
	protected JTextField txtOpcionalesCli;

	/**
	 * Create the panel.
	 */
	public AltaCliente() {
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
		gbl_pnlAltaCli.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlAltaCli.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAltaCli.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlAltaCli.setLayout(gbl_pnlAltaCli);
		
		JLabel lblAlta = new JLabel("Alta Clientes");
		GridBagConstraints gbc_lblAlta = new GridBagConstraints();
		gbc_lblAlta.fill = GridBagConstraints.VERTICAL;
		gbc_lblAlta.gridwidth = 2;
		gbc_lblAlta.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlta.gridx = 2;
		gbc_lblAlta.gridy = 0;
		pnlAltaCli.add(lblAlta, gbc_lblAlta);
		
		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.fill = GridBagConstraints.VERTICAL;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 1;
		pnlAltaCli.add(lblDni, gbc_lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 1;
		pnlAltaCli.add(txtDni, gbc_txtDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
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
		
		JLabel lblApellido = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 1;
		gbc_lblApellido.gridy = 3;
		pnlAltaCli.add(lblApellido, gbc_lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridwidth = 2;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 3;
		pnlAltaCli.add(txtApellido, gbc_txtApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.fill = GridBagConstraints.VERTICAL;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 4;
		pnlAltaCli.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridwidth = 2;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.gridx = 2;
		gbc_txtDireccion.gridy = 4;
		pnlAltaCli.add(txtDireccion, gbc_txtDireccion);
		
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
		
		txtOpcionalesCli = new JTextField();
		txtOpcionalesCli.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtOpcionalesCli.setHorizontalAlignment(SwingConstants.CENTER);
		txtOpcionalesCli.setEditable(false);
		GridBagConstraints gbc_txtOpcionalesCli = new GridBagConstraints();
		gbc_txtOpcionalesCli.gridwidth = 3;
		gbc_txtOpcionalesCli.insets = new Insets(0, 0, 0, 5);
		gbc_txtOpcionalesCli.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesCli.gridx = 1;
		gbc_txtOpcionalesCli.gridy = 6;
		pnlAltaCli.add(txtOpcionalesCli, gbc_txtOpcionalesCli);
		txtOpcionalesCli.setColumns(10);

	}

}
