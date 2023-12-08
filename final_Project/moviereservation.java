package final_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class moviereservation extends JFrame{
	ImageIcon i1,i3,imc1,imc3;
	JLabel ij1,ij2,ij3,jl1,jl2,jl3;
	JLabel[] jmt = new JLabel[6];
	JButton[] jb = new JButton[6];
	JLabel[] jl = new JLabel[6];
	Image ic1,icm1,ic3,icm3;
	JButton cancelbtn;
	String moviename,CheckTime;
	int cnum;
	public moviereservation() {
		setLayout(null);
		i1 = new ImageIcon("abouttime.jpg");
		i3 = new ImageIcon("eternal.jpg");
		
		ic1 = i1.getImage();
		icm1 = ic1.getScaledInstance(200, 250, java.awt.Image.SCALE_SMOOTH);
		imc1 = new ImageIcon(icm1);
		
		
		ic3 = i3.getImage();
		icm3 = ic3.getScaledInstance(200, 250, java.awt.Image.SCALE_SMOOTH);
		imc3 = new ImageIcon(icm3);
		
		ij1 = new JLabel();
        ij2 = new JLabel();
        ij3 = new JLabel();
        
		ij1.setIcon(imc1);
		ij3.setIcon(imc3);
		
		jl1 = new JLabel("어바웃 타임");
		jl1.setFont(jl1.getFont().deriveFont(20.0f));
		jl3 = new JLabel("이터널 션사인");
		jl3.setFont(jl3.getFont().deriveFont(20.0f));
		
		jb[0] = new JButton("09:20 ~ 10:53");
		jb[1] = new JButton("13:40 ~ 15:02");
		jb[2] = new JButton("16:30 ~ 18:00");
		jb[3] = new JButton("09:20 ~ 10:53");
		jb[4] = new JButton("13:40 ~ 15:02");
		jb[5] = new JButton("16:30 ~ 18:00");
		
		for (int i=0;i<jl.length;i++) jl[i] = new JLabel("30석");
		
		for (int i=0;i<jmt.length;i++) jmt[i] = new JLabel((i+1)+"관");
		
		cancelbtn = new JButton("돌아가기");
		
		ij1.setBounds(50,50,200,250);
		jl1.setBounds(300,50,150,100);
		ij3.setBounds(50,500,200,250);
		jl3.setBounds(300,500,150,100);
		jb[0].setBounds(300,150,150,100);
		jl[0].setBounds(360,210,150,100);
		jmt[0].setBounds(360,90,150,100);
		jb[1].setBounds(450,150,150,100);
		jl[1].setBounds(510,210,150,100);
		jmt[1].setBounds(510,90,150,100);
		jb[2].setBounds(600,150,150,100);
		jl[2].setBounds(660,210,150,100);
		jmt[2].setBounds(660,90,150,100);
		jb[3].setBounds(300,650,150,100);
		jl[3].setBounds(360,710,150,100);
		jmt[3].setBounds(360,590,150,100);
		jb[4].setBounds(450,650,150,100);
		jl[4].setBounds(510,710,150,100);
		jmt[4].setBounds(510,590,150,100);
		jb[5].setBounds(600,650,150,100);
		jl[5].setBounds(660,710,150,100);
		jmt[5].setBounds(660,590,150,100);
		cancelbtn.setBounds(400,850,100,50);
		
		add(ij1);
		add(jl1);
		add(ij3);
		add(jl3);
		for(int i=0;i<jb.length;i++) {
			add(jb[i]);
			add(jl[i]);
			add(jmt[i]);
		}
		for (int i=0;i<jb.length;i++) {
			final int selectedNum = i;
			jb[i].addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	if (selectedNum < 3) moviename = "어바웃타임";
	            	else moviename = "이터널션샤인";
	            	if (selectedNum == 0 || selectedNum == 3) CheckTime = "09:20 ~ 10:53";
	            	else if(selectedNum == 1 || selectedNum == 4) CheckTime = "13:40 ~ 15:02";
	            	else if (selectedNum == 2 || selectedNum == 5) CheckTime = "16:30 ~ 18:00";
	            	cnum = selectedNum+1;
	            	JOptionPane.showMessageDialog(moviereservation.this,"관 : "+cnum+"관"+"\n시간 : "+CheckTime+"\n영화 제목 : "+moviename);
	            	setVisible(false);
	            	new movieage(cnum,CheckTime,moviename);
	            }
	        });
		}
		add(cancelbtn);
		cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            	new Reservation_details();
            }
        });
		
		setTitle("신라무비");
		setSize(1000,950);
		setVisible(true);
	}
	public static void main(String[] args) {
        new moviereservation();
   }
}