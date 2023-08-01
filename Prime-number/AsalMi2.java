package AsalMi2;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AsalMi2 extends JFrame {

	private JPanel contentPane;
	Label lbl1;
	Label lbl2;
	JTextField tf1,tf2;
	int deger,counter;
	private Button btn1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsalMi2 frame = new AsalMi2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}

	public AsalMi2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new Label("asalmı öğrenmek istediğiniz sayı ");
		lbl1.setBounds(225,51,233,55);
		lbl1.setBackground(Color.GREEN);
		contentPane.add(lbl1);
		
		tf1= new JTextField();
		tf1.setBounds(187,122,339,55);
		tf1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(tf1);
		
		btn1 = new Button("HESAPLA");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					deger = Integer.parseInt(tf1.getText());
					
				} catch (NumberFormatException f) {
					if (tf1.getText().equals(""))  tf2.setText("");
					else tf2.setText("hatalı değer ");	
				}
				if (deger<0) {
					tf2.setText("hatalı değer girdiniz :(  : "+deger);
				}
				else if (deger==2) {
					tf2.setText(" girdiğiniz -> "+deger+" <- sayisi asaldir");
				}
				else if (deger < 2 && deger > 0) {
					tf2.setText("bu sayi asal değildir :"+deger);
				}
				else if (deger>2) {
					counter = 0;
					for (int i = 2; i < deger; i++) {
						if (deger%i==0) counter++; {
							}}
					if (counter == 0) tf2.setText("girdiğiniz sayi asaldir :"+deger);
						
					else tf2.setText("bu sayi asal değildir :"+deger);
					}}});
		
		btn1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1.setBounds(200,212,300,70);
		btn1.setBackground(Color.orange);
		contentPane.add(btn1);
		
		tf2 = new JTextField(" ");
		tf2.setBounds(159,334,443,63);
		tf2.setEditable(false);
		contentPane.add(tf2);
		}}
