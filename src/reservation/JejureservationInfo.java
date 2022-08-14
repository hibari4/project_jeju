package reservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JFrame;

import Basic.Hotels;
import Basic.Macro;
import character.JejuPlace;

public class JejureservationInfo extends JFrame{

public JejureservationInfo() {
	JFrame();
}

private void JFrame() {
	fr = new JFrame("Reservation Info");
	fr.setSize(500,280);
	fr.setLocation(1250, 200);
	fr.setVisible(true);
	fr.getContentPane().setLayout(null);
	Hotels hotel = Hotels.getInstance();
	
	TextArea info=new TextArea("", 0, 0,TextArea.SCROLLBARS_NONE);
	if(hotel.reservationed() == false) {
		info.setText("예약정보가 없습니다.!!!");
	}
	else {
	info.setText(hotel.hotelInfo());
	}
	info.setEditable(false);
	info.setFocusable(false);
	info.setFont(new Font("Adobe 고딕 Std B", Font.BOLD, 15));
	info.setBackground(Color.LIGHT_GRAY);
	info.setBounds(10, 10, 460, 220);
	info.setEnabled(false);
	fr.add(info);
}


	private int sizeY = 194;
	private int coordX = 0;
	private int coordY = 150;
	private int distanceY = 200;

	//frame
	private JFrame fr;
}
