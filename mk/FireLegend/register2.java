package FireLegend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class register2 extends Frame{
	   
    JLabel lblId, lblPwd, lblName, lblHp, lblGen,lblAddr,lblAge ;
    JTextField txtId, txtPwd, txtName;
    JTextField txtHp;
    JRadioButton cbMale,cbFeMale;
    JTextField txtAddr,txtAge;
    JButton btnSubmit, btnCancel;
    String strid,strpwd,strname,strhp,strgen,straddr,strage;
  
    public register2() {
         setLayout(null);
         lblId =new JLabel("아이디");
         lblPwd=new JLabel("패스워드");
         lblName=new JLabel("이름");
         lblHp=new JLabel("핸드폰");
         lblGen=new JLabel("성별");
         lblAddr=new JLabel("주소");
         lblAge =new JLabel("나이");
        
         lblId.setBounds(20, 50, 100, 20);
         lblPwd.setBounds(20, 80, 100, 20);
         lblName.setBounds(20, 110, 100, 20);
         lblHp.setBounds(20, 140, 100 , 20);
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
        
         txtId =new JTextField(20);
         txtPwd =new JTextField(20);
         txtName= new JTextField(20);
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
         //btnCancel.setSize(150, 40 );
         //btnSubmit.setSize(150, 40);
        
         txtId.setBounds(120, 50, 150, 20);
         txtPwd.setBounds(120, 80, 150, 20);
         txtName.setBounds(120, 110, 150, 20);
         txtHp.setBounds(120, 140, 150,20);
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
	                strpwd = txtPwd.getText();
	                strname = txtName.getText();
	                strhp = txtHp.getText();
	            	if(cbMale.isSelected()) {
	                	strgen = cbMale.getText();
	                }else if(cbFeMale.isSelected()) {
	                	strgen = cbFeMale.getText();
	                }
	            	straddr = txtAddr.getText();
	            	strage = txtAge.getText();
	            	String cid ="";
	            	if(strid == null || strid.isEmpty()) cid += "아이디 ";
	            	if(strpwd == null || strpwd.isEmpty()) cid += "비밀번호 ";
	            	if(strname == null || strname.isEmpty()) cid += "이름 ";
	            	if(strhp == null || strhp.isEmpty()) cid += "전화번호 ";
	            	if(straddr == null || straddr.isEmpty()) cid += "주소 ";
	            	if(strage == null || strage.isEmpty()) cid += "나이 ";
	            	if(cid.isEmpty()) {
	            		setVisible(false);
	            		new loginc();
	            	}else {
	            		cid += "를 입력하셔야 회원가입완료 됩니다.";
	            		JOptionPane.showMessageDialog(register2.this,cid);
	            	}
	            }
	        });
         btnCancel.addActionListener(new cancelevent());
      
         setTitle("회원가입");
         setSize(370, 320);
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
         new register2();
    }  
}
