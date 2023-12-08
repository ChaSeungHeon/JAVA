package FireLegend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reservation_details extends JFrame {
    public Reservation_details() {
        setTitle("영화 예매 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);

        // 레이아웃 설정
        setLayout(null);

        // 버튼 생성
        JButton reservationButton = new JButton("영화 예매");
        JButton checkReservationButton = new JButton("예매 내역 확인");
        JButton checkUserInfoButton = new JButton("내 정보 확인");

        // setBounds를 이용하여 각 컴포넌트의 위치 크기 설정
        reservationButton.setBounds(50, 90, 130, 100);
        checkReservationButton.setBounds(220, 90, 130, 100);
        checkUserInfoButton.setBounds(390, 90, 130, 100);

        // 예매 버튼에 대한 이벤트 처리
        reservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 예매 버튼을 눌렀을 때의 동작
            	setVisible(false);
                new moviereservation();
            }
        });

        // 예매 내역 확인 버튼에 대한 이벤트 처리4
        checkReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 예매 내역 확인 버튼을 눌렀을 때의 동작
                setVisible(false);
                new moviereservationcheck();
            }
        });

        // 내 정보 확인 버튼에 대한 이벤트 처리
        checkUserInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 내 정보 확인 버튼을 눌렀을 때의 동작
            	setVisible(false);
                new movieuserInfo();
            }
        });

        // 버튼을 프레임에 추가
        add(reservationButton);
        add(checkReservationButton);
        add(checkUserInfoButton);

        // 프레임을 보이게 설정
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Reservation_details();
            }
        });
    }
}