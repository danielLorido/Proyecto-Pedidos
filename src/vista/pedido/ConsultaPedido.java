package vista.pedido;

import javax.swing.JPanel;

import modelo.Pedido;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class ConsultaPedido extends JPanel {
	protected JComboBox<Pedido> comboPedido;
	protected JTextField textId;
	protected JTextField textCliente;
	protected JTable table;
	protected JLabel lblTotal;

	/**
	 * Create the panel.
	 */
	public ConsultaPedido() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblSeleccionePedido = new JLabel("Seleccione pedido");
		GridBagConstraints gbc_lblSeleccionePedido = new GridBagConstraints();
		gbc_lblSeleccionePedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionePedido.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccionePedido.gridx = 1;
		gbc_lblSeleccionePedido.gridy = 2;
		add(lblSeleccionePedido, gbc_lblSeleccionePedido);

		comboPedido = new JComboBox();
		GridBagConstraints gbc_comboPedido = new GridBagConstraints();
		gbc_comboPedido.gridwidth = 2;
		gbc_comboPedido.insets = new Insets(0, 0, 5, 5);
		gbc_comboPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboPedido.gridx = 2;
		gbc_comboPedido.gridy = 2;
		add(comboPedido, gbc_comboPedido);
		
		JLabel lblIcono = new JLabel("ICON");
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 4;
		gbc_lblIcono.gridy = 2;
		add(lblIcono, gbc_lblIcono);
		
		JLabel lblIdpedido = new JLabel("IdPedido");
		GridBagConstraints gbc_lblIdpedido = new GridBagConstraints();
		gbc_lblIdpedido.anchor = GridBagConstraints.EAST;
		gbc_lblIdpedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdpedido.gridx = 1;
		gbc_lblIdpedido.gridy = 3;
		add(lblIdpedido, gbc_lblIdpedido);
		
		textId = new JTextField();
		textId.setEditable(false);
		GridBagConstraints gbc_textId = new GridBagConstraints();
		gbc_textId.insets = new Insets(0, 0, 5, 5);
		gbc_textId.fill = GridBagConstraints.HORIZONTAL;
		gbc_textId.gridx = 2;
		gbc_textId.gridy = 3;
		add(textId, gbc_textId);
		textId.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.EAST;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 3;
		gbc_lblCliente.gridy = 3;
		add(lblCliente, gbc_lblCliente);
		
		textCliente = new JTextField();
		textCliente.setEditable(false);
		GridBagConstraints gbc_textCliente = new GridBagConstraints();
		gbc_textCliente.gridwidth = 2;
		gbc_textCliente.insets = new Insets(0, 0, 5, 5);
		gbc_textCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCliente.gridx = 4;
		gbc_textCliente.gridy = 3;
		add(textCliente, gbc_textCliente);
		textCliente.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		String[] columnas = { "NumLínea", "Artículo", "Cantidad", "Precio" };
		DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setModel(modeloTabla);
		
		JLabel lbl = new JLabel("Total");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 4;
		gbc_lbl.gridy = 6;
		add(lbl, gbc_lbl);
		
		lblTotal = new JLabel("");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 5;
		gbc_lblTotal.gridy = 6;
		add(lblTotal, gbc_lblTotal);

	}

}
