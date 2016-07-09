package mvc;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;

import comp.MedRoot;
import comp.myJTree;

import java.awt.*;

public class View extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel label = new JLabel("MFLOPS");
	public JLabel status = new JLabel(" ");
	public JPanel panel = new JPanel();
	public Model model;

	public View(Model model) {
		model.view = this;
		this.model = model;
		GridLayout gl_toolBar = new GridLayout();
		gl_toolBar.setColumns(1);
		gl_toolBar.setRows(0);
		JPanel toolBar = new JPanel(gl_toolBar);

		JButton btn1 = new JButton("Add thread");
		btn1.addActionListener(model.controller);
		toolBar.add(btn1);
		JButton btn2 = new JButton("Stop all");
		btn2.addActionListener(model.controller);
		setLayout(new BorderLayout(0, 0));
		toolBar.add(btn2);
		add(toolBar, BorderLayout.WEST);

		JPanel panel_0 = new JPanel();
		add(panel_0);
		panel_0.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_0.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("SansSerif", Font.PLAIN, 22));

		status.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(status, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		panel_0.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		FlowLayout fl_panel_3 = (FlowLayout) panel_3.getLayout();
		fl_panel_3.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_3, BorderLayout.WEST);

		JTree tree = new myJTree(new MedRoot());
		//JTree tree = new JTree();
		panel_3.add(tree);

		FlowLayout fl_panel = (FlowLayout) panel.getLayout();
		fl_panel.setAlignment(FlowLayout.RIGHT);
		panel_2.add(panel, BorderLayout.CENTER);
		new Thread(model).start();
	}



}
