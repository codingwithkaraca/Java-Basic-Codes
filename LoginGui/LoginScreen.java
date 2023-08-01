package LoginGui;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	
	Label lbl1,lbl2,lbl3hatamesaji;
	TextField tf1;
	Button btn1 ,btn2;
	String eposta = "karaca";
	String sifre = "1234"; 
	private JPasswordField tf2;
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}

	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.red);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label lbl1 = new Label("kullanıcı adınız");
		lbl1.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl1.setBackground(Color.lightGray);
		lbl1.setBounds(213,89,227,41);
		contentPane.add(lbl1);
		
		tf1 = new TextField();
		tf1.setBounds(213,140,333,54);
		contentPane.add(tf1);
		
		lbl2 = new Label("şifreniz");
		lbl2.setFont(new Font("Dialog", Font.BOLD, 13));
		lbl2.setBounds(213,256,227,41);
		lbl2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(lbl2);
		
		btn1 = new Button("Giriş yap");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (tf1.getText().equals(eposta) && tf2.getText().equals(sifre)) {
//					JOptionPane.showMessageDialog(null, "Giriş Başarılı"  );
					sayfa2 s2 = new sayfa2();
					s2.show();
					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "e posta veya şifre yanlış");
				}}});
		
		btn1.setBackground(Color.GREEN);
		btn1.setBounds(202,414,360,60);
		contentPane.add(btn1);
		
		tf2 = new JPasswordField();
		tf2.setBounds(213, 303, 333, 54);
		contentPane.add(tf2);
		
		JCheckBox sifreGostercheck = new JCheckBox("şifre göster");
		sifreGostercheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (sifreGostercheck.isSelected()) {
					tf2.setEchoChar((char)0);
				}
				else {
					tf2.setEchoChar('*');
				}}});
		sifreGostercheck.setBounds(213, 374, 93, 21);
		contentPane.add(sifreGostercheck);
		
		
		
		
	
		
	
	}
}
