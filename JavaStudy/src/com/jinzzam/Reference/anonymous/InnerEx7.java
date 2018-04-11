package com.youjin.anonymous;

import java.awt.Button;
import java.beans.EventHandler;
import java.awt.*;
import java.awt.event.*;

public class InnerEx7 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}


//b.addActionListener(new EventHandler()); 이라고 작성했을 때
//addActionListener에 에러가 나는 이유???ㅠㅠ

