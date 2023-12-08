package FireLegend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class moviereservationcheck extends JFrame {
    public moviereservationcheck() {
        setTitle("세로 레이블과 버튼");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,270);
        setLayout(null);

        // 레이블 1
        JLabel label1 = new JLabel("아이디 : ");
        label1.setBounds(0, 10, 100, 30);
        add(label1);

        // 레이블 2
        JLabel label2 = new JLabel("영화제목 : ");
        label2.setBounds(0, 40, 100, 30);
        add(label2);

        // 레이블 3
        JLabel label3 = new JLabel("관 : ");
        label3.setBounds(0, 70, 100, 30);
        add(label3);

        // 레이블 4
        JLabel label4 = new JLabel("인원 : ");
        label4.setBounds(0, 100, 100, 30);
        add(label4);

        // 레이블 5
        JLabel label5 = new JLabel("좌석 : ");
        label5.setBounds(0, 130, 100, 30);
        add(label5);

        // 레이블 6
        JLabel label6 = new JLabel("가격 : ");
        label6.setBounds(0, 160, 100, 30);
        add(label6);

        // 버튼 2
        JButton button2 = new JButton("돌아가기");
        button2.setBounds(50, 200, 100, 30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Reservation_details();
            }
        });
        add(button2);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new moviereservationcheck();
            }
        });
    }
}
