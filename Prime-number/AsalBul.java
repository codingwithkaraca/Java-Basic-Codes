package AsalMi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Iterator;

import javax.swing.JTextField;

public class AsalBul extends JFrame {
	
	int deger,count;
	JLabel lbl1,lbl2;
	

	public JPanel contentPane;
	public JTextField tf1;
	public JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsalBul frame = new AsalBul();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AsalBul() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("asal mı değilmi öğrenmek istedğiniz sayı :");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl1.setBounds(60, 120, 197, 55);
		contentPane.add(lbl1);
		
		tf1 = new JTextField();
		tf1.setBounds(353, 129, 166, 37);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JLabel lbl2 = new JLabel("Girdiğiniz Sayi:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl2.setBounds(120, 217, 137, 28);
		contentPane.add(lbl2);
		
		tf2 = new JTextField();
		tf2.setBounds(353, 223, 166, 37);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf1.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				try {
					deger = Integer.parseInt(tf1.getText());
					
					
				} catch (NumberFormatException f) {
					
					if (tf1.getText().equals(""))  tf2.setText("");
					else   tf2.setText(" hatal değer ");
				}
				if (tf1.getText().equals("")) {
					tf2.setText("");
					
				}
				else if (deger<0) {
					tf2.setText("hatalı değer :( ");
					
				}
				else if (deger == 2) {
					tf2.setText("sayı asaldir :) ");
					
				}
				else if (deger<2 && deger >= 0) {
					tf2.setText("girdiğiniz sayı asal değildir :( ");
					
				}
				else if (deger>2) {
					count = 0;
					for (int i = 2; i < deger; i++) {
						if (deger%i==0) count++; {
							
							
						}
						if (count==0) {
							tf2.setText("girdiğiniz sayi asaldir");
						}
						else  tf2.setText("girdiğiniz sayi asal değildir");
						
					}
					
				}
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				
				try {
					deger = Integer.parseInt(tf1.getText());
					
					
				} catch (NumberFormatException f) {
					
					if (tf1.getText().equals(""))  tf2.setText("");
					else   tf2.setText(" hatal değer ");
				}
				if (tf1.getText().equals("")) {
					tf2.setText("");
					
				}
				else if (deger<0) {
					tf2.setText("hatalı değer :( ");
					
				}
				else if (deger == 2) {
					tf2.setText("sayı asaldir :) ");
					
				}
				else if (deger<2 && deger >= 0) {
					tf2.setText("girdiğiniz sayı asal değildir :( ");
					
				}
				else if (deger>2) {
					count = 0;
					for (int i = 2; i < deger; i++) {
						if (deger%i==0) count++; {
							
							
						}
						if (count==0) {
							tf2.setText("girdiğiniz sayi asaldir");
						}
						else  tf2.setText("girdiğiniz sayi asal değildir");
						
					}
					
				}
				
				
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				
				try {
					deger = Integer.parseInt(tf1.getText());
					
					
				} catch (NumberFormatException f) {
					
					if (tf1.getText().equals(""))  tf2.setText("");
					else   tf2.setText(" hatal değer ");
				}
				if (tf1.getText().equals("")) {
					tf2.setText("");
					
				}
				else if (deger<0) {
					tf2.setText("hatalı değer :( ");
					
				}
				else if (deger == 2) {
					tf2.setText("sayı asaldir :) ");
					
				}
				else if (deger<2 && deger >= 0) {
					tf2.setText("girdiğiniz sayı asal değildir :( ");
					
				}
				else if (deger>2) {
					count = 0;
					for (int i = 2; i < deger; i++) {
						if (deger%i==0) count++; {
							
							
						}
						if (count==0) {
							tf2.setText("girdiğiniz sayi asaldir");
						}
						else  tf2.setText("girdiğiniz sayi asal değildir");
						
					}
					
				}
				}});}}
