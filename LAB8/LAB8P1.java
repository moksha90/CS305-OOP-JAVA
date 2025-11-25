import java.awt.*;
import java.awt.event.*;

class LAB8P1 extends Frame implements ActionListener{
	Label label;
	LAB8P1(){
	
	super("Demonstration of MenuBar");
	MenuBar mb = new MenuBar();
	setMenuBar (mb);
	BorderLayout bl = new BorderLayout();
	setLayout(bl);
	
	label = new Label();
	label.setFont(new Font("Arial",Font.BOLD,40));
	label.setAlignment (label.CENTER);
	//label.setBounds(100,100,100,100);
	add(label,bl.CENTER);
	
	Menu file = new Menu("File");
	String[] menus = {"File","Edit","Help"};
	String[][] mi = {
		{"Open","Save","Close"},
		{"Cut","Copy","Paste"},
		{"About","Update","License"},
	};
	int x = 0, y = 0;
	for(String s : menus){
		y=0;
		Menu m = new Menu(s);
		for (int i=0;i<3;i++){
			MenuItem mmi = new MenuItem(mi[x][y]);
			mmi.addActionListener(this);
			m.add(mmi);
			y++;
		  }
		x++;
		mb.add(m);
             }
	
	
	
	setSize(400,400);
	setVisible(true);

	addWindowListener(
	new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
			dispose();
		}	
	});

    
}
public void actionPerformed(ActionEvent ae){
	String mstr = ae.getActionCommand();
	if(mstr.equals("Close")){
		System.exit(0);
	}else{
		label.setText(mstr);
	}
	
	
}
public static void main(String...args){
	new LAB8P1();
}
}
