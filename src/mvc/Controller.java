package mvc;

import java.awt.event.*;

public class Controller implements ActionListener {
	public Model model;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("Add thread")) {
			model.status=model.addThread();
		}
		if (e.getActionCommand().equalsIgnoreCase("Stop all")) {
			model.status=model.stopAll();
		}
	}
}
