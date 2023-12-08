package final_Project;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieuserInfo extends JFrame {
    JLabel label1, label2, label3, label4, label5, label6;

    public movieuserInfo() {
        setTitle("사용자 정보");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 270);
        setLayout(null);

        // 레이블 초기화
        label1 = new JLabel("아이디 : " + Session.getLoggedInUserId());
        label1.setBounds(0, 10, 100, 30);
        add(label1);

        label2 = new JLabel("이름 : ");
        label2.setBounds(0, 40, 100, 30);
        add(label2);

        label3 = new JLabel("핸드폰 : ");
        label3.setBounds(0, 70, 100, 30);
        add(label3);

        label4 = new JLabel("성별 : ");
        label4.setBounds(0, 100, 100, 30);
        add(label4);

        label5 = new JLabel("주소 : ");
        label5.setBounds(0, 130, 100, 30);
        add(label5);

        label6 = new JLabel("나이 : ");
        label6.setBounds(0, 160, 100, 30);
        add(label6);

        // 데이터베이스에서 사용자 정보를 가져와 레이블에 설정
        String loggedInUserId = Session.getLoggedInUserId();
        updateUserInfoFromDatabase(loggedInUserId);

        // 버튼 2
        JButton button2 = new JButton("돌아가기");
        button2.setBounds(50, 200, 100, 30);
        button2.addActionListener(e -> {
            setVisible(false);
            new Reservation_details();
        });
        add(button2);

        setVisible(true);
    }

    private void updateUserInfoFromDatabase(String userId) {
        try {
            // 데이터베이스 연결 및 쿼리 작성 (아래는 예시일 뿐 실제 쿼리에 맞게 변경 필요)
            Connection connection = DBconnect.getConnection();
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userId);

            // 쿼리 실행
            ResultSet resultSet = preparedStatement.executeQuery();

            // 결과 확인 및 레이블에 설정
            if (resultSet.next()) {
                label2.setText("이름 : " + resultSet.getString("name"));
                label3.setText("핸드폰 : " + resultSet.getString("phone"));
                label4.setText("성별 : " + resultSet.getString("gender"));
                label5.setText("주소 : " + resultSet.getString("address"));
                label6.setText("나이 : " + resultSet.getInt("age"));
            }

            // 연결 및 자원 해제
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new movieuserInfo());
    }
}
