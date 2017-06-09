package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Articulo;
import modelo.Cliente;

import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaPedido extends JPanel {
	protected JTextField textId;
	protected JTable table;
	protected JComboBox<Cliente> comboCliente;

	protected JButton btnAnadir;
	protected JButton btnEliminar;
	protected JButton btnNewButton;
	protected JButton btnCancelarPedido;
	protected JComboBox comboArticulo;
	protected JTextField txtCantidad;
	protected JTextField txtTotal;

	
	public AltaPedido() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 46, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 2.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		
		JLabel lblAltaPedido = new JLabel("Alta Pedido");
		GridBagConstraints gbc_lblAltaPedido = new GridBagConstraints();
		gbc_lblAltaPedido.gridwidth = 8;
		gbc_lblAltaPedido.insets = new Insets(0, 0, 5, 0);
		gbc_lblAltaPedido.gridx = 0;
		gbc_lblAltaPedido.gridy = 0;
		add(lblAltaPedido, gbc_lblAltaPedido);

		JLabel lblSeleccioneUnCliente = new JLabel("Seleccione un cliente");
		GridBagConstraints gbc_lblSeleccioneUnCliente = new GridBagConstraints();
		gbc_lblSeleccioneUnCliente.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccioneUnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneUnCliente.gridx = 1;
		gbc_lblSeleccioneUnCliente.gridy = 1;
		add(lblSeleccioneUnCliente, gbc_lblSeleccioneUnCliente);

		comboCliente = new JComboBox();
		GridBagConstraints gbc_comboCliente = new GridBagConstraints();
		gbc_comboCliente.gridwidth = 2;
		gbc_comboCliente.insets = new Insets(0, 0, 5, 5);
		gbc_comboCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboCliente.gridx = 2;
		gbc_comboCliente.gridy = 1;
		add(comboCliente, gbc_comboCliente);
		

		btnAnadir = new JButton("Añadir linea");
				
						JLabel lblIdpedido = new JLabel("IdPedido");
						GridBagConstraints gbc_lblIdpedido = new GridBagConstraints();
						gbc_lblIdpedido.insets = new Insets(0, 0, 5, 5);
						gbc_lblIdpedido.gridx = 4;
						gbc_lblIdpedido.gridy = 1;
						add(lblIdpedido, gbc_lblIdpedido);
		
				textId = new JTextField();
				textId.setEditable(false);
				GridBagConstraints gbc_textId = new GridBagConstraints();
				gbc_textId.gridwidth = 2;
				gbc_textId.fill = GridBagConstraints.HORIZONTAL;
				gbc_textId.insets = new Insets(0, 0, 5, 5);
				gbc_textId.gridx = 5;
				gbc_textId.gridy = 1;
				add(textId, gbc_textId);
				textId.setColumns(10);
		
		JLabel lblSeleccioneUnArticulo = new JLabel("Seleccione un Articulo");
		GridBagConstraints gbc_lblSeleccioneUnArticulo = new GridBagConstraints();
		gbc_lblSeleccioneUnArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccioneUnArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneUnArticulo.gridx = 1;
		gbc_lblSeleccioneUnArticulo.gridy = 2;
		add(lblSeleccioneUnArticulo, gbc_lblSeleccioneUnArticulo);
		
		comboArticulo = new JComboBox();
		GridBagConstraints gbc_comboArticulo = new GridBagConstraints();
		gbc_comboArticulo.gridwidth = 2;
		gbc_comboArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_comboArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboArticulo.gridx = 2;
		gbc_comboArticulo.gridy = 2;
		add(comboArticulo, gbc_comboArticulo);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.anchor = GridBagConstraints.EAST;
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidad.gridx = 4;
		gbc_lblCantidad.gridy = 2;
		add(lblCantidad, gbc_lblCantidad);
		
		txtCantidad = new JTextField();
		GridBagConstraints gbc_txtCantidad = new GridBagConstraints();
		gbc_txtCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCantidad.gridx = 5;
		gbc_txtCantidad.gridy = 2;
		add(txtCantidad, gbc_txtCantidad);
		txtCantidad.setColumns(10);
		GridBagConstraints gbc_btnAnadir = new GridBagConstraints();
		gbc_btnAnadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadir.gridx = 1;
		gbc_btnAnadir.gridy = 3;
		add(btnAnadir, gbc_btnAnadir);
		
		btnEliminar = new JButton("Eliminar linea");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 3;
		add(btnEliminar, gbc_btnEliminar);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		btnNewButton = new JButton("Realizar Pedido");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		add(btnNewButton, gbc_btnNewButton);

		btnCancelarPedido = new JButton("Cancelar Pedido");
		GridBagConstraints gbc_btnCancelarPedido = new GridBagConstraints();
		gbc_btnCancelarPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelarPedido.gridx = 2;
		gbc_btnCancelarPedido.gridy = 6;
		add(btnCancelarPedido, gbc_btnCancelarPedido);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 4;
		gbc_lblTotal.gridy = 6;
		add(lblTotal, gbc_lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.gridwidth = 2;
		gbc_txtTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridx = 5;
		gbc_txtTotal.gridy = 6;
		add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);

	}
}
