package comp;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class MedRoot extends DefaultMutableTreeNode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MedRoot() {
		super(new DefaultMutableTreeNode("Root Node"));
	    DefaultMutableTreeNode LevelOne_NodeOne = new DefaultMutableTreeNode("LevelOne_NodeOne");
		DefaultMutableTreeNode LevelOne_NodeTwo = new DefaultMutableTreeNode("LevelOne_NodeTwo");
		insert(LevelOne_NodeOne, 0);
		insert(LevelOne_NodeTwo, 0);
	    
		LevelOne_NodeOne.insert(new DefaultMutableTreeNode("2x PEMS"), 0);
		LevelOne_NodeOne.insert(new DefaultMutableTreeNode("2x SCREWS"), 0);
		LevelOne_NodeOne.insert(new DefaultMutableTreeNode("2x SCREWS"), 0);

		LevelOne_NodeTwo.insert(new DefaultMutableTreeNode("4x SCREWS"), 0);
		LevelOne_NodeTwo.insert(new DefaultMutableTreeNode("4x HANDLES"), 0);
		LevelOne_NodeTwo.insert(new DefaultMutableTreeNode("4x HANDLES"), 0);
		LevelOne_NodeTwo.insert(new DefaultMutableTreeNode("4x HANDLES"), 0);
		
	}

/*	
	public MedRoot(Object userObject) {
		super(userObject);
		// TODO Auto-generated constructor stub
	}

	public MedRoot(Object userObject, boolean allowsChildren) {
		super(userObject, allowsChildren);
		// TODO Auto-generated constructor stub
	}
*/

}
