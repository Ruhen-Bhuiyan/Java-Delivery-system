import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Component;
public class Deliver {
	String itax,isub,itot;
	double[] cost=new double[22];
	private JFrame frame;
	private JTextField txttax;
	
	private JTextField txtsub;
	private JTextField txttotal;
	private JTextField textField;
	private JTextField textField_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deliver window = new Deliver();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Deliver() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 3, 3, 3));
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(171, 30, 86, 20);
		panel_1.add(textField);
		
		textField.setColumns(10);
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Product 2");
		chckbxNewCheckBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEnabled(true);
			}
		});
		chckbxNewCheckBox_1_1.setEnabled(false);
		chckbxNewCheckBox_1_1.setBounds(23, 65, 97, 23);
		panel_1.add(chckbxNewCheckBox_1_1);
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Product 1");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
			}
		});
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1.setBounds(23, 29, 97, 23);
		panel_1.add(chckbxNewCheckBox_1);
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(171, 66, 86, 20);
		panel_1.add(textField_1);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(10, 2, 2, 2));
		JButton btnNewButton_1 = new JButton("Product 1");
		btnNewButton_1.addActionListener(new ActionListener() {
			private Component chckbxNewCheckBox;

			public void actionPerformed(ActionEvent e) {

				chckbxNewCheckBox_1.setEnabled(true);
			}
		});
		panel.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("Product 2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox_1_1.setEnabled(true);
			}
		});
		panel.add(btnNewButton_2);
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setBounds(32, 43, 46, 14);
		panel_2.add(lblNewLabel);
		txttax = new JTextField();
		txttax.setBounds(129, 40, 86, 20);
		panel_2.add(txttax);
		txttax.setColumns(10);
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setBounds(10, 83, 96, 14);
		panel_2.add(lblSubtotal);
		txtsub = new JTextField();
		txtsub.setColumns(10);
		txtsub.setBounds(129, 80, 86, 20);
		panel_2.add(txtsub);
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(32, 130, 46, 14);
		panel_2.add(lblTotal);
		txttotal = new JTextField();
		txttotal.setColumns(10);
		txttotal.setBounds(129, 127, 86, 20);
		panel_2.add(txttotal);
		JButton btnNewButton_3 = new JButton("Total");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cost[0]=Double.parseDouble(textField.getText())*1.50;
				cost[1]=Double.parseDouble(textField_1.getText())*1.50;
				cost[2]=cost[0]+cost[1];
				itax=String.format("%.2f",cost[2]/100);
				isub=String.format("%.2f",cost[2]);
				itot=String.format("%.2f",cost[2]+(cost[2]/100));
				txttax.setText(itax);
				txtsub.setText(isub);
				txttotal.setText(itot);
			}
		});
		btnNewButton_3.setBounds(129, 175, 89, 23);
		panel_2.add(btnNewButton_3);
		JButton btnNewButton_3_2 = new JButton("Exit");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Confirm","Point of Sale",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
			}
		});
		btnNewButton_3_2.setBounds(252, 175, 89, 23);
		panel_2.add(btnNewButton_3_2);
	}
}
