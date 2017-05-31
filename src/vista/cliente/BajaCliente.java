package vista.cliente;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class BajaCliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public BajaCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlBajaCli = new JPanel();
		pnlBajaCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlBajaCli.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlBajaCli = new GridBagConstraints();
		gbc_pnlBajaCli.fill = GridBagConstraints.BOTH;
		gbc_pnlBajaCli.gridx = 0;
		gbc_pnlBajaCli.gridy = 0;
		add(pnlBajaCli, gbc_pnlBajaCli);

	}

}
