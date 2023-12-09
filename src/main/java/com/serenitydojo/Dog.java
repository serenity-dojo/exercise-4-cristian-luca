package com.serenitydojo;

public class Dog {
    private String name;
    private String toy;
    private int age;

    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";
    public Dog(String name, String toy, int age) {
        this.name = name;
        this.toy = toy;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteToy() {
        return toy;

    }

    public String makeNoise() {
        return DOG_NOISE;
    }


    public boolean isFed() {
        return isFed;
    }
    public void feed() {
        this.isFed = true;
    }
}
