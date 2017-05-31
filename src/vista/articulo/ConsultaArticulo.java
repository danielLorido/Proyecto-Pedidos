package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ConsultaArticulo extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlConsultaArt = new JPanel();
		GridBagConstraints gbc_pnlConsultaArt = new GridBagConstraints();
		gbc_pnlConsultaArt.fill = GridBagConstraints.BOTH;
		gbc_pnlConsultaArt.gridx = 0;
		gbc_pnlConsultaArt.gridy = 0;
		add(pnlConsultaArt, gbc_pnlConsultaArt);

	}

}
