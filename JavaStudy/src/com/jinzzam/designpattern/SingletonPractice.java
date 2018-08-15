package com.jinzzam.designpattern;

public class SingletonPractice {
    private static SingletonPractice instance;

    private SingletonPractice() {

    }

    public static SingletonPractice getInstance() {
        if (instance == null) {
            instance = new SingletonPractice();
        }
        return instance;
    }
}
