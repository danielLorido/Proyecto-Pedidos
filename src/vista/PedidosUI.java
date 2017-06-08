package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import vista.articulo.PanelArticulo;
import vista.cliente.PanelCliente;
import vista.pedido.PanelPedidos;
import java.awt.Dimension;


public class PedidosUI extends JFrame {
	
	public JPanel pnlArticulos = new PanelArticulo();
	public JPanel pnlClientes = new PanelCliente();
	public JPanel pnlPedidos = new PanelPedidos();

	protected JPanel contentPane;
	protected JButton btnCliente;
	protected JButton btnArticulo;
	protected JButton btnPedidos;
	protected JPanel pnlPrincipal;


	/**
	 * Create the frame.
	 */
	public PedidosUI() {
		setMinimumSize(new Dimension(646, 443));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/iconos/tienda.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 445);
		setTitle("Proyectos Pedidos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		pnlPrincipal = new JPanel();
		contentPane.add(pnlPrincipal, "name_100969206552066");
		GridBagLayout gbl_pnlPrincipal = new GridBagLayout();
		gbl_pnlPrincipal.columnWidths = new int[]{0, 45, 0, 0, 0, 0, 0, 0};
		gbl_pnlPrincipal.rowHeights = new int[]{30, 14, 0, 0};
		gbl_pnlPrincipal.columnWeights = new double[]{1.0, 4.0, 1.0, 4.0, 1.0, 4.0, 1.0, Double.MIN_VALUE};
		gbl_pnlPrincipal.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlPrincipal.setLayout(gbl_pnlPrincipal);
		
		JLabel lblProyectoPedidos = new JLabel("Proyecto Pedidos");
		GridBagConstraints gbc_lblProyectoPedidos = new GridBagConstraints();
		gbc_lblProyectoPedidos.fill = GridBagConstraints.BOTH;
		gbc_lblProyectoPedidos.gridwidth = 5;
		gbc_lblProyectoPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyectoPedidos.gridx = 1;
		gbc_lblProyectoPedidos.gridy = 0;
		pnlPrincipal.add(lblProyectoPedidos, gbc_lblProyectoPedidos);
		lblProyectoPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyectoPedidos.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 23));
		
		btnCliente = new JButton("Cliente");
		GridBagConstraints gbc_btnCliente = new GridBagConstraints();
		gbc_btnCliente.fill = GridBagConstraints.BOTH;
		gbc_btnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnCliente.gridx = 1;
		gbc_btnCliente.gridy = 1;
		pnlPrincipal.add(btnCliente, gbc_btnCliente);
		
		btnArticulo = new JButton("Articulo");
		GridBagConstraints gbc_btnArticulo = new GridBagConstraints();
		gbc_btnArticulo.fill = GridBagConstraints.BOTH;
		gbc_btnArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_btnArticulo.gridx = 3;
		gbc_btnArticulo.gridy = 1;
		pnlPrincipal.add(btnArticulo, gbc_btnArticulo);
		
		btnPedidos = new JButton("Pedidos");
		GridBagConstraints gbc_btnPedidos = new GridBagConstraints();
		gbc_btnPedidos.fill = GridBagConstraints.BOTH;
		gbc_btnPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_btnPedidos.gridx = 5;
		gbc_btnPedidos.gridy = 1;
		pnlPrincipal.add(btnPedidos, gbc_btnPedidos);
		
		JLabel label = new JLabel("Desarrolladores: Albano, Daniel e Ismael");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label.gridwidth = 5;
		gbc_label.gridx = 1;
		gbc_label.gridy = 2;
		pnlPrincipal.add(label, gbc_label);
		
		contentPane.add(pnlArticulos, "articulos");
		contentPane.add(pnlClientes, "clientes");
		contentPane.add(pnlPedidos, "pedidos");
		
	}

}
