package final_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Checking extends JFrame {
    int cnum, nop, moviemoney;
    String CheckTime, moviename, age, strseat;
    String[] cseat;

    public Checking(int cnum, String CheckTime, String moviename, String age, int nop, String[] cseat, int moviemoney) {
        this.cnum = cnum;
        this.nop = nop;
        this.CheckTime = CheckTime;
        this.moviename = moviename;
        this.age = age;
        this.cseat = cseat;
        this.moviemoney = moviemoney;
        strseat = "";

        setTitle("세로 레이블과 버튼");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLayout(null);

        // 레이블 1
        JLabel label1 = new JLabel("아이디 : " + Session.getLoggedInUserId());
        label1.setBounds(170, 10, 300, 30);
        add(label1);

        // 레이블 2
        JLabel label2 = new JLabel("영화제목 : " + moviename);
        label2.setBounds(170, 40, 300, 30);
        add(label2);

        // 레이블 3
        JLabel label3 = new JLabel("관 : " + cnum + "관");
        label3.setBounds(170, 70, 300, 30);
        add(label3);

        // 레이블 4
        JLabel label4 = new JLabel("인원 : " + nop + "명");
        label4.setBounds(170, 100, 300, 30);
        add(label4);

        for (int i = 0; i < cseat.length; i++) {
            strseat += cseat[i] + " ";
        }
        // 레이블 5
        JLabel label5 = new JLabel("좌석 : " + strseat);
        label5.setBounds(170, 130, 300, 30);
        add(label5);

        // 레이블 6
        JLabel label6 = new JLabel("가격 : " + moviemoney + "원 입니다.");
        label6.setBounds(170, 160, 300, 30);
        add(label6);

        // 버튼 1
        JButton button1 = new JButton("결제하기");
        button1.setBounds(100, 200, 100, 30);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 결제 정보를 데이터베이스에 저장
                savePaymentInfo(moviename, cnum, nop, strseat, moviemoney);

                JOptionPane.showMessageDialog(Checking.this, moviemoney + "원이 결제 되었습니다.\n원래 화면으로 돌아갑니다.");
                setVisible(false);
                new Reservation_details();
            }
        });
        add(button1);

        // 버튼 2
        JButton button2 = new JButton("취소");
        button2.setBounds(350, 200, 100, 30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new movieseat(cnum, CheckTime, moviename, age, nop, moviemoney);
            }
        });
        add(button2);

        setVisible(true);
    }

    // Checking 클래스의 savePaymentInfo 메서드 수정
    private void savePaymentInfo(String moviename, int cnum, int nop, String strseat, int moviemoney) {
        try {
            // 데이터베이스 연결 및 쿼리 작성
            Connection connection = DBconnectMovie.getConnection(); // sillamoviedb 데이터베이스에 연결
            String sql = "INSERT INTO payment (username, movie_title, theater_number, number_of_people, selected_seats, price) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            // 파라미터 설정
            preparedStatement.setString(1, Session.getLoggedInUserId());
            preparedStatement.setString(2, moviename);
            preparedStatement.setInt(3, cnum);
            preparedStatement.setInt(4, nop);
            preparedStatement.setString(5, strseat);
            preparedStatement.setInt(6, moviemoney);

            // 쿼리 실행
            preparedStatement.executeUpdate();

            // 연결 및 자원 해제
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
