import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
public class Deliver {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 3, 3, 3));
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(10, 2, 2, 2));
		JButton btnNewButton_1 = new JButton("Product 1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("Product 2");
		panel.add(btnNewButton_2);
		JButton btnNewButton = new JButton("Product 3");
		panel.add(btnNewButton);
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 1, 1));
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox_1);
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox);
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox_2);
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(10);
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
	}

}
