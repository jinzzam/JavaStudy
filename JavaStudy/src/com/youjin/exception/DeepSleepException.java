package com.youjin.exception;

public class DeepSleepException extends RuntimeException{

	@Override
	public String getMessage() {
		return "하루종일 자고있음 잠만보임 쿨쿨zzZ";
	}
	
}
