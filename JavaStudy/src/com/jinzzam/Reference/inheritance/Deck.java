package com.youjin.inheritance;

public class Deck {
	final int CARD_NUM = 52;
	Card c[] = new Card[CARD_NUM];

	Deck() {
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 1; n < Card.NUM_MAX + 1; n++) {
				c[i++] = new Card(k, n);
			}
		}
	}

	Card pick(int index) {
		if (0 <= index && index < CARD_NUM)
			return c[index];
		else
			return pick();
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM); // 카드 인덱스 랜덤 선택
		return pick(index);
	}

	void shuffle() {
		for (int n = 0; n < 1000; n++) {
			int i = (int) (Math.random() * CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
	}
}
