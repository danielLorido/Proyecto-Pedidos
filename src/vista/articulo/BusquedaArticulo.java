package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class BusquedaArticulo extends JPanel {

	/**
	 * Create the panel.
	 */
	public BusquedaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlBusquedaArt = new JPanel();
		GridBagConstraints gbc_pnlBusquedaArt = new GridBagConstraints();
		gbc_pnlBusquedaArt.fill = GridBagConstraints.BOTH;
		gbc_pnlBusquedaArt.gridx = 0;
		gbc_pnlBusquedaArt.gridy = 0;
		add(pnlBusquedaArt, gbc_pnlBusquedaArt);

	}

}
