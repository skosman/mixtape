package com.example.burntcd.model;

import java.util.UUID;

public class Person {

    private final UUID;
    private final String name;

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}
