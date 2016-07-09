package mvc;

import java.awt.Component;
import comp.myJButton;

public class Model implements Runnable {
	public View view;
	public Controller controller;
	public String status;

	public Model(Controller controller) {
		controller.model = this;
		this.controller = controller;
	}

	public String addThread() {
		try {
			myJButton calc = new myJButton();
			new Thread(calc).start();
			view.panel.add(calc);
		} catch (Exception e) {return "Error: addThread() ";}
		return "Success: addThread() ";
	}

	public String stopAll() {
		try {
			for (Component comp : view.panel.getComponents()) {
				comp.setVisible(false);
			}
		} catch (Exception e) {return "Error: stopAll() ";}
		return "Success: stopAll() ";
	}

	@Override
	public void run() {
		String load="";
		while (true) {
			double f = 0.0;
			int i = 0;
			for (Component comp : view.panel.getComponents()) {
				i = comp.isVisible() ? i+1 : i;
				f = comp.getClass().getName().endsWith("myJButton") ? f + ((myJButton)comp).value : f;
			}
			String vsum = String.format("%.2f", f);
			view.label.setText(i+ " threads    " + vsum + " MFlops   " + load);
			view.status.setText(this.status);
			
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {}
		}
	}

}
