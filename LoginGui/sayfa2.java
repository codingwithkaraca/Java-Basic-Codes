package LoginGui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sayfa2 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sayfa2 frame = new sayfa2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
}}});}
	public sayfa2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwelcome = new JLabel("HOŞGELDİNİZ");
		lblwelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcome.setFont(new Font("Unispace", Font.BOLD, 14));
		lblwelcome.setBounds(245, 204, 202, 53);
		contentPane.add(lblwelcome);
		
		JButton btnCikis = new JButton("ÇIKIŞ");
		btnCikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame frame = new Frame();
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want exit","EXİT",
						JOptionPane.NO_OPTION)==JOptionPane.YES_OPTION) 
				{
					System.exit(0);
				}

			}
		});
		btnCikis.setBounds(245, 283, 233, 53);
		contentPane.add(btnCikis);
	}
}
