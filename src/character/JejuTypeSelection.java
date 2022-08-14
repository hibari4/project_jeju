package character;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// swing 으로 갈게요
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Basic.Macro;
import intro.JejuBase;
import reservation.JejureservationInfo;

public class JejuTypeSelection extends JPanel {
	
	public JejuTypeSelection() {
		//바꿔야하는 부분이 이 클래스 입니다. 
		// 넵
		setting();
		Activity();
		Healing();
		DalcomDesert();
		reservationbtn();
		Intro(); 
		// 여기 맞나요? -네! 흠.... 안되는건 제가 어떻게 해볼게요 
		// 일단 요청하신 부분은 되었습니다.!
		generateSeperater();
	}// constructor
	
	private void generateSeperater() {		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(25, 181, 193)); // 19b5c1
		separator.setBounds(30, 130, 520, 2);
		// 혹시 아까 예약정보 버튼 아래 수평바 색상코드가 어떻게 되죠? 아근데 색상 크게 중요치 않습니다 ㅠㅠ 알겠습니다.
		this.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(25, 181, 193));
		separator_1.setBounds(30, 340, 520, 2);
		this.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(25, 181, 193));
		separator_1_1.setBounds(30, 538, 520, 2);
		this.add(separator_1_1);
	}
	  
	private void Intro() {
		//포스터 이미지
		ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/BG_JejuTypeSelcetion.png"); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		this.add(JejuMainLabel);
	}				   
	//info btn
	private void reservationbtn() {
		JButton reservationInfo = new JButton("예약 정보");
		reservationInfo.setHorizontalAlignment(SwingConstants.LEFT);
		reservationInfo.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		// 여기서 아래 디자인으로 수정하고 여기 자동으로 코드가 생성되면 그걸 이제 실제 코드에 붙여주시면 되요.
		// windows form 옛날에는 winForm 직접 띄웠다는데 저는 C# WPF 하면서 다 이렇게 개발했던 것 같긴해요
		
		reservationInfo.setBounds(30,10,324,109);
		this.add(reservationInfo);
		reservationInfo.setBorderPainted(false);
		reservationInfo.setContentAreaFilled(false);
		reservationInfo.setFocusPainted(false);
		reservationInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JejureservationInfo();
			}
		});
	}	   
	private void setting()
	{
		this.setLayout(null);
		this.setSize(Macro.g_Width, Macro.g_Height);
		this.setBackground(Color.white);
	}
	
	private void Activity()
	{
		ImageIcon select1 = new ImageIcon("./src/resource/banner/Activity.jpg");
		
		Macro.customization(select1, 520, 180);		
		JButton btnselect1 = new JButton(select1);
		
		btnselect1.setBounds(coordX, coordY,520, 180);
		this.add(btnselect1);
		
		btnselect1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jejuPlace = new JejuPlace();
				jejuPlace.Activity();
				jejuPlace.BG_Activity();			
				JejuBase.getInstance(jejuPlace);
			}});
	}
	
	
	private void Healing()
	{
		ImageIcon healingImg = new ImageIcon("./src/resource/banner/Healing.jpg");
		
	    Macro.customization(healingImg, 520, 180);
		JButton healingBtn = new JButton(healingImg);
	    healingBtn.setBounds(coordX, coordY + distanceY, 520, 180);		
	    this.add(healingBtn);
		healingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jejuPlace = new JejuPlace();
				jejuPlace.HealingTour();
				jejuPlace.BG_HealingTour();												
				JejuBase.getInstance(jejuPlace);
			}
		});
	}
	
	private void DalcomDesert()
	{
		ImageIcon cafeImg = new ImageIcon("./src/resource/banner/Cafe_Tour.jpg");
	    Macro.customization(cafeImg, 520, 180);
		
		JButton desertBtn = new JButton(cafeImg);
		desertBtn.setBounds(coordX, coordY + (distanceY * 2), 520, 180);
		desertBtn.setFont(new Font("굴림", Font.ITALIC , 30));
		
		this.add(desertBtn);
		desertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jejuPlace = new JejuPlace();
				jejuPlace.CafeTour();
				jejuPlace.BG_CafeTour();												
				JejuBase.getInstance(jejuPlace);
			}
		});
	}
	



	
	// ==========================================
	
	
	// Activity variable
	private int sizeY = 194;
	private int coordX = 30;
	private int coordY = 150;
	private int distanceY = 200;
	// Healing variable
	// Healing variable
	private JejuPlace jejuPlace;
	// Desert variable

	
}// constructor
