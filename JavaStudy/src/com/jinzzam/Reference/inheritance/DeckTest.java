package com.youjin.inheritance;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한 벌 (Deck)을 만든다.
		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c); // c = c.toString() //출력
		d.shuffle(); // 카드 셔플
		c = d.pick(0); // 또 제일 위의 카드를 뽑는다.
		System.out.println(c); // 출력
	}
}
