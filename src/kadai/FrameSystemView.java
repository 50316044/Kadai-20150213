package kadai;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import lib.MySQL;



public class FrameSystemView 
extends Frame implements ActionListener,WindowListener

{
	public FrameSystemView(FrameSystemController controller){
		addWindowListener(this);
		setTitle("CDsales");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		int  quantity;
		String cdname;
		ResultSet rs;


		MySQL mysql = new MySQL();
		
		rs = mysql.selectAll();
		try{
		while(rs.next()){

                
                cdname = rs.getString("cdname");
                quantity = rs.getInt("quantity");
                
        		add(new Label("cdname:" + cdname));
        		add(new Label("quantityÅF" + quantity));
                
                
                }
		} catch (SQLException e1) {
			 // TODO Auto-generated catch block
        	e1.printStackTrace();
}



	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);


	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
