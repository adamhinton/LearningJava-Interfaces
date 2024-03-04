package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();

    }
}

interface FlightEnabled{

}

interface Trackable{}

abstract class Animal{};

class Bird extends Animal implements FlightEnabled, Trackable{

}