package disasterRecovery;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DRRTUI window = new DRRTUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
