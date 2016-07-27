package com.client;

import java.awt.*;
import javax.swing.*;

class Room extends Frame{
	//WaitingRoom wr;
	TextArea ta;
	List list;
	TextField tf;
	JButton b;
	String id;
	String rn;
	Room(String name, String rn) {
		super(name+"님의 채팅창"+"   방제목 :"+rn);
		this.rn=rn;
		id=name;
		ta = new TextArea();
		ta.enable(false);
		ta.setBackground(Color.WHITE);
		ta.setForeground(Color.black);
		list = new List();
		tf = new TextField();
		b = new JButton("나가기");

		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		
		p1.add(ta);
		p1.add(list, "East");
		p2.add(tf);
		p2.add(b, "East");
		add(p1);
		add(p2, "South");
		
	}
}