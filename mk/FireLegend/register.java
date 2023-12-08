package FireLegend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class register extends JFrame{
	JLabel lblId;
    JLabel lblPwd;
    JTextField txtId;
    JTextField txtPwd;
    JButton lblbtn,cancelbtn;
	public register() {
		GridLayout gu = new GridLayout(2,3);
        setLayout(gu);
        lblId = new JLabel("아이디");
        txtId = new JTextField();
       
        lblPwd = new JLabel("비밀번호");
        txtPwd = new JTextField();
        
        lblbtn = new JButton("로그인");
        cancelbtn = new JButton("취소");
        
        add(lblId);
        add(txtId);
        add(lblbtn);
        add(lblPwd);
        add(txtPwd);
        add(cancelbtn);
        lblbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            	new Reservation_details();
            }
        });
        cancelbtn.addActionListener(new cancelevent());
        setSize(350, 100);
        setVisible(true);
   }
	class cancelevent implements ActionListener{
    	public cancelevent() {
    	}
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		setVisible(false);
    		new loginc();
    	}
    }
 public static void main(String[] args) {
	          new register();
	          }
 }
