package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class PanelArticulo extends JPanel {
	private JTextField txtOpcionales;

	/**
	 * Create the panel.
	 */
	public PanelArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {556, 0};
		gridBagLayout.rowHeights = new int[] {401, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEspacioArri = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioArri = new GridBagConstraints();
		gbc_lblEspacioArri.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioArri.gridx = 2;
		gbc_lblEspacioArri.gridy = 0;
		panel.add(lblEspacioArri, gbc_lblEspacioArri);
		
		JButton btnInicio = new JButton("<- Inicio");
		GridBagConstraints gbc_btnInicio = new GridBagConstraints();
		gbc_btnInicio.gridheight = 2;
		gbc_btnInicio.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicio.gridx = 1;
		gbc_btnInicio.gridy = 1;
		panel.add(btnInicio, gbc_btnInicio);
		
		JLabel lblSeccion = new JLabel("Secci\u00F3n Articulos");
		GridBagConstraints gbc_lblSeccion = new GridBagConstraints();
		gbc_lblSeccion.gridheight = 2;
		gbc_lblSeccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeccion.gridx = 2;
		gbc_lblSeccion.gridy = 1;
		panel.add(lblSeccion, gbc_lblSeccion);
		
		JButton btnIcono = new JButton("Icono");
		GridBagConstraints gbc_btnIcono = new GridBagConstraints();
		gbc_btnIcono.gridheight = 2;
		gbc_btnIcono.insets = new Insets(0, 0, 5, 5);
		gbc_btnIcono.gridx = 3;
		gbc_btnIcono.gridy = 1;
		panel.add(btnIcono, gbc_btnIcono);
		
		JLabel lblEspacioDer = new JLabel("        ");
		GridBagConstraints gbc_lblEspacioDer = new GridBagConstraints();
		gbc_lblEspacioDer.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioDer.gridx = 0;
		gbc_lblEspacioDer.gridy = 3;
		panel.add(lblEspacioDer, gbc_lblEspacioDer);
		
		JTabbedPane tabArt = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabArt = new GridBagConstraints();
		gbc_tabArt.fill = GridBagConstraints.BOTH;
		gbc_tabArt.gridwidth = 3;
		gbc_tabArt.insets = new Insets(0, 0, 5, 5);
		gbc_tabArt.gridx = 1;
		gbc_tabArt.gridy = 3;
		panel.add(tabArt, gbc_tabArt);
		
		JLabel lblEspacioIzq = new JLabel("        ");
		GridBagConstraints gbc_lblEspacioIzq = new GridBagConstraints();
		gbc_lblEspacioIzq.insets = new Insets(0, 0, 5, 0);
		gbc_lblEspacioIzq.gridx = 4;
		gbc_lblEspacioIzq.gridy = 3;
		panel.add(lblEspacioIzq, gbc_lblEspacioIzq);
		
		JLabel lblEspacioMed = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioMed = new GridBagConstraints();
		gbc_lblEspacioMed.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacioMed.gridx = 2;
		gbc_lblEspacioMed.gridy = 4;
		panel.add(lblEspacioMed, gbc_lblEspacioMed);
		
		txtOpcionales = new JTextField();
		txtOpcionales.setEditable(false);
		txtOpcionales.setColumns(10);
		GridBagConstraints gbc_txtOpcionales = new GridBagConstraints();
		gbc_txtOpcionales.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOpcionales.insets = new Insets(0, 0, 5, 5);
		gbc_txtOpcionales.gridx = 2;
		gbc_txtOpcionales.gridy = 5;
		panel.add(txtOpcionales, gbc_txtOpcionales);
		
		JLabel lblEspacioAba = new JLabel(" ");
		GridBagConstraints gbc_lblEspacioAba = new GridBagConstraints();
		gbc_lblEspacioAba.insets = new Insets(0, 0, 0, 5);
		gbc_lblEspacioAba.gridx = 2;
		gbc_lblEspacioAba.gridy = 6;
		panel.add(lblEspacioAba, gbc_lblEspacioAba);

	}

}
