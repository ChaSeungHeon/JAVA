package final_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class register extends JFrame {
    JLabel lblId, lblPwd;
    JTextField txtId;
    JPasswordField txtPwd;
    JButton btnLogin, btnCancel;

    public register() {
        GridLayout layout = new GridLayout(3, 2);
        setLayout(layout);

        lblId = new JLabel("아이디");
        txtId = new JTextField();

        lblPwd = new JLabel("비밀번호");
        txtPwd = new JPasswordField();

        btnLogin = new JButton("로그인");
        btnCancel = new JButton("취소");

        add(lblId);
        add(txtId);
        add(lblPwd);
        add(txtPwd);
        add(btnLogin);
        add(btnCancel);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtId.getText();
                String password = new String(txtPwd.getPassword());
                String hashedPassword = hashPassword(password);

                if (checkLogin(username, hashedPassword)) {
                	Session.setLoggedInUserId(username); // 세션에 로그인한 사용자 아이디 저장
                    setVisible(false);
                    new Reservation_details();
                } else {
                    JOptionPane.showMessageDialog(register.this, "아이디 또는 비밀번호를 확인하세요.");
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new loginc();
            }
        });

        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private String hashPassword(String password) {
        try {
            // SHA-256 해시 함수를 사용하여 패스워드 해싱
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            // 바이트 배열을 16진수 문자열로 변환
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean checkLogin(String username, String hashedPassword) {
        try {
            Connection connection = DBconnect.getConnection();

            // SQL 쿼리 작성 (아이디와 해싱된 비밀번호로 로그인 체크)
            String checkLoginSql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement checkLoginStatement = connection.prepareStatement(checkLoginSql);
            checkLoginStatement.setString(1, username);
            checkLoginStatement.setString(2, hashedPassword);

            // 쿼리 실행
            ResultSet resultSet = checkLoginStatement.executeQuery();

            // 결과 확인
            boolean loginSuccess = resultSet.next();

            // 연결 및 자원 해제
            resultSet.close();
            checkLoginStatement.close();

            return loginSuccess;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(register.this, "데이터베이스 오류: " + ex.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        new register();
    }
}
