package vista.cliente;

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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class ConsultaCliente extends JPanel {
	protected JTextField txtDni;
	protected JTextField txtNombre;
	protected JTextField txtApellido;
	protected JTextField txtDireccion;
	protected JComboBox comboBox;

	/**
	 * Create the panel.
	 */
	public ConsultaCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlConsultaCli = new JPanel();
		pnlConsultaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlConsultaCli.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlConsultaCli = new GridBagConstraints();
		gbc_pnlConsultaCli.fill = GridBagConstraints.BOTH;
		gbc_pnlConsultaCli.gridx = 0;
		gbc_pnlConsultaCli.gridy = 0;
		add(pnlConsultaCli, gbc_pnlConsultaCli);
		GridBagLayout gbl_pnlConsultaCli = new GridBagLayout();
		gbl_pnlConsultaCli.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlConsultaCli.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlConsultaCli.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlConsultaCli.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlConsultaCli.setLayout(gbl_pnlConsultaCli);
		
		JLabel lblConsulta = new JLabel("Consulta Cliente");
		GridBagConstraints gbc_lblConsulta = new GridBagConstraints();
		gbc_lblConsulta.gridwidth = 8;
		gbc_lblConsulta.insets = new Insets(0, 0, 5, 0);
		gbc_lblConsulta.gridx = 0;
		gbc_lblConsulta.gridy = 0;
		pnlConsultaCli.add(lblConsulta, gbc_lblConsulta);
		
		JLabel lblSeleccion = new JLabel("Seleccione Cliente");
		GridBagConstraints gbc_lblSeleccion = new GridBagConstraints();
		gbc_lblSeleccion.gridwidth = 2;
		gbc_lblSeleccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccion.gridx = 1;
		gbc_lblSeleccion.gridy = 1;
		pnlConsultaCli.add(lblSeleccion, gbc_lblSeleccion);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 1;
		pnlConsultaCli.add(comboBox, gbc_comboBox);
		ImageIcon iconoBtn = new ImageIcon("/iconos/lupa.png");
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 2;
		gbc_lblDni.gridy = 3;
		pnlConsultaCli.add(lblDni, gbc_lblDni);
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setColumns(10);
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.gridwidth = 3;
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.gridx = 3;
		gbc_txtDni.gridy = 3;
		pnlConsultaCli.add(txtDni, gbc_txtDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 4;
		pnlConsultaCli.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 3;
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 4;
		pnlConsultaCli.add(txtNombre, gbc_txtNombre);
		
		JLabel lblApellido = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 2;
		gbc_lblApellido.gridy = 5;
		pnlConsultaCli.add(lblApellido, gbc_lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.gridwidth = 4;
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.gridx = 3;
		gbc_txtApellido.gridy = 5;
		pnlConsultaCli.add(txtApellido, gbc_txtApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 2;
		gbc_lblDireccion.gridy = 6;
		pnlConsultaCli.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.gridwidth = 4;
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.gridx = 3;
		gbc_txtDireccion.gridy = 6;
		pnlConsultaCli.add(txtDireccion, gbc_txtDireccion);

	}

}
