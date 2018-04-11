package com.youjin.inheritance;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Heffffllo World!");
		ctv.caption = true;
		ctv.displayCaption("Hdasello World!");
	}

}
//
