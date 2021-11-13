package com.pb.korotkaya.hw7;

public enum Size {

    XXS("Child size. ", 32),
    XS("Adult size. ", 34),
    S("Adult size. ", 36),
    M("Adult size. ", 38),
    L("Adult size. ", 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return description;
    }
    public int getEuroSize(){
        return euroSize;
    }
}
