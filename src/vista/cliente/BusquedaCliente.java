package vista.cliente;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class BusquedaCliente extends JPanel {

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

	}

}
