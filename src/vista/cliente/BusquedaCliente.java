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

public class BusquedaCliente extends JPanel {
	private JTextField txtInserccion;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;

	/**
	 * Create the panel.
	 */
	public BusquedaCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlBusquedaCli = new JPanel();
		pnlBusquedaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlBusquedaCli.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlBusquedaCli = new GridBagConstraints();
		gbc_pnlBusquedaCli.fill = GridBagConstraints.BOTH;
		gbc_pnlBusquedaCli.gridx = 0;
		gbc_pnlBusquedaCli.gridy = 0;
		add(pnlBusquedaCli, gbc_pnlBusquedaCli);
		GridBagLayout gbl_pnlBusquedaCli = new GridBagLayout();
		gbl_pnlBusquedaCli.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlBusquedaCli.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlBusquedaCli.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlBusquedaCli.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlBusquedaCli.setLayout(gbl_pnlBusquedaCli);
		
		JLabel lblBusquedaClientes = new JLabel("Busqueda Clientes");
		GridBagConstraints gbc_lblBusquedaClientes = new GridBagConstraints();
		gbc_lblBusquedaClientes.gridwidth = 4;
		gbc_lblBusquedaClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusquedaClientes.gridx = 1;
		gbc_lblBusquedaClientes.gridy = 0;
		pnlBusquedaCli.add(lblBusquedaClientes, gbc_lblBusquedaClientes);
		
		JLabel lblInserccion = new JLabel("Inserte un Dni:");
		GridBagConstraints gbc_lblInserccion = new GridBagConstraints();
		gbc_lblInserccion.gridwidth = 2;
		gbc_lblInserccion.anchor = GridBagConstraints.EAST;
		gbc_lblInserccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblInserccion.gridx = 1;
		gbc_lblInserccion.gridy = 1;
		pnlBusquedaCli.add(lblInserccion, gbc_lblInserccion);
		
		txtInserccion = new JTextField();
		GridBagConstraints gbc_txtInserccion = new GridBagConstraints();
		gbc_txtInserccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserccion.gridx = 3;
		gbc_txtInserccion.gridy = 1;
		pnlBusquedaCli.add(txtInserccion, gbc_txtInserccion);
		txtInserccion.setColumns(10);
		
		JButton btnBuscar = new JButton("New button");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.anchor = GridBagConstraints.WEST;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 4;
		gbc_btnBuscar.gridy = 1;
		pnlBusquedaCli.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		pnlBusquedaCli.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 3;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		pnlBusquedaCli.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 3;
		pnlBusquedaCli.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 3;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 2;
		gbc_txtApellidos.gridy = 3;
		pnlBusquedaCli.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 4;
		pnlBusquedaCli.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.gridwidth = 3;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 2;
		gbc_txtDireccion.gridy = 4;
		pnlBusquedaCli.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
	}

}
