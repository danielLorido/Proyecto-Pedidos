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
	protected JLabel lblTotal;
	protected JButton btnAnadir;
	protected JButton btnEliminar;
	protected JButton btnNewButton;
	protected JButton btnCancelarPedido;
	protected JComboBox comboArticulo;

	public AltaPedido() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 2.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblIdpedido = new JLabel("IdPedido");
		GridBagConstraints gbc_lblIdpedido = new GridBagConstraints();
		gbc_lblIdpedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdpedido.gridx = 4;
		gbc_lblIdpedido.gridy = 1;
		add(lblIdpedido, gbc_lblIdpedido);

		JLabel lblSeleccioneUnCliente = new JLabel("Seleccione un cliente");
		GridBagConstraints gbc_lblSeleccioneUnCliente = new GridBagConstraints();
		gbc_lblSeleccioneUnCliente.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccioneUnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneUnCliente.gridx = 1;
		gbc_lblSeleccioneUnCliente.gridy = 2;
		add(lblSeleccioneUnCliente, gbc_lblSeleccioneUnCliente);

		comboCliente = new JComboBox();
		GridBagConstraints gbc_comboCliente = new GridBagConstraints();
		gbc_comboCliente.gridwidth = 2;
		gbc_comboCliente.insets = new Insets(0, 0, 5, 5);
		gbc_comboCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboCliente.gridx = 2;
		gbc_comboCliente.gridy = 2;
		add(comboCliente, gbc_comboCliente);

		textId = new JTextField();
		textId.setEditable(false);
		GridBagConstraints gbc_textId = new GridBagConstraints();
		gbc_textId.fill = GridBagConstraints.HORIZONTAL;
		gbc_textId.insets = new Insets(0, 0, 5, 5);
		gbc_textId.gridx = 4;
		gbc_textId.gridy = 2;
		add(textId, gbc_textId);
		textId.setColumns(10);
		
		btnAnadir = new JButton("Añadir linea");

		
		JLabel lblSeleccioneUnArticulo = new JLabel("Seleccione un Articulo");
		GridBagConstraints gbc_lblSeleccioneUnArticulo = new GridBagConstraints();
		gbc_lblSeleccioneUnArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccioneUnArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneUnArticulo.gridx = 1;
		gbc_lblSeleccioneUnArticulo.gridy = 3;
		add(lblSeleccioneUnArticulo, gbc_lblSeleccioneUnArticulo);
		
		comboArticulo = new JComboBox();
		GridBagConstraints gbc_comboArticulo = new GridBagConstraints();
		gbc_comboArticulo.gridwidth = 3;
		gbc_comboArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_comboArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboArticulo.gridx = 2;
		gbc_comboArticulo.gridy = 3;
		add(comboArticulo, gbc_comboArticulo);
		GridBagConstraints gbc_btnAnadir = new GridBagConstraints();
		gbc_btnAnadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadir.gridx = 1;
		gbc_btnAnadir.gridy = 4;
		add(btnAnadir, gbc_btnAnadir);
		
		btnEliminar = new JButton("Eliminar linea");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 4;
		add(btnEliminar, gbc_btnEliminar);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		String[] columnas = { "NumL�nea", "Art�culo", "Cantidad", "Precio" };
		DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0) {
			/**
			 * 
			 */
			protected static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setModel(modeloTabla);

		btnNewButton = new JButton("Realizar Pedido");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		add(btnNewButton, gbc_btnNewButton);

		btnCancelarPedido = new JButton("Cancelar Pedido");
		GridBagConstraints gbc_btnCancelarPedido = new GridBagConstraints();
		gbc_btnCancelarPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelarPedido.gridx = 2;
		gbc_btnCancelarPedido.gridy = 7;
		add(btnCancelarPedido, gbc_btnCancelarPedido);

		JLabel lbl = new JLabel("Total");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 3;
		gbc_lbl.gridy = 7;
		add(lbl, gbc_lbl);

		lblTotal = new JLabel("");
		lblTotal.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 4;
		gbc_lblTotal.gridy = 7;
		add(lblTotal, gbc_lblTotal);

	}

}
