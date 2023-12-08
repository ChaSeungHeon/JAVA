package FireLegend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieseat extends JFrame {
	JLabel movieTitle,Screen;
	JLabel[] seatllb = new JLabel[6];
	JLabel[] seatrlb = new JLabel[6];
	JButton[] seatbtn1 = new JButton[5];
	JButton[] seatbtn2 = new JButton[5];
	JButton[] seatbtn3 = new JButton[5];
	JButton[] seatbtn4 = new JButton[5];
	JButton[] seatbtn5 = new JButton[5];
	JButton[] seatbtn6 = new JButton[5];
	JButton okbtn,cancelbtn;
	String cseat[];
	char start;
	int cnum,nop,selectedSeats,moviemoney;
	String CheckTime,moviename,age,strseat;
	Color ccolor;
	public movieseat(int cnum,String CheckTime,String moviename,String age,int nop,int moviemoney){
		this.cnum = cnum;
		this.CheckTime = CheckTime;
		this.moviename = moviename;
		this.age = age;
		this.nop = nop;
		this.moviemoney = moviemoney;
		start = 'A';
		cseat = new String[nop];
		strseat = "선택하신 좌석은 : ";
		selectedSeats = 0;
		ccolor = Color.GRAY;
		setLayout(null);
		
		movieTitle = new JLabel("좌석을 선택하십시오.");
		movieTitle.setFont(movieTitle.getFont().deriveFont(30.0f));
		movieTitle.setBounds(130,50,300,50);
		add(movieTitle);
		
		Screen = new JLabel("스크린");
		Screen.setFont(Screen.getFont().deriveFont(30.0f));
		Screen.setBounds(220, 130, 300, 50);
		add(Screen);
		int height = 180;
		for (int i=0;i<seatllb.length;i++) {
			seatllb[i] = new JLabel((char)(start+i)+"열");
			seatllb[i].setBounds(30,height,50,50);
			add(seatllb[i]);
			height += 50;
		}
		
		start = 'A';
		height = 180;
		for (int i=0;i<seatrlb.length;i++) {
			seatrlb[i] = new JLabel((char)(start+i)+"열");
			seatrlb[i].setBounds(470,height,50,50);
			add(seatrlb[i]);
			height += 50;
		}
		int right = 60;
		for (int i=0;i<seatbtn1.length;i++) {
			seatbtn1[i] = new JButton("A0"+(i+1));
			seatbtn1[i].setBounds(right,180,80,50);
			add(seatbtn1[i]);
			right += 80;
		}
		
		right = 60;
		for (int i=0;i<seatbtn2.length;i++) {
			seatbtn2[i] = new JButton("B0"+(i+1));
			seatbtn2[i].setBounds(right,230,80,50);
			add(seatbtn2[i]);
			right += 80;
		}
		right = 60;
		for (int i=0;i<seatbtn3.length;i++) {
			seatbtn3[i] = new JButton("C0"+(i+1));
			seatbtn3[i].setBounds(right,280,80,50);
			add(seatbtn3[i]);
			right += 80;
		}
		
		right = 60;
		for (int i=0;i<seatbtn4.length;i++) {
			seatbtn4[i] = new JButton("D0"+(i+1));
			seatbtn4[i].setBounds(right,330,80,50);
			add(seatbtn4[i]);
			right += 80;
		}
		
		right = 60;
		for (int i=0;i<seatbtn5.length;i++) {
			seatbtn5[i] = new JButton("E0"+(i+1));
			seatbtn5[i].setBounds(right,380,80,50);
			add(seatbtn5[i]);
			right += 80;
		}
		
		right = 60;
		for (int i=0;i<seatbtn6.length;i++) {
			seatbtn6[i] = new JButton("F0"+(i+1));
			seatbtn6[i].setBounds(right,430,80,50);
			add(seatbtn6[i]);
			right += 80;
		}
		
		okbtn = new JButton("선택완료");
		okbtn.setBounds(160,500,100,50);
		add(okbtn);
		
		cancelbtn = new JButton("취소");
		cancelbtn.setBounds(270,500,100,50);
		add(cancelbtn);
		
		setTitle("신라무비");
		setSize(550,600);
		setVisible(true);
		
		for (int i=0;i<seatbtn1.length;i++) {
			final int selectedNum = i;
			seatbtn1[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	if (seatbtn1[selectedNum].getBackground() == ccolor) {
                		seatbtn1[selectedNum].setBackground(null);
                		for (int i=0;i<cseat.length;i++) {
                			if (cseat[i] != null && cseat[i].equals(seatbtn1[selectedNum].getText())) {
                				cseat[i] = null;
                				selectedSeats = i;
                				strseat = "선택하신 좌석은 : ";
                				for(int j=i;j<cseat.length-1;j++) { 
                					if (cseat[j+1] != null) {
                						cseat[j] = cseat[j+1];
                						cseat[j+1] = null;
                					}
                				}
                			}
                		}
                	}
                	else {
                		if (selectedSeats < nop) {
                			seatbtn1[selectedNum].setBackground(Color.GRAY);
                			cseat[selectedSeats] = seatbtn1[selectedNum].getText();
                			selectedSeats++;
                		}

                		if (selectedSeats == nop) {
                			for (int i=0;i<cseat.length;i++)strseat += cseat[i] + " ";
                			strseat += " 입니다.";	
                			selectedSeats++;
                			JOptionPane.showMessageDialog(movieseat.this, strseat);
                		} else if (selectedSeats > nop) {
                			JOptionPane.showMessageDialog(movieseat.this, "선택하신 인원보다 더 많은 좌석을 선택하고 계십니다.");
                		}
                	}
                }
            });
			seatbtn2[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	if (seatbtn2[selectedNum].getBackground() == ccolor) {
                		seatbtn2[selectedNum].setBackground(null);
                		for (int i=0;i<cseat.length;i++) {
                			if (cseat[i] != null && cseat[i].equals(seatbtn2[selectedNum].getText())) {
                				cseat[i] = null;
                				selectedSeats = i;
                				strseat = "선택하신 좌석은 : ";
                				for(int j=i;j<cseat.length-1;j++) { 
                					if (cseat[j+1] != null) {
                						cseat[j] = cseat[j+1];
                						cseat[j+1] = null;
                					}
                				}
                			}
                		}
                	}
                	else {
                		if (selectedSeats < nop) {
                			seatbtn2[selectedNum].setBackground(Color.GRAY);
                			cseat[selectedSeats] = seatbtn2[selectedNum].getText();
                			selectedSeats++;
                		}

                		if (selectedSeats == nop) {
                			for (int i=0;i<cseat.length;i++)strseat += cseat[i] + " ";
                			strseat += " 입니다.";
                			selectedSeats++;
                			JOptionPane.showMessageDialog(movieseat.this, strseat);
                		} else if (selectedSeats > nop) {
                			JOptionPane.showMessageDialog(movieseat.this, "선택하신 인원보다 더 많은 좌석을 선택하고 계십니다.");
                		}
                	}
                }
            });
			seatbtn3[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	if (seatbtn3[selectedNum].getBackground() == ccolor) {
                		seatbtn3[selectedNum].setBackground(null);
                		for (int i=0;i<cseat.length;i++) {
                			if (cseat[i] != null && cseat[i].equals(seatbtn3[selectedNum].getText())) {
                				cseat[i] = null;
                				selectedSeats = i;
                				strseat = "선택하신 좌석은 : ";
                				for(int j=i;j<cseat.length-1;j++) { 
                					if (cseat[j+1] != null) {
                						cseat[j] = cseat[j+1];
                						cseat[j+1] = null;
                					}
                				}
                			}
                		}
                	}
                	else {
                		if (selectedSeats < nop) {
                			seatbtn3[selectedNum].setBackground(Color.GRAY);
                			cseat[selectedSeats] = seatbtn3[selectedNum].getText();
                			selectedSeats++;
                		}

                		if (selectedSeats == nop) {
                			for (int i=0;i<cseat.length;i++)strseat += cseat[i] + " ";
                			strseat += " 입니다.";
                			selectedSeats++;
                			JOptionPane.showMessageDialog(movieseat.this, strseat);
                		} else if (selectedSeats > nop) {
                			JOptionPane.showMessageDialog(movieseat.this, "선택하신 인원보다 더 많은 좌석을 선택하고 계십니다.");
                		}
                	}
                }
            });
			seatbtn4[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	if (seatbtn4[selectedNum].getBackground() == ccolor) {
                		seatbtn4[selectedNum].setBackground(null);
                		for (int i=0;i<cseat.length;i++) {
                			if (cseat[i] != null && cseat[i].equals(seatbtn4[selectedNum].getText())) {
                				cseat[i] = null;
                				selectedSeats = i;
                				strseat = "선택하신 좌석은 : ";
                				for(int j=i;j<cseat.length-1;j++) { 
                					if (cseat[j+1] != null) {
                						cseat[j] = cseat[j+1];
                						cseat[j+1] = null;
                					}
                				}
                			}
                		}
                	}
                	else {
                		if (selectedSeats < nop) {
                			seatbtn4[selectedNum].setBackground(Color.GRAY);
                			cseat[selectedSeats] = seatbtn4[selectedNum].getText();
                			selectedSeats++;
                		}

                		if (selectedSeats == nop) {
                			for (int i=0;i<cseat.length;i++)strseat += cseat[i] + " ";
                			strseat += " 입니다.";
                			selectedSeats++;
                			JOptionPane.showMessageDialog(movieseat.this, strseat);
                		} else if (selectedSeats > nop) {
                			JOptionPane.showMessageDialog(movieseat.this, "선택하신 인원보다 더 많은 좌석을 선택하고 계십니다.");
                		}
                	}
                }
            });
			seatbtn5[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	if (seatbtn5[selectedNum].getBackground() == ccolor) {
                		seatbtn5[selectedNum].setBackground(null);
                		for (int i=0;i<cseat.length;i++) {
                			if (cseat[i] != null && cseat[i].equals(seatbtn5[selectedNum].getText())) {
                				cseat[i] = null;
                				selectedSeats = i;
                				strseat = "선택하신 좌석은 : ";
                				for(int j=i;j<cseat.length-1;j++) { 
                					if (cseat[j+1] != null) {
                						cseat[j] = cseat[j+1];
                						cseat[j+1] = null;
                					}
                				}
                			}
                		}
                	}
                	else {
                		if (selectedSeats < nop) {
                			seatbtn5[selectedNum].setBackground(Color.GRAY);
                			cseat[selectedSeats] = seatbtn5[selectedNum].getText();
                			selectedSeats++;
                		}

                		if (selectedSeats == nop) {
                			for (int i=0;i<cseat.length;i++)strseat += cseat[i] + " ";
                			strseat += " 입니다.";
                			selectedSeats++;
                			JOptionPane.showMessageDialog(movieseat.this, strseat);
                		} else if (selectedSeats > nop) {
                			JOptionPane.showMessageDialog(movieseat.this, "선택하신 인원보다 더 많은 좌석을 선택하고 계십니다.");
                		}
                	}
                }
            });
			seatbtn6[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	if (seatbtn6[selectedNum].getBackground() == ccolor) {
                		seatbtn6[selectedNum].setBackground(null);
                		for (int i=0;i<cseat.length;i++) {
                			if (cseat[i] != null && cseat[i].equals(seatbtn6[selectedNum].getText())) {
                				cseat[i] = null;
                				selectedSeats = i;
                				strseat = "선택하신 좌석은 : ";
                				for(int j=i;j<cseat.length-1;j++) { 
                					if (cseat[j+1] != null) {
                						cseat[j] = cseat[j+1];
                						cseat[j+1] = null;
                					}
                				}
                			}
                		}
                	}
                	else {
                		if (selectedSeats < nop) {
                			seatbtn6[selectedNum].setBackground(Color.GRAY);
                			cseat[selectedSeats] = seatbtn6[selectedNum].getText();
                			selectedSeats++;
                		}

                		if (selectedSeats == nop) {
                			for (int i=0;i<cseat.length;i++)strseat += cseat[i] + " ";
                			strseat += " 입니다.";
                			selectedSeats++;
                			JOptionPane.showMessageDialog(movieseat.this, strseat);
                		} else if (selectedSeats > nop) {
                			JOptionPane.showMessageDialog(movieseat.this, "선택하신 인원보다 더 많은 좌석을 선택하고 계십니다.");
                		}
                	}
                }
            });
		}
		
		okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            		if (cseat[cseat.length-1] != null) {
            			JOptionPane.showMessageDialog(movieseat.this, strseat);
                    	setVisible(false);
                    	new Checking(cnum,CheckTime,moviename,age,nop,cseat,moviemoney);
            		}else JOptionPane.showMessageDialog(movieseat.this, "설정하신 인원보다 적은 좌석을 선택하셧습니다.\n좌석을 선택해주십시오.");
            }
        });
		
		cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            	new movieage(cnum,CheckTime,moviename);
            }
        });
	}
}
