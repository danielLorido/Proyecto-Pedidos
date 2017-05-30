package vista.cliente;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ModificacionCliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public ModificacionCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pnlModificacionCli = new JPanel();
		pnlModificacionCli.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlModificacionCli.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnlModificacionCli = new GridBagConstraints();
		gbc_pnlModificacionCli.fill = GridBagConstraints.BOTH;
		gbc_pnlModificacionCli.gridx = 0;
		gbc_pnlModificacionCli.gridy = 0;
		add(pnlModificacionCli, gbc_pnlModificacionCli);

	}

}
