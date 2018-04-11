package com.youjin.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList();
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0;i<10;i++) {
			original.add(i+"");
		}
		

		Iterator it = original.iterator();
		
		while(it.hasNext())
			copy1.add(it.next());
		
		System.out.println("Original 에서 copy1로 복사");
		System.out.println("Original = " + original);
		System.out.println("copy1 = " + copy1);
		System.out.println();
		
		it = original.iterator();		//iterator는 재사용이 안되므로 다시 얻어와야 한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("Original 에서 copy2로 이동");
		System.out.println("Original = " + original);
		System.out.println("copy2 = " + copy2);
	}

}
