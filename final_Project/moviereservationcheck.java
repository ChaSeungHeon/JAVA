package final_Project;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class moviereservationcheck extends JFrame {
    private JLabel[] labels;
    private int currentIndex;

    public moviereservationcheck() {
        labels = new JLabel[8];

        setTitle("예매 내역 확인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(9, 1));

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            panel.add(labels[i]);
        }

        // 이전 예매 내역을 보여주는 버튼
        JButton prevButton = new JButton("이전 예매 내역");
        prevButton.addActionListener(e -> {
            if (currentIndex > 0) {
                currentIndex--;
                updateReservationInfoFromDatabase(currentIndex);
            } else {
                JOptionPane.showMessageDialog(this, "더 이상 이전 예매 내역이 없습니다.");
            }
        });
        panel.add(prevButton);

        // 다음 예매 내역을 보여주는 버튼
        JButton nextButton = new JButton("다음 예매 내역");
        nextButton.addActionListener(e -> {
            currentIndex++;
            updateReservationInfoFromDatabase(currentIndex);
        });
        panel.add(nextButton);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void updateReservationInfoFromDatabase(int index) {
        try {
            Connection connection = DBconnectMovie.getConnection();

            // SQL 쿼리 작성 (LIMIT을 사용하여 인덱스에 해당하는 예매 내역만 가져오기)
            String query = "SELECT * FROM payment LIMIT ?, 1";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, index);

                // 쿼리 실행
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // 결과 확인 및 레이블에 설정
                    if (resultSet.next()) {
                        // 레이블에 예매 내역 표시
                        labels[0].setText("결제 ID : " + resultSet.getInt("payment_id"));
                        labels[1].setText("사용자 ID : " + resultSet.getString("username"));
                        labels[2].setText("영화 제목 : " + resultSet.getString("movie_title"));
                        labels[3].setText("상영관 번호 : " + resultSet.getInt("theater_number"));
                        labels[4].setText("인원 수 : " + resultSet.getInt("number_of_people"));
                        labels[5].setText("좌석 선택 : " + resultSet.getString("selected_seats"));
                        labels[6].setText("가격 : " + resultSet.getInt("price"));
                        labels[7].setText("결제 일시 : " + resultSet.getString("payment_date"));
                    } else {
                        // 결과가 없을 경우 처리 (더 이상 예매 내역이 없는 경우 등)
                        JOptionPane.showMessageDialog(this, "더 이상 예매 내역이 없습니다.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(moviereservationcheck::new);
    }
}
