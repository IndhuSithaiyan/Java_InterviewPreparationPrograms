package com.customCreation;

import java.util.Comparator;

/**
 * Rules to make a class immutable
 *
 * To make a class immutable, we need to follow these rules:
 * Declare the class as final so it can’t be extended.
 * Make all fields private so that direct access is not allowed.
 * Don’t provide setter methods for variables
 * Make all mutable fields final so that it’s value can be assigned only once.
 * Initialize all the fields via a constructor performing a deep copy.
 * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */

class Voter{
    int age;
    public Voter(int age) {
        this.age = age;
    }
}

class PersonPOJO{
    private final int id;
    private final String name;
    private final Voter vote;   //mutable class

    public PersonPOJO(int id, String name, Voter vote) {
        this.id = id;
        this.name = name;
        Voter vote1 = new Voter(vote.age);
        this.vote = new Voter(vote.age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Voter getVote() {
        return vote;
    }
}

public final class ImmutableClass_01 {
    public static void main(String[] args) {

        // mutable - object value is reassigned
        Voter voter = new Voter(17);
        System.out.println(voter.age);
        voter.age = 50;
        System.out.println(voter.age);

        PersonPOJO p = new PersonPOJO(1,"Indu", voter);
        System.out.println(voter.age);
        System.out.println(p.getName());
    }
}
