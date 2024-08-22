package com.customCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private final int id;
    private final String name;
    private final List<String> hobbyList;   //mutable class

    public Student(int id, String name, List hobbyList) {
        this.id = id;
        this.name = name;
        this.hobbyList = new ArrayList<>();
        for (Object hobby: hobbyList) {
            hobbyList.add(hobby);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbyList() {
        List<String> newList = new ArrayList<>();
        for (String hobby: hobbyList) {
            newList.add(hobby);
        }
        return newList;
    }

}

public final class ImmutableClass_02 {

    public static void main(String[] args) {
    List<String> hobbies = new ArrayList<>();
    hobbies.add("swimming");
    hobbies.add("walking");
    hobbies.add("Jocking");

    Student student = new Student(1, "Gopu", hobbies);

    }
}
