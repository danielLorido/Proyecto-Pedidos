package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BusquedaPedido extends JPanel {
	private JTextField txtIdPedido;
	private JTextField txtCliente;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public BusquedaPedido() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 30, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblInserteElIdpedido = new JLabel("Inserte el IdPedido");
		GridBagConstraints gbc_lblInserteElIdpedido = new GridBagConstraints();
		gbc_lblInserteElIdpedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblInserteElIdpedido.anchor = GridBagConstraints.EAST;
		gbc_lblInserteElIdpedido.gridx = 2;
		gbc_lblInserteElIdpedido.gridy = 2;
		add(lblInserteElIdpedido, gbc_lblInserteElIdpedido);
		
		txtIdPedido = new JTextField();
		GridBagConstraints gbc_txtIdPedido = new GridBagConstraints();
		gbc_txtIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdPedido.gridx = 3;
		gbc_txtIdPedido.gridy = 2;
		add(txtIdPedido, gbc_txtIdPedido);
		txtIdPedido.setColumns(10);
		
		JLabel lblIcon = new JLabel("Icon");
		GridBagConstraints gbc_lblIcon = new GridBagConstraints();
		gbc_lblIcon.gridwidth = 3;
		gbc_lblIcon.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcon.gridx = 6;
		gbc_lblIcon.gridy = 2;
		add(lblIcon, gbc_lblIcon);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.EAST;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 3;
		add(lblCliente, gbc_lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		GridBagConstraints gbc_txtCliente = new GridBagConstraints();
		gbc_txtCliente.gridwidth = 6;
		gbc_txtCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCliente.gridx = 3;
		gbc_txtCliente.gridy = 3;
		add(txtCliente, gbc_txtCliente);
		txtCliente.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lbl = new JLabel("Total");
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.gridwidth = 2;
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 4;
		gbc_lbl.gridy = 5;
		add(lbl, gbc_lbl);
		
		JLabel lblTotal = new JLabel("");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.gridwidth = 2;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 7;
		gbc_lblTotal.gridy = 5;
		add(lblTotal, gbc_lblTotal);

	}

}
