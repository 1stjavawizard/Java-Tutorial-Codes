import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;

class BinarySearch extends JFrame implements ActionListener{
	JButton add,delete,insert,update;
	JTextField field;
	JTree tree;
	JPanel panel,panel2;
	DefaultMutableTreeNode node,newNode;
	public BinarySearch(){
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400,400));
       add = new JButton("Add");
	    delete = new JButton("Delete");
		 insert = new JButton("Insert");
		  update = new JButton("Update");
		  field = new JTextField(10);
		  node = new DefaultMutableTreeNode("root");
		  add.addActionListener(this);
		  delete.addActionListener(this);
		  insert.addActionListener(this);
		  update.addActionListener(this);
		  panel = new JPanel();
		  panel2 = new JPanel();
		  panel.add(add);
		  panel.add(delete);
		  panel.add(insert);
		  panel.add(update);
		  panel2.add(field);
		  tree = new JTree(node);
		  add(tree);
		  add(panel,BorderLayout.SOUTH);
		  add(panel2,BorderLayout.NORTH);
		setVisible(true);
		pack();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==add){
				//to select a node use this methods,it must be placed on the root;
		 node = (DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
		 Object obj = node.getUserObject();
      newNode = new DefaultMutableTreeNode(field.getText());		 
		node.add(newNode);
		
		DefaultTreeModel model=(DefaultTreeModel)tree.getModel();
		model.reload();
		}
		if(e.getSource()==update){
				
		node = (DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
		// use this method to get the values of the selected node;
		field.setText(node.getUserObject().toString());
         Object n = node.getUserObject();		
	DefaultMutableTreeNode bt = new DefaultMutableTreeNode(n.toString());
	node.add(bt);
			
		/* 	node = (DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
		// use this method to get the values of the selected node;
		Object ob = node.getUserObject();
		newNode1 =new DefaultMutableTreeNode(field.getText());
		//node =;
		mod.insertNodeInto(newNode1,node,node.getChildCount()); */
		}
	}
	public static void main(String[] args){
		new BinarySearch();
	}
}

