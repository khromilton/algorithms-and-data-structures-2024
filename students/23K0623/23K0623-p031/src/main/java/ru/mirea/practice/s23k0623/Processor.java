package ru.mirea.practice.s23k0623;

public class Processor {
    int key;
    String name;
    double clockFrequency;
    int cacheSize;
    double busFrequency;
    int specInt;
    int specFp;

    public Processor(int key, String name, double clockFrequency, int cacheSize, double busFrequency, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.clockFrequency = clockFrequency;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specInt = specInt;
        this.specFp = specFp;
    }
}
