import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
//import java.awt.Window;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Task1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task1 calculator = new Task1();
					calculator.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	
	public Task1() {
		setBackground(new Color(204, 255, 229));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 229, 204));
		contentPane.setForeground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelhead = new JLabel("Welcome To Currency Converter\r\n");
		labelhead.setFont(new Font("sans serif", Font.BOLD, 22));
		labelhead.setBounds(250, 10, 350, 35);
		contentPane.add(labelhead);
		
		JLabel lblNewLabel = new JLabel("Enter the amount\r\n");
		lblNewLabel.setFont(new Font("sans serif", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(50, 58, 167, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setFont(new Font("sans serif", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(50, 158, 142, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setFont(new Font("sans serif", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(50, 242, 45, 21);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("sans serif", Font.BOLD, 13));
		textField.setBounds(338, 58, 251, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("sans serif", Font.BOLD, 13));
		comboBox.setName("From..");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "USD", "IndianRupee"}));
		comboBox.setBounds(341, 146, 248, 34);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("sans serif", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "IndianRupee", "USD"}));
		comboBox_1.setName("to..");
		comboBox_1.setBounds(338, 239, 251, 34);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double total;
				Double amount=Double.parseDouble(textField.getText());
				if(comboBox.getSelectedItem().toString()=="USD"&&comboBox_1.getSelectedItem().toString()=="IndianRupee")
				{
					total=amount*70.50;
					JOptionPane.showInputDialog(this,"Converted Amount is "+total.toString());
					JOptionPane jOptionPane = new JOptionPane();
					jOptionPane.setFont(new Font("sans serif",Font.BOLD | Font.ITALIC,13));
				}
				else if(comboBox.getSelectedItem().toString()=="IndianRupee"&&comboBox_1.getSelectedItem().toString()=="USD")
				{
					total=amount/70.50;
					JOptionPane.showInputDialog(this,"Your Amount is "+total.toString());

				}

			}
		});
		btnNewButton.setFont(new Font("sans serif", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(504, 348, 104, 21);
		contentPane.add(btnNewButton);
	}
}
