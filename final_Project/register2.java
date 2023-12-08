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

public class register2 extends Frame {
    JLabel lblId, lblPwd, lblName, lblHp, lblGen, lblAddr, lblAge;
    JTextField txtId, txtName;
    JPasswordField txtPwd;
    JTextField txtHp;
    JRadioButton cbMale, cbFeMale;
    JTextField txtAddr, txtAge;
    JButton btnSubmit, btnCancel;
    String strid, strpwd, strname, strhp, strgen, straddr, strage;

    public register2() {
        setLayout(null);
        lblId = new JLabel("아이디");
        lblPwd = new JLabel("패스워드");
        lblName = new JLabel("이름");
        lblHp = new JLabel("핸드폰");
        lblGen = new JLabel("성별");
        lblAddr = new JLabel("주소");
        lblAge = new JLabel("나이");

        lblId.setBounds(20, 50, 100, 20);
        lblPwd.setBounds(20, 80, 100, 20);
        lblName.setBounds(20, 110, 100, 20);
        lblHp.setBounds(20, 140, 100, 20);
        lblGen.setBounds(20, 170, 100, 20);
        lblAddr.setBounds(20, 200, 100, 20);
        lblAge.setBounds(20, 230, 100, 20);

        add(lblId);
        add(lblPwd);
        add(lblName);
        add(lblHp);
        add(lblGen);
        add(lblAddr);
        add(lblAge);

        txtId = new JTextField(20);
        txtPwd = new JPasswordField(20);
        txtName = new JTextField(20);
        txtHp = new JTextField(11);

        JPanel panGen = new JPanel(new FlowLayout(FlowLayout.LEFT));

        ButtonGroup gb = new ButtonGroup();
        cbMale = new JRadioButton("남자");
        cbFeMale = new JRadioButton("여자");

        gb.add(cbMale);
        gb.add(cbFeMale);
        panGen.add(cbMale);
        panGen.add(cbFeMale);
        panGen.setBounds(120, 162, 150, 30);

        txtAddr = new JTextField();
        txtAge = new JTextField();

        btnCancel = new JButton("취소");
        btnSubmit = new JButton("가입완료");

        txtId.setBounds(120, 50, 150, 20);
        txtPwd.setBounds(120, 80, 150, 20);
        txtName.setBounds(120, 110, 150, 20);
        txtHp.setBounds(120, 140, 150, 20);
        txtAddr.setBounds(120, 200, 150, 20);
        txtAge.setBounds(120, 230, 150, 20);

        JPanel paButton = new JPanel();
        paButton.add(btnSubmit);
        paButton.add(btnCancel);
        paButton.setBounds(0, 270, 370, 370);

        add(txtId);
        add(txtPwd);
        add(txtName);
        add(txtHp);
        add(panGen);
        add(txtAddr);
        add(txtAge);
        add(paButton);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strid = txtId.getText();
                strpwd = new String(txtPwd.getPassword());
                strname = txtName.getText();
                strhp = txtHp.getText();

                // 아이디 중복 체크
                if (isDuplicateId(strid)) {
                    JOptionPane.showMessageDialog(register2.this, "이미 존재하는 아이디입니다. 다른 아이디를 사용해주세요.");
                    return;
                }

                // 패스워드를 해싱하여 저장
                String hashedPassword = hashPassword(strpwd);

                String cid = "";

                if (strid == null || strid.isEmpty()) cid += "아이디 ";
                if (hashedPassword == null || hashedPassword.isEmpty()) cid += "비밀번호 ";
                if (strname == null || strname.isEmpty()) cid += "이름 ";
                if (strhp == null || strhp.isEmpty()) cid += "전화번호 ";
                if (txtAddr.getText() == null || txtAddr.getText().isEmpty()) cid += "주소 "; // 수정된 부분
                if (txtAge.getText() == null || txtAge.getText().isEmpty() || !txtAge.getText().matches("\\d+")) // 수정된 부분
                    cid += "나이 ";
                if (!cbMale.isSelected() && !cbFeMale.isSelected()) cid += "성별 ";
                if (cid.isEmpty()) {
                    try {
                        // DBconnect 클래스에서 Connection 객체 가져오기
                        Connection connection = DBconnect.getConnection();

                        // SQL 쿼리 작성 (INSERT INTO)
                        String sql = "INSERT INTO users (username, password, name, phone, address, age, gender) VALUES (?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);

                        // 파라미터 설정
                        preparedStatement.setString(1, strid);
                        preparedStatement.setString(2, hashedPassword);
                        preparedStatement.setString(3, strname);
                        preparedStatement.setString(4, strhp);
                        preparedStatement.setString(5, txtAddr.getText()); // 수정된 부분
                        preparedStatement.setInt(6, Integer.parseInt(txtAge.getText())); // 수정된 부분
                        if (cbMale.isSelected()) {
                            preparedStatement.setString(7, cbMale.getText());
                        } else if (cbFeMale.isSelected()) {
                            preparedStatement.setString(7, cbFeMale.getText());
                        }

                        // 쿼리 실행
                        preparedStatement.executeUpdate();

                        // 연결 및 자원 해제
                        preparedStatement.close();

                        // 회원가입 완료 후 로그인 창으로 이동
                        setVisible(false);
                        new loginc();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(register2.this, "데이터베이스 오류: " + ex.getMessage());
                    }
                } else {
                    cid += "를 입력하셔야 회원가입완료 됩니다.";
                    JOptionPane.showMessageDialog(register2.this, cid);
                }
            }

            private boolean isDuplicateId(String username) {
                try {
                    Connection connection = DBconnect.getConnection();

                    // SQL 쿼리 작성 (아이디 중복 체크)
                    String checkDuplicateSql = "SELECT COUNT(*) FROM users WHERE username = ?";
                    PreparedStatement checkDuplicateStatement = connection.prepareStatement(checkDuplicateSql);
                    checkDuplicateStatement.setString(1, username);

                    // 쿼리 실행
                    ResultSet resultSet = checkDuplicateStatement.executeQuery();

                    // 결과 확인
                    resultSet.next();
                    int count = resultSet.getInt(1);

                    // 연결 및 자원 해제
                    resultSet.close();
                    checkDuplicateStatement.close();

                    // 중복된 아이디가 존재하면 true 반환
                    return count > 0;
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(register2.this, "데이터베이스 오류: " + ex.getMessage());
                    return true; // 오류가 발생하면 중복으로 처리
                }
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
        });

        btnCancel.addActionListener(new cancelevent());

        setTitle("회원가입");
        setSize(370, 320);
        setVisible(true);
    }

    class cancelevent implements ActionListener {
        public cancelevent() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new loginc();
        }
    }

    public static void main(String[] args) {
        new register2();
    }
}
