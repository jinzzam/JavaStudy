package com.youjin.exception;

public class EatPoisonException extends Exception{

	@Override
	public String getMessage() {
		return "큰일!!! 독을 먹어버림!!!;;";
	}
	
}
