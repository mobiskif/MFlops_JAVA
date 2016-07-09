package comp;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeCellRenderer;

public class myJTree extends javax.swing.JTree {

	public myJTree(MedRoot root) {
		super(root);
		setBackground(UIManager.getColor("Panel.background"));
		setCellRenderer(new MyRenderer());
	}

}

class MyRenderer extends DefaultTreeCellRenderer {
	private static final long serialVersionUID = 1L;
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {

		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		setBackgroundNonSelectionColor(UIManager.getColor("Panel.background"));
		return this;
	}
}
