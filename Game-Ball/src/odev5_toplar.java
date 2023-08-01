import javax.swing.*;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class odev5_toplar extends JFrame {
    private JPanel panel1;
    private JLabel futboltopi;
    private JLabel basketbol;
    private JLabel voleybol;

    static int futbolinx, futboliny, basketbolinx, basketboliny, voleybolinx, voleyboliny, futbolhizx, futbolhizy, basketbolhizx, basketbolhizy, voleybolhizx, voleybolhizy;

    Timer t;
    TimerTask g;

    public odev5_toplar() {
        add(panel1);
        setSize(600, 600);
        setTitle("Ödev 5 çarpisma");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        futbolinx = 300;
        futboliny = 50;


        basketbolinx = 100;
        basketboliny = 100;

        voleybolinx = 200;
        voleyboliny = 250;

        futbolhizx = 5;
        futbolhizy = 5;

        basketbolhizx = 5;
        basketbolhizy = 5;

        voleybolhizx = 5;
        voleybolhizy = 5;

        t = new Timer();
        g = new TimerTask() {
            @Override
            public void run() {

                Rectangle r1 = new Rectangle(futbolinx,futboliny,50,50);
                Rectangle r2 = new Rectangle(basketbolinx,basketboliny,50,50);
                Rectangle r3 = new Rectangle(voleybolinx,voleyboliny,50,50);

                if (r1.intersects(r2)){
                    futbolhizx *=-1 ; futbolhizy*=-1;basketbolhizx*=-1; basketbolhizy*=-1;
                }
                if (r1.intersects(r3)){
                    futbolhizx *=-1 ; futbolhizy*=-1; voleybolhizx *=-1; voleybolhizy*=-1;
                }
                if (r2.intersects(r3)){
                    basketbolhizx*=-1; basketbolhizy*=-1; voleybolhizx *=-1; voleybolhizy*=-1;
                }


                futbolinx += futbolhizx;
                futboliny += futbolhizy;

                basketbolinx += basketbolhizx;
                basketboliny += basketbolhizy;

                voleybolinx += voleybolhizx;
                voleyboliny += voleybolhizy;


                if (futbolinx >= 500 || futbolinx <= 0) futbolhizx *= -1;
                if (futboliny >= 500 || futboliny <= 0) futbolhizy *= -1;


                if (basketbolinx >= 500 || basketbolinx <= 0) basketbolhizx *= -1;
                if (basketboliny >= 500 || basketboliny <= 0) basketbolhizy *= -1;

                if (voleybolinx >= 500 || voleybolinx <= 0) voleybolhizx *= -1;
                if (voleyboliny >= 500 || voleyboliny <= 0) voleybolhizy *= -1;

                futboltopi.setBounds(futbolinx, futboliny, 50, 50);
                basketbol.setBounds(basketbolinx, basketboliny, 50, 50);
                voleybol.setBounds(voleybolinx, voleyboliny, 50, 50);

            }
        };

        t.schedule(g, 0, 10);
    }
}
