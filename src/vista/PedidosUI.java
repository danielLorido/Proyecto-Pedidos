package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;

public class PedidosUI extends JFrame {

	protected JPanel contentPane;
	protected JButton btnCliente;
	protected JButton btnArticulo;
	protected JButton btnPedidos;
	protected JButton btnInicioCli;
	private JLabel lblSecCli;
	protected JTabbedPane tabCli;
	protected JPanel pnlAltaCli;
	protected JPanel pnlConsCli;
	protected JButton btnIconoCli;
	protected JPanel pnlBusCli;
	protected JPanel pnlBajaCli;
	protected JPanel pnlModCli;
	protected JTextField txtOpcionalesCli;
	private JLabel lblDniCliAlt;
	private JLabel lblNombreCliAlt;
	private JLabel lblApellidosCliAlt;
	protected JTextField txtDniCliAlt;
	protected JTextField txtNombreCliAlt;
	protected JTextField txtApellidosCliAlt;
	private JLabel lblDireccionCliAlt;
	protected JTextField txtDireccionCliAlt;
	protected JButton btnAltaCli;
	protected JButton btnCanAltaCli;
	private JLabel lblAltaClientes;
	private JLabel lblConsultaCliente;
	private JLabel lblSeleccioneCliente;
	protected JComboBox comboCliCon;
	private JLabel lblDniCliCon;
	protected JTextField txtDniCliCon;
	private JLabel lblNombreCliCon;
	protected JTextField txtNombreCliCon;
	private JLabel lblApellidosCliCon;
	protected JTextField txtApellidosCliCon;
	private JLabel lblDireccionCliCon;
	protected JTextField txtDireccionCliCon;
	protected JPanel pnlArticulos;
	protected JButton btnInicioArt;
	private JLabel lblSecArt;
	protected JButton btnIconoArt;
	protected JTabbedPane tabArt;
	protected JTextField txtOpcionalesArt;
	protected JPanel pnlPedidos;
	protected JButton btnInicioPed;
	private JLabel lblSecPed;
	protected JButton btnIconoPed;
	protected JTabbedPane tabPed;
	protected JTextField txtOpcionalesPed;
	protected JPanel pnlAltaArt;
	protected JPanel pnlConsArt;
	protected JPanel pnlBusArt;
	protected JPanel pnlBajaArt;
	protected JPanel pnlModArt;
	protected JPanel pnlPrincipal;
	protected JPanel pnlClientes;


	/**
	 * Create the frame.
	 */
	public PedidosUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 442);
		setTitle("Proyectos Pedidos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		pnlPrincipal = new JPanel();
		contentPane.add(pnlPrincipal, "name_100969206552066");
		GridBagLayout gbl_pnlPrincipal = new GridBagLayout();
		gbl_pnlPrincipal.columnWidths = new int[]{45, 0, 0, 0};
		gbl_pnlPrincipal.rowHeights = new int[]{30, 14, 0, 0};
		gbl_pnlPrincipal.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlPrincipal.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlPrincipal.setLayout(gbl_pnlPrincipal);
		
		JLabel lblProyectoPedidos = new JLabel("Proyecto Pedidos");
		GridBagConstraints gbc_lblProyectoPedidos = new GridBagConstraints();
		gbc_lblProyectoPedidos.fill = GridBagConstraints.BOTH;
		gbc_lblProyectoPedidos.gridwidth = 3;
		gbc_lblProyectoPedidos.insets = new Insets(0, 0, 5, 0);
		gbc_lblProyectoPedidos.gridx = 0;
		gbc_lblProyectoPedidos.gridy = 0;
		pnlPrincipal.add(lblProyectoPedidos, gbc_lblProyectoPedidos);
		lblProyectoPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyectoPedidos.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 23));
		
		btnCliente = new JButton("Cliente");
		GridBagConstraints gbc_btnCliente = new GridBagConstraints();
		gbc_btnCliente.fill = GridBagConstraints.BOTH;
		gbc_btnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnCliente.gridx = 0;
		gbc_btnCliente.gridy = 1;
		pnlPrincipal.add(btnCliente, gbc_btnCliente);
		
		btnArticulo = new JButton("Articulo");
		GridBagConstraints gbc_btnArticulo = new GridBagConstraints();
		gbc_btnArticulo.fill = GridBagConstraints.BOTH;
		gbc_btnArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_btnArticulo.gridx = 1;
		gbc_btnArticulo.gridy = 1;
		pnlPrincipal.add(btnArticulo, gbc_btnArticulo);
		
		btnPedidos = new JButton("Pedidos");
		GridBagConstraints gbc_btnPedidos = new GridBagConstraints();
		gbc_btnPedidos.fill = GridBagConstraints.BOTH;
		gbc_btnPedidos.insets = new Insets(0, 0, 5, 0);
		gbc_btnPedidos.gridx = 2;
		gbc_btnPedidos.gridy = 1;
		pnlPrincipal.add(btnPedidos, gbc_btnPedidos);
		
		JLabel label = new JLabel("Desarrolladores: Albano, Daniel e Ismael");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label.gridwidth = 3;
		gbc_label.gridx = 0;
		gbc_label.gridy = 2;
		pnlPrincipal.add(label, gbc_label);
		
		pnlClientes = new JPanel();
		contentPane.add(pnlClientes, "name_101378537074080");
		GridBagLayout gbl_pnlClientes = new GridBagLayout();
		gbl_pnlClientes.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlClientes.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlClientes.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlClientes.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlClientes.setLayout(gbl_pnlClientes);
		
		btnInicioCli = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioCli = new GridBagConstraints();
		gbc_btnInicioCli.gridheight = 2;
		gbc_btnInicioCli.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioCli.gridx = 0;
		gbc_btnInicioCli.gridy = 0;
		pnlClientes.add(btnInicioCli, gbc_btnInicioCli);
		
		lblSecCli = new JLabel("Secci\u00F3n Clientes");
		GridBagConstraints gbc_lblSecCli = new GridBagConstraints();
		gbc_lblSecCli.gridheight = 2;
		gbc_lblSecCli.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecCli.gridx = 1;
		gbc_lblSecCli.gridy = 0;
		pnlClientes.add(lblSecCli, gbc_lblSecCli);
		
		btnIconoCli = new JButton("Icono");
		GridBagConstraints gbc_btnIconoCli = new GridBagConstraints();
		gbc_btnIconoCli.gridheight = 2;
		gbc_btnIconoCli.insets = new Insets(0, 0, 5, 0);
		gbc_btnIconoCli.gridx = 2;
		gbc_btnIconoCli.gridy = 0;
		pnlClientes.add(btnIconoCli, gbc_btnIconoCli);
		
		tabCli = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabCli = new GridBagConstraints();
		gbc_tabCli.gridwidth = 3;
		gbc_tabCli.insets = new Insets(0, 0, 5, 0);
		gbc_tabCli.fill = GridBagConstraints.BOTH;
		gbc_tabCli.gridx = 0;
		gbc_tabCli.gridy = 2;
		pnlClientes.add(tabCli, gbc_tabCli);
		
		pnlAltaCli = new JPanel();
		pnlAltaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlAltaCli.setBackground(SystemColor.window);
		tabCli.addTab("Alta", null, pnlAltaCli, null);
		GridBagLayout gbl_pnlAltaCli = new GridBagLayout();
		gbl_pnlAltaCli.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlAltaCli.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlAltaCli.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAltaCli.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlAltaCli.setLayout(gbl_pnlAltaCli);
		
		lblAltaClientes = new JLabel("Alta Clientes");
		GridBagConstraints gbc_lblAltaClientes = new GridBagConstraints();
		gbc_lblAltaClientes.fill = GridBagConstraints.VERTICAL;
		gbc_lblAltaClientes.gridwidth = 2;
		gbc_lblAltaClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaClientes.gridx = 2;
		gbc_lblAltaClientes.gridy = 0;
		pnlAltaCli.add(lblAltaClientes, gbc_lblAltaClientes);
		
		lblDniCliAlt = new JLabel("DNI");
		GridBagConstraints gbc_lblDniCliAlt = new GridBagConstraints();
		gbc_lblDniCliAlt.fill = GridBagConstraints.VERTICAL;
		gbc_lblDniCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniCliAlt.gridx = 1;
		gbc_lblDniCliAlt.gridy = 1;
		pnlAltaCli.add(lblDniCliAlt, gbc_lblDniCliAlt);
		
		txtDniCliAlt = new JTextField();
		GridBagConstraints gbc_txtDniCliAlt = new GridBagConstraints();
		gbc_txtDniCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_txtDniCliAlt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDniCliAlt.gridx = 2;
		gbc_txtDniCliAlt.gridy = 1;
		pnlAltaCli.add(txtDniCliAlt, gbc_txtDniCliAlt);
		txtDniCliAlt.setColumns(10);
		
		lblNombreCliAlt = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreCliAlt = new GridBagConstraints();
		gbc_lblNombreCliAlt.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCliAlt.gridx = 1;
		gbc_lblNombreCliAlt.gridy = 2;
		pnlAltaCli.add(lblNombreCliAlt, gbc_lblNombreCliAlt);
		
		txtNombreCliAlt = new JTextField();
		GridBagConstraints gbc_txtNombreCliAlt = new GridBagConstraints();
		gbc_txtNombreCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreCliAlt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreCliAlt.gridx = 2;
		gbc_txtNombreCliAlt.gridy = 2;
		pnlAltaCli.add(txtNombreCliAlt, gbc_txtNombreCliAlt);
		txtNombreCliAlt.setColumns(10);
		
		lblApellidosCliAlt = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidosCliAlt = new GridBagConstraints();
		gbc_lblApellidosCliAlt.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellidosCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosCliAlt.gridx = 1;
		gbc_lblApellidosCliAlt.gridy = 3;
		pnlAltaCli.add(lblApellidosCliAlt, gbc_lblApellidosCliAlt);
		
		txtApellidosCliAlt = new JTextField();
		GridBagConstraints gbc_txtApellidosCliAlt = new GridBagConstraints();
		gbc_txtApellidosCliAlt.gridwidth = 2;
		gbc_txtApellidosCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidosCliAlt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidosCliAlt.gridx = 2;
		gbc_txtApellidosCliAlt.gridy = 3;
		pnlAltaCli.add(txtApellidosCliAlt, gbc_txtApellidosCliAlt);
		txtApellidosCliAlt.setColumns(10);
		
		lblDireccionCliAlt = new JLabel("Direcci\u00F3n");
		GridBagConstraints gbc_lblDireccionCliAlt = new GridBagConstraints();
		gbc_lblDireccionCliAlt.fill = GridBagConstraints.VERTICAL;
		gbc_lblDireccionCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccionCliAlt.gridx = 1;
		gbc_lblDireccionCliAlt.gridy = 4;
		pnlAltaCli.add(lblDireccionCliAlt, gbc_lblDireccionCliAlt);
		
		txtDireccionCliAlt = new JTextField();
		GridBagConstraints gbc_txtDireccionCliAlt = new GridBagConstraints();
		gbc_txtDireccionCliAlt.gridwidth = 2;
		gbc_txtDireccionCliAlt.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccionCliAlt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccionCliAlt.gridx = 2;
		gbc_txtDireccionCliAlt.gridy = 4;
		pnlAltaCli.add(txtDireccionCliAlt, gbc_txtDireccionCliAlt);
		txtDireccionCliAlt.setColumns(10);
		
		btnAltaCli = new JButton("Dar Alta");
		GridBagConstraints gbc_btnAltaCli = new GridBagConstraints();
		gbc_btnAltaCli.insets = new Insets(0, 0, 0, 5);
		gbc_btnAltaCli.gridx = 2;
		gbc_btnAltaCli.gridy = 5;
		pnlAltaCli.add(btnAltaCli, gbc_btnAltaCli);
		
		btnCanAltaCli = new JButton("Cancelar");
		GridBagConstraints gbc_btnCanAltaCli = new GridBagConstraints();
		gbc_btnCanAltaCli.insets = new Insets(0, 0, 0, 5);
		gbc_btnCanAltaCli.gridx = 3;
		gbc_btnCanAltaCli.gridy = 5;
		pnlAltaCli.add(btnCanAltaCli, gbc_btnCanAltaCli);
		
		pnlConsCli = new JPanel();
		pnlConsCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlConsCli.setBackground(SystemColor.window);
		tabCli.addTab("Consulta", null, pnlConsCli, null);
		GridBagLayout gbl_pnlConsCli = new GridBagLayout();
		gbl_pnlConsCli.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlConsCli.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlConsCli.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlConsCli.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlConsCli.setLayout(gbl_pnlConsCli);
		
		lblConsultaCliente = new JLabel("Consulta Cliente");
		GridBagConstraints gbc_lblConsultaCliente = new GridBagConstraints();
		gbc_lblConsultaCliente.gridwidth = 6;
		gbc_lblConsultaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_lblConsultaCliente.gridx = 0;
		gbc_lblConsultaCliente.gridy = 0;
		pnlConsCli.add(lblConsultaCliente, gbc_lblConsultaCliente);
		
		lblSeleccioneCliente = new JLabel("Seleccione Cliente");
		GridBagConstraints gbc_lblSeleccioneCliente = new GridBagConstraints();
		gbc_lblSeleccioneCliente.gridwidth = 2;
		gbc_lblSeleccioneCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneCliente.gridx = 1;
		gbc_lblSeleccioneCliente.gridy = 1;
		pnlConsCli.add(lblSeleccioneCliente, gbc_lblSeleccioneCliente);
		
		comboCliCon = new JComboBox();
		GridBagConstraints gbc_comboCliCon = new GridBagConstraints();
		gbc_comboCliCon.gridwidth = 2;
		gbc_comboCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_comboCliCon.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboCliCon.gridx = 3;
		gbc_comboCliCon.gridy = 1;
		pnlConsCli.add(comboCliCon, gbc_comboCliCon);
		
		lblDniCliCon = new JLabel("Dni");
		lblDniCliCon.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblDniCliCon = new GridBagConstraints();
		gbc_lblDniCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniCliCon.gridx = 2;
		gbc_lblDniCliCon.gridy = 3;
		pnlConsCli.add(lblDniCliCon, gbc_lblDniCliCon);
		
		txtDniCliCon = new JTextField();
		txtDniCliCon.setEditable(false);
		GridBagConstraints gbc_txtDniCliCon = new GridBagConstraints();
		gbc_txtDniCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_txtDniCliCon.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDniCliCon.gridx = 4;
		gbc_txtDniCliCon.gridy = 3;
		pnlConsCli.add(txtDniCliCon, gbc_txtDniCliCon);
		txtDniCliCon.setColumns(10);
		
		lblNombreCliCon = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreCliCon = new GridBagConstraints();
		gbc_lblNombreCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCliCon.gridx = 2;
		gbc_lblNombreCliCon.gridy = 4;
		pnlConsCli.add(lblNombreCliCon, gbc_lblNombreCliCon);
		
		txtNombreCliCon = new JTextField();
		txtNombreCliCon.setEditable(false);
		GridBagConstraints gbc_txtNombreCliCon = new GridBagConstraints();
		gbc_txtNombreCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreCliCon.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreCliCon.gridx = 4;
		gbc_txtNombreCliCon.gridy = 4;
		pnlConsCli.add(txtNombreCliCon, gbc_txtNombreCliCon);
		txtNombreCliCon.setColumns(10);
		
		lblApellidosCliCon = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidosCliCon = new GridBagConstraints();
		gbc_lblApellidosCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosCliCon.gridx = 2;
		gbc_lblApellidosCliCon.gridy = 5;
		pnlConsCli.add(lblApellidosCliCon, gbc_lblApellidosCliCon);
		
		txtApellidosCliCon = new JTextField();
		txtApellidosCliCon.setEditable(false);
		GridBagConstraints gbc_txtApellidosCliCon = new GridBagConstraints();
		gbc_txtApellidosCliCon.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidosCliCon.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidosCliCon.gridx = 4;
		gbc_txtApellidosCliCon.gridy = 5;
		pnlConsCli.add(txtApellidosCliCon, gbc_txtApellidosCliCon);
		txtApellidosCliCon.setColumns(10);
		
		lblDireccionCliCon = new JLabel("Direcci\u00F3n");
		GridBagConstraints gbc_lblDireccionCliCon = new GridBagConstraints();
		gbc_lblDireccionCliCon.insets = new Insets(0, 0, 0, 5);
		gbc_lblDireccionCliCon.gridx = 2;
		gbc_lblDireccionCliCon.gridy = 6;
		pnlConsCli.add(lblDireccionCliCon, gbc_lblDireccionCliCon);
		
		txtDireccionCliCon = new JTextField();
		txtDireccionCliCon.setEditable(false);
		GridBagConstraints gbc_txtDireccionCliCon = new GridBagConstraints();
		gbc_txtDireccionCliCon.insets = new Insets(0, 0, 0, 5);
		gbc_txtDireccionCliCon.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccionCliCon.gridx = 4;
		gbc_txtDireccionCliCon.gridy = 6;
		pnlConsCli.add(txtDireccionCliCon, gbc_txtDireccionCliCon);
		txtDireccionCliCon.setColumns(10);
		
		pnlBusCli = new JPanel();
		pnlBusCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlBusCli.setBackground(SystemColor.window);
		tabCli.addTab("Busqueda", null, pnlBusCli, null);
		
		pnlBajaCli = new JPanel();
		pnlBajaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlBajaCli.setBackground(SystemColor.window);
		tabCli.addTab("Baja", null, pnlBajaCli, null);
		
		pnlModCli = new JPanel();
		pnlModCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlModCli.setBackground(SystemColor.window);
		tabCli.addTab("Modificar", null, pnlModCli, null);
		
		txtOpcionalesCli = new JTextField();
		txtOpcionalesCli.setEditable(false);
		GridBagConstraints gbc_txtOpcionalesCli = new GridBagConstraints();
		gbc_txtOpcionalesCli.insets = new Insets(0, 0, 0, 5);
		gbc_txtOpcionalesCli.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesCli.gridx = 1;
		gbc_txtOpcionalesCli.gridy = 3;
		pnlClientes.add(txtOpcionalesCli, gbc_txtOpcionalesCli);
		txtOpcionalesCli.setColumns(10);
		
		pnlArticulos = new JPanel();
		contentPane.add(pnlArticulos, "name_105444577216143");
		GridBagLayout gbl_pnlArticulos = new GridBagLayout();
		gbl_pnlArticulos.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlArticulos.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlArticulos.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlArticulos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlArticulos.setLayout(gbl_pnlArticulos);
		
		btnInicioArt = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioArt = new GridBagConstraints();
		gbc_btnInicioArt.gridheight = 2;
		gbc_btnInicioArt.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioArt.gridx = 0;
		gbc_btnInicioArt.gridy = 0;
		pnlArticulos.add(btnInicioArt, gbc_btnInicioArt);
		
		lblSecArt = new JLabel("Secci\u00F3n Articulos");
		GridBagConstraints gbc_lblSecArt = new GridBagConstraints();
		gbc_lblSecArt.gridheight = 2;
		gbc_lblSecArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecArt.gridx = 1;
		gbc_lblSecArt.gridy = 0;
		pnlArticulos.add(lblSecArt, gbc_lblSecArt);
		
		btnIconoArt = new JButton("Icono");
		GridBagConstraints gbc_btnIconoArt = new GridBagConstraints();
		gbc_btnIconoArt.gridheight = 2;
		gbc_btnIconoArt.insets = new Insets(0, 0, 5, 0);
		gbc_btnIconoArt.gridx = 2;
		gbc_btnIconoArt.gridy = 0;
		pnlArticulos.add(btnIconoArt, gbc_btnIconoArt);
		
		tabArt = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabArt = new GridBagConstraints();
		gbc_tabArt.fill = GridBagConstraints.BOTH;
		gbc_tabArt.gridwidth = 3;
		gbc_tabArt.insets = new Insets(0, 0, 5, 0);
		gbc_tabArt.gridx = 0;
		gbc_tabArt.gridy = 2;
		pnlArticulos.add(tabArt, gbc_tabArt);
		
		pnlAltaArt = new JPanel();
		tabArt.addTab("Alta", null, pnlAltaArt, null);
		
		pnlConsArt = new JPanel();
		tabArt.addTab("Consulta", null, pnlConsArt, null);
		
		pnlBusArt = new JPanel();
		tabArt.addTab("Busqueda", null, pnlBusArt, null);
		
		pnlBajaArt = new JPanel();
		tabArt.addTab("Baja", null, pnlBajaArt, null);
		
		pnlModArt = new JPanel();
		tabArt.addTab("Modificar", null, pnlModArt, null);
		
		txtOpcionalesArt = new JTextField();
		txtOpcionalesArt.setEditable(false);
		txtOpcionalesArt.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesArt = new GridBagConstraints();
		gbc_txtOpcionalesArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesArt.insets = new Insets(0, 0, 0, 5);
		gbc_txtOpcionalesArt.gridx = 1;
		gbc_txtOpcionalesArt.gridy = 3;
		pnlArticulos.add(txtOpcionalesArt, gbc_txtOpcionalesArt);
		
		pnlPedidos = new JPanel();
		contentPane.add(pnlPedidos, "name_105669309008749");
		GridBagLayout gbl_pnlPedidos = new GridBagLayout();
		gbl_pnlPedidos.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlPedidos.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlPedidos.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPedidos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlPedidos.setLayout(gbl_pnlPedidos);
		
		btnInicioPed = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicioPed = new GridBagConstraints();
		gbc_btnInicioPed.gridheight = 2;
		gbc_btnInicioPed.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioPed.gridx = 0;
		gbc_btnInicioPed.gridy = 0;
		pnlPedidos.add(btnInicioPed, gbc_btnInicioPed);
		
		lblSecPed = new JLabel("Secci\u00F3n Pedidos");
		GridBagConstraints gbc_lblSecPed = new GridBagConstraints();
		gbc_lblSecPed.gridheight = 2;
		gbc_lblSecPed.insets = new Insets(0, 0, 5, 5);
		gbc_lblSecPed.gridx = 1;
		gbc_lblSecPed.gridy = 0;
		pnlPedidos.add(lblSecPed, gbc_lblSecPed);
		
		btnIconoPed = new JButton("Icono");
		GridBagConstraints gbc_btnIconoPed = new GridBagConstraints();
		gbc_btnIconoPed.gridheight = 2;
		gbc_btnIconoPed.insets = new Insets(0, 0, 5, 0);
		gbc_btnIconoPed.gridx = 2;
		gbc_btnIconoPed.gridy = 0;
		pnlPedidos.add(btnIconoPed, gbc_btnIconoPed);
		
		tabPed = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabPed = new GridBagConstraints();
		gbc_tabPed.fill = GridBagConstraints.BOTH;
		gbc_tabPed.gridwidth = 3;
		gbc_tabPed.insets = new Insets(0, 0, 5, 0);
		gbc_tabPed.gridx = 0;
		gbc_tabPed.gridy = 2;
		pnlPedidos.add(tabPed, gbc_tabPed);
		
		txtOpcionalesPed = new JTextField();
		txtOpcionalesPed.setEditable(false);
		txtOpcionalesPed.setColumns(10);
		GridBagConstraints gbc_txtOpcionalesPed = new GridBagConstraints();
		gbc_txtOpcionalesPed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionalesPed.insets = new Insets(0, 0, 0, 5);
		gbc_txtOpcionalesPed.gridx = 1;
		gbc_txtOpcionalesPed.gridy = 3;
		pnlPedidos.add(txtOpcionalesPed, gbc_txtOpcionalesPed);
	}

}
