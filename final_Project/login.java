package final_Project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class loginc extends JFrame {
	public loginc() {
		setLayout(null);
		JButton jb1 = new JButton("로그인");
		jb1.setBounds(0, 0, 100, 50); 
		JButton jb2 = new JButton("회원가입");
		jb2.setBounds(100, 0, 100, 50); 
		add(jb1);
		add(jb2);
		jb1.addActionListener(new loginevent());
		jb2.addActionListener(new registerevent());
		setTitle("신라무비");
		setSize(212,85);
		setVisible(true);
	}

	class loginevent implements ActionListener{
		public loginevent() {
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new register();
		}
	}

	class registerevent implements ActionListener{
		public registerevent() {
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new register2();
		}	
	}
}
public class login {

	public static void main(String[] args) {
		new loginc();

	}

}