package myprojects.isprojects.Assignment3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MusicGUI extends JFrame {
	private static JLabel label;
	private static String text;
	
	
	
	public MusicGUI(){
		JFrame f = new JFrame("BorderLayout");		
		
		JPanel panel = new JPanel();		
		panel.setLayout(new BorderLayout());		
		
		//Digital download header
		JLabel labelHeader = new JLabel();
		labelHeader.setText("Digital Downloads");
		
		//Create new Font
		Font fontHeader = new Font("Courier New", Font.BOLD, 22);
		
		labelHeader.setFont(fontHeader);
		labelHeader.setHorizontalAlignment(getWidth() / 2);
		labelHeader.setVisible(true);
		
		panel.add(labelHeader, "North");	
		
		//Cost per Download lbl
		JLabel lblCost = new JLabel();
		lblCost.setVisible(true);
		lblCost.setText("$0.99 per Download");
		
		//Create new Font
		Font fontCost = new Font("Courier New", Font.BOLD, 12);
		lblCost.setFont(fontCost);
		lblCost.setHorizontalAlignment(getWidth() / 2);
		
		double cost = 0.99;
		panel.add(lblCost, "Center");
		
		//Number of CD's Purchased Label
		
		JLabel lblPurchase = new JLabel();
		lblPurchase.setText("CD's Purchased");
		panel.add(lblPurchase, "South");
		
		//Add Number of Download Fill in Text
		final JTextField txtField = new JTextField();
		
		txtField.setSize(50, 50);
		
		panel.add(txtField, "South");
		
		
		
		txtField.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				  text = txtField.getText();				  
				   System.out.println(text);
			}
		
		});
		
		
		f.getContentPane().add(panel, "North");
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new BorderLayout());
		
		
		
		//Total Cost of Downloads
		final JLabel lblTotalCost = new JLabel();
		
		Font costFont = new Font("Courier New", Font.BOLD, 14);
		lblCost.setFont(costFont);
		lblCost.setHorizontalAlignment(getWidth()/2);
		btnPanel.add(lblTotalCost, "North");
		//Add Button yoCalulate Cost
		JButton btnCalculateCost = new JButton("Calculate Cost");
		
		btnPanel.add(btnCalculateCost, "Center");		
		btnCalculateCost.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event)
			{
			
				double totalCost = 0;
					
				if(text == null){
					JOptionPane.showMessageDialog(null, "Please press Enter for valid input");
				}
				totalCost = (Integer.parseInt(text) * 0.99) + 1.55;				
				lblTotalCost.setText("Total Cost : " + "$" + totalCost);
			}
			
		});
		
		//Add Clear button
		JButton btnClear = new JButton("Clear");
		btnPanel.add(btnClear, "East");
		btnClear.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				txtField.setText("");
				lblTotalCost.setText("");
			}
		});
	
		//Add exit button
		JButton btnExit = new JButton("Exit");
		btnPanel.add(btnExit, "West");
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}			
		});
		
		
		
		f.getContentPane().add(btnPanel, "South");
		
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setLocation(250, 250);
		f.setSize(500, 500);
		f.setVisible(true);
	}
		
}

