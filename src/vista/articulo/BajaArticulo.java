package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class BajaArticulo extends JPanel {

	/**
	 * Create the panel.
	 */
	public BajaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlBajaArt = new JPanel();
		GridBagConstraints gbc_pnlBajaArt = new GridBagConstraints();
		gbc_pnlBajaArt.fill = GridBagConstraints.BOTH;
		gbc_pnlBajaArt.gridx = 0;
		gbc_pnlBajaArt.gridy = 0;
		add(pnlBajaArt, gbc_pnlBajaArt);

	}

}
