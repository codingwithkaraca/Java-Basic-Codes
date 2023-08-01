import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                odev5_toplar odev5_toplar = new odev5_toplar();

                odev5_toplar.setVisible(true);

            }
        });





    }
}
