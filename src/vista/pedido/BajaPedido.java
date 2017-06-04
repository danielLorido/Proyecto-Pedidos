package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

public class BajaPedido extends JPanel {
	private JTextField txtCliente;
	private JTextField txtId;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public BajaPedido() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblSeleccionePedido = new JLabel("Seleccione Pedido");
		GridBagConstraints gbc_lblSeleccionePedido = new GridBagConstraints();
		gbc_lblSeleccionePedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionePedido.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccionePedido.gridx = 1;
		gbc_lblSeleccionePedido.gridy = 2;
		add(lblSeleccionePedido, gbc_lblSeleccionePedido);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 6;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		JLabel lblIcon = new JLabel("    Icon    ");
		GridBagConstraints gbc_lblIcon = new GridBagConstraints();
		gbc_lblIcon.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcon.gridx = 9;
		gbc_lblIcon.gridy = 2;
		add(lblIcon, gbc_lblIcon);
		
		JLabel lblIdPedido = new JLabel("Id pedido");
		GridBagConstraints gbc_lblIdPedido = new GridBagConstraints();
		gbc_lblIdPedido.anchor = GridBagConstraints.EAST;
		gbc_lblIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdPedido.gridx = 1;
		gbc_lblIdPedido.gridy = 3;
		add(lblIdPedido, gbc_lblIdPedido);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 2;
		gbc_txtId.gridy = 3;
		add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.EAST;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 4;
		gbc_lblCliente.gridy = 3;
		add(lblCliente, gbc_lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		GridBagConstraints gbc_txtCliente = new GridBagConstraints();
		gbc_txtCliente.gridwidth = 5;
		gbc_txtCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCliente.gridx = 5;
		gbc_txtCliente.gridy = 3;
		add(txtCliente, gbc_txtCliente);
		txtCliente.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 9;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnDarDeBaja = new JButton("Dar de Baja");
		GridBagConstraints gbc_btnDarDeBaja = new GridBagConstraints();
		gbc_btnDarDeBaja.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeBaja.gridx = 2;
		gbc_btnDarDeBaja.gridy = 6;
		add(btnDarDeBaja, gbc_btnDarDeBaja);
		
		JLabel lbl = new JLabel("Total");
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.gridwidth = 2;
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 7;
		gbc_lbl.gridy = 6;
		add(lbl, gbc_lbl);
		
		JLabel lblTotal = new JLabel("");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 9;
		gbc_lblTotal.gridy = 6;
		add(lblTotal, gbc_lblTotal);

	}

}
