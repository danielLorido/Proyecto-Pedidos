package control.comportamiento;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class Principal extends ParaPedidosUI {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
			            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			          } catch (Exception e) {
			            e.printStackTrace();
			          }
					ParaPedidosUI frame = new ParaPedidosUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
