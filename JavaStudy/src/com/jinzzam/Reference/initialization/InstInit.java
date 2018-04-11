package com.youjin.initialization;

public class InstInit {
	String color;
	String gearType;
	int count = 0;
	int serialNo;
	
	{
		count++;
		serialNo = count;
	}
	
	InstInit(){
//		count++;
//		serialNo = count;
		color = "white";
		gearType = "Auto";
	}
	
	InstInit(String color, String gearType){
//		count++;
//		serialNo = count;
		this.color = color;
		this.gearType = gearType;
	}
}
