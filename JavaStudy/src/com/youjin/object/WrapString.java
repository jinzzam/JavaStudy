package com.youjin.object;

public class WrapString {
	String str;

	public WrapString(String str) {
		this.str = str;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.str.equals(((WrapString) obj).str)) {
			return true;
		}
		return false;
	}

}
