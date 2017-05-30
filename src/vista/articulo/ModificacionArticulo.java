package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ModificacionArticulo extends JPanel {

	/**
	 * Create the panel.
	 */
	public ModificacionArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlModificacionArt = new JPanel();
		GridBagConstraints gbc_pnlModificacionArt = new GridBagConstraints();
		gbc_pnlModificacionArt.fill = GridBagConstraints.BOTH;
		gbc_pnlModificacionArt.gridx = 0;
		gbc_pnlModificacionArt.gridy = 0;
		add(pnlModificacionArt, gbc_pnlModificacionArt);

	}

}
