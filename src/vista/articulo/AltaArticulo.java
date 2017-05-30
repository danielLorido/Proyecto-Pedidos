package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class AltaArticulo extends JPanel {

	/**
	 * Create the panel.
	 */
	public AltaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlAltaArt = new JPanel();
		GridBagConstraints gbc_pnlAltaArt = new GridBagConstraints();
		gbc_pnlAltaArt.fill = GridBagConstraints.BOTH;
		gbc_pnlAltaArt.gridx = 0;
		gbc_pnlAltaArt.gridy = 0;
		add(pnlAltaArt, gbc_pnlAltaArt);

	}

}
