package mvc;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JFrame;

import mvc.Controller;
import mvc.View;

public class  Main extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Main() {//throws HeadlessException {
		super();
		this.setLayout( new BorderLayout());
	
		View v = new View (
					new Model (
						new Controller()
					)
				);
		this.add(v);
	}

	public static void main(String[] args) throws IOException {
		JFrame f = new JFrame("\"MFLOPS\" (c) ParkhimovichDL 2016 (" + Runtime.getRuntime().availableProcessors() + " CPU)" );
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		View v = new View (
					new Model(
						new Controller()
					)
				);
		
		f.setBounds(200,200,640, 480);
		f.setVisible(true);
		f.add(v);
	}

}
