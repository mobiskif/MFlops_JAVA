package comp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class myJButton extends JButton implements Runnable {
	private static final long serialVersionUID = 1L;
	public float value;

	public myJButton() {
		super();
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	@Override
	public void run() {
		while (isVisible()) {
			float X = 0.0F;
			long t1 = System.currentTimeMillis();
			for (long i = 0; i <= 100e6F; i++) {
				X = i*1.0F;
			}
			long t2 = System.currentTimeMillis();
			float time=  (t2-t1)/1000F;
			value = (float) (1e-6 * X/time);
			String s = String.format("%.0f", value) + "  " + String.format("%.2f", time) + " сек";
			setText(s);
			try {Thread.sleep(2000);} 
			catch (InterruptedException e) {}
		}
		value = 0;
	}

}
