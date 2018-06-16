package com.zinzzam.instagram;

import java.util.ArrayList;

public class HelloWorld {
    private String id;
    private String job;
    private String motto;
    private ArrayList<String> loveProgramming;
    private ArrayList<String> interestedIn;
    private ArrayList<String> processing;
    private ArrayList<String> nowStudying;
    private String Isupport;

    HelloWorld() {
        this.id = "zinzzam";
        this.job = "PKNU Genius undergraduate";
        this.motto = "POWER MY WAY";
        this.Isupport = "WOMEN IN TECH";
        this.loveProgramming = new ArrayList<>();
        this.interestedIn = new ArrayList<>();
        this.processing = new ArrayList<>();
        this.nowStudying = new ArrayList<>();
    }

    public static void main(String[] args) {
        HelloWorld bio = new HelloWorld();
        bio.setLoveProgramming(bio.loveProgramming);
        bio.setInterestedIn(bio.interestedIn);
        bio.setProcessing(bio.processing);
        bio.setNowStudying(bio.nowStudying);

        System.out.println(bio.toString());
    }

    public void setLoveProgramming(ArrayList<String> loveProgramming) {
        loveProgramming.add("Web");
        loveProgramming.add("JavaScript");
    }

    public void setInterestedIn(ArrayList<String> interestedIn) {
        interestedIn.add("IoT");
        interestedIn.add("AI");
        interestedIn.add("Machine learning");
        interestedIn.add("Mobile");
        interestedIn.add("FinTech");
        interestedIn.add("10th Software Maestro");
    }

    public void setProcessing(ArrayList<String> processing) {
        processing.add("K-hackathon");
        processing.add("남양주 hackathon");
        processing.add("교통 데이터 공모전");
    }

    public void setNowStudying(ArrayList<String> nowStudying) {
        nowStudying.add("Java");
        nowStudying.add("Node.js");
        nowStudying.add("Android Programming");
        nowStudying.add("Google Volley API");
    }

    @Override
    public String toString() {
        return "zinzzam BIO{\n" +
                "\tinstagram ID='" + id + '\'' +
                ", \n\tjob='" + job + '\'' +
                ", \n\tmotto='" + motto + '\'' +
                ", \n\tfall in love with Programming=" + loveProgramming +
                ", \n\tinterested in nowdays=" + interestedIn +
                ", \n\tprocessing competition=" + processing +
                ", \n\tnow I'm studying=" + nowStudying +
                ", \n\tI support='" + Isupport + '\'' +
                "\n}";
    }
}
