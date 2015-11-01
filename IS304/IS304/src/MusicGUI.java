import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MusicGUI extends JFrame {
	private static JLabel label;
	
	
	public MusicGUI(){
		
		JPanel panel = new JPanel();		
		panel.setVisible(true);
		add(panel);
		
		setLayout(new FlowLayout());
		setSize(800, 600);
		setVisible(true);
		setTitle("Music Digital Download");
		
		//Digital download header
		JLabel label = new JLabel();
		label.setText("Digital Downloads");
		label.setVisible(true);
		label.setLocation(100, 100);
		add(label);	
		
		//Cost per Download lbl
		JLabel lblCost = new JLabel();
		lblCost.setVisible(true);
		lblCost.setText("$0.99 per Download");
		double cost = 0.99;
		
		
		
		//Add Number of Download Fill in Text
		/*final JTextField txtField = new JTextField();
		
		add(txtField);
		txtField.setLayout(getLayout());
		txtField.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				  String text = txtField.getText();
				    
			}
			
		});*/
		
		
		//Total Cost of Downloads
		JLabel lblTotalCost = new JLabel();
		
		//Add Button Calulate Cost
		JButton btnCalculateCost = new JButton("Calculate Cost");
		
		add(btnCalculateCost);
		
		btnCalculateCost.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("Button worked");
			}
			
		});
		
		//Add Clear button
		JButton btnClear = new JButton("Clear");
		panel.add(btnClear);
		btnClear.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Clear worked");
			}
		});
	
		//Add exit button
		JButton btnExit = new JButton("Exit");
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}			
		});
	}
		
}
