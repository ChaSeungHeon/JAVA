package FireLegend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieage extends JFrame {
	JLabel movieTitle,teenager,adult,old,hurt;
	JLabel[] money = new JLabel[4];
	JButton[] teenagerb = new JButton[5];
	JButton[] adultb = new JButton[5];
	JButton[] oldb = new JButton[5];
	JButton[] hurtb = new JButton[5];
	JButton cancelbtn;
	String strteenager,stradult,strold,strhurt;
	int numteenager,numadult,numold,numhurt,teenagermoney,adultmoney,oldmoney,hurtmoney;
	int[] nummoney = {10000,14000,7000,5000};
	int cnum;
	String CheckTime,moviename;
		public movieage(int cnum,String CheckTime,String moviename) {
		this.cnum = cnum;
		this.CheckTime = CheckTime;
		this.moviename = moviename;
		setLayout(null);
		int setbtn = 130;
		movieTitle = new JLabel("나이와 인원을 선택하십시오.");
		movieTitle.setFont((movieTitle).getFont().deriveFont(20.0f));
		movieTitle.setBounds(100,30,300,100);
		add(movieTitle);
		
		teenager = new JLabel("청소년");
		teenager.setBounds(50,130,50,50);
		add(teenager);
		for (int i=0;i<teenagerb.length;i++) {
			teenagerb[i] = new JButton(""+(i+1));
			teenagerb[i].setBounds(setbtn,130,50,50);
			add(teenagerb[i]);
			setbtn += 50;
		}
		
		setbtn = 130;
		adult = new JLabel("성인");
		adult.setBounds(50,180,50,50);
		add(adult);
		for (int i=0;i<adultb.length;i++) {
			adultb[i] = new JButton(""+(i+1));
			adultb[i].setBounds(setbtn,180,50,50);
			add(adultb[i]);
			setbtn += 50;
		}
		
		setbtn = 130;
		old = new JLabel("경로");
		old.setBounds(50,230,50,50);
		add(old);
		for (int i=0;i<oldb.length;i++) {
			oldb[i] = new JButton(""+(i+1));
			oldb[i].setBounds(setbtn,230,50,50);
			add(oldb[i]);
			setbtn += 50;
		}
		
		setbtn = 130;
		hurt = new JLabel("우대");
		hurt.setBounds(50,280,50,50);
		add(hurt);
		for (int i=0;i<hurtb.length;i++) {
			hurtb[i] = new JButton(""+(i+1));
			hurtb[i].setBounds(setbtn,280,50,50);
			add(hurtb[i]);
			setbtn += 50;
		}
		
		cancelbtn = new JButton("뒤로가기");
		cancelbtn.setBounds(200,370,100,50);
		add(cancelbtn);
		
		int setseat = 130;
		for (int i=0;i<money.length;i++) {
			money[i] = new JLabel("인당"+nummoney[i]+"원");
			money[i].setBounds(400,setseat,100,50);
			add(money[i]);
			setseat += 50;
		}
		for (int i=0;i<teenagerb.length;i++) {
			final int selectedNum = i;
			teenagerb[i].addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	teenagerb[selectedNum].setBackground(Color.YELLOW);
	            	strteenager = "청소년";
	                numteenager = selectedNum+1;
	                teenagermoney = numteenager*nummoney[0];
	                JOptionPane.showMessageDialog(movieage.this,strteenager+" "+numteenager+"명\n총 : "+teenagermoney+"원 입니다.");
	                setVisible(false);
	                new movieseat(cnum,CheckTime,moviename,strteenager,numteenager,teenagermoney);
	            }
	        });
			adultb[i].addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	adultb[selectedNum].setBackground(Color.YELLOW);
	            	stradult = "어른";
	            	numadult = selectedNum+1;
	            	adultmoney = numadult*nummoney[1];
	            	JOptionPane.showMessageDialog(movieage.this,stradult+" "+numadult+"명\n총 : "+adultmoney+"원 입니다.");
	            	setVisible(false);
	            	new movieseat(cnum,CheckTime,moviename,stradult,numadult,adultmoney);
	            }
	        });
			oldb[i].addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	oldb[selectedNum].setBackground(Color.YELLOW);
	            	strold = "경로";
	            	numold = selectedNum+1;
	            	oldmoney = numold*nummoney[2];
	            	JOptionPane.showMessageDialog(movieage.this,strold+" "+numold+"명\n총 : "+oldmoney+"원 입니다.");
	            	setVisible(false);
	            	new movieseat(cnum,CheckTime,moviename,strold,numold,oldmoney);
	            }
	        });
			hurtb[i].addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	hurtb[selectedNum].setBackground(Color.YELLOW);
	            	strhurt = "우대";
	            	numhurt = selectedNum+1;
	            	hurtmoney = numhurt*nummoney[3];
	            	JOptionPane.showMessageDialog(movieage.this,strhurt+" "+numhurt+"명\n총 : "+hurtmoney+"원 입니다.");
	            	setVisible(false);
	            	new movieseat(cnum,CheckTime,moviename,strhurt,numhurt,hurtmoney);
	            }
	        });
		}
		
		cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            	new moviereservation();
            }
        });
		
		setTitle("신라무비");
		setSize(500,500);
		setVisible(true);
	}
	}