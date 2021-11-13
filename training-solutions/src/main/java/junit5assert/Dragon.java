package main.java.junit5assert;

public class Dragon {
    private String name;
    private int numberOfHeads;
    private double height;

    public Dragon(String name, int numberOfHeads, double height) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfHeads() {
        return this.numberOfHeads;
    }

    public double getHeight() {
        return this.height;
    }
}
